package edu.gatech.ir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class SearchFiles {

	private SearchFiles() {}
	
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("There must be 1 arguments: ");
			System.out.println("      arg[0], the path to store failures' info");
			return;
		}
		
		String fileName = args[0];
		String index = "index";
	    String field = "contents";
	    String queryString = null;
	    int maxHits = 10;
	    
	    IndexReader reader;
		try {
			reader = IndexReader.open(FSDirectory.open(new File(index)));
		    IndexSearcher searcher = new IndexSearcher(reader);
		    Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_31);
		    QueryParser parser = new QueryParser(Version.LUCENE_31, field, analyzer);
		    
		    BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
		    String line;
		    
		    while ((line = in.readLine()) != null) {
		        if(line.contains("A new failure starts.")){
		        	line = in.readLine();
		        	System.out.println("Original string is: " + line);
		        	line = line.replace(":", " ");
		        	line = line.replace("\"", " ");
		        	line = line.replace("[", "(");
		        	line = line.replace("]", ")");
		        	line = line.replace("{", "(");
		        	line = line.replace("}", ")");
		        	line = line.replace("()", "");
		        	System.out.println("Processed string is: " + line);
		        	
		        	Query query = parser.parse(line);
				    System.out.println("Searching for: " + query.toString(field));
				    
				    TopDocs results = searcher.search(query, 5 * maxHits);
				    ScoreDoc[] hits = results.scoreDocs;
				    System.out.println("Get: " + hits.length + " results");
				    
				    for (int i = 0; i < hits.length; i++) {
				        Document doc = searcher.doc(hits[i].doc);
				       	String filename = doc.get("filename");
				       	
				       	System.out.println("doc="+hits[i].doc+" score="+hits[i].score + " name="+filename);
				    }
		        }
		    }
		    searcher.close();
		    reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
IndexReader reader;
		try {
			reader = IndexReader.open(FSDirectory.open(new File(index)));
		    IndexSearcher searcher = new IndexSearcher(reader);
		    Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_31);
		    QueryParser parser = new QueryParser(Version.LUCENE_31, field, analyzer);
		    
		    BufferedReader in = null;
		    if (queryString != null) {
		    	in = new BufferedReader(new InputStreamReader(
		    			new FileInputStream(queryString), "UTF-8"));
		    } else {
		    	in = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
		    }
		    
		    while (true) {
		        if (queryString == null) {                        // prompt the user
		          System.out.println("Enter query: ");
		        }

		        String line = queryString != null ? queryString : in.readLine();

		        if (line == null || line.length() == -1) {
		          break;
		        }

		        line = line.trim();
		        if (line.length() == 0) {
		          break;
		        }
			    Query query = parser.parse(line);
			    System.out.println("Searching for: " + query.toString(field));
			    
			    TopDocs results = searcher.search(query, 5 * maxHits);
			    ScoreDoc[] hits = results.scoreDocs; 
*/