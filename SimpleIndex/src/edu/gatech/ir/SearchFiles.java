package edu.gatech.ir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

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
	
	static String index = "index";
    static String field = "contents";
    static int maxHits = 20;
    
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println("There must be at least 1 arguments: ");
			System.out.println("      arg[0], the path to store failures' info");
			
			System.out.println("Optional arguments: ");
			System.out.println("      arg[1], the file to store results");
			System.out.println("      arg[2], whether to combine multi bug reports" +
									" together for IR, default set to FALSE");
			System.out.println("      arg[3], whether to use exception info to query," +
									" default set to TRUE");
			return;
		}
		
		String fileName = args[0];
		String resFile = (args.length > 1 && args[1] != null) ? args[1] : null;
		boolean combineMulBugRep = (args.length > 2 && args[2] != null && args[2].equals("true")) 
										? true : false;
		boolean useExpInfo = (args.length > 3 && args[3] != null && args[3].equals("false")) 
				? false : true;
		
	    IndexReader reader;
		try {
			reader = IndexReader.open(FSDirectory.open(new File(index)));
		    IndexSearcher searcher = new IndexSearcher(reader);
		    Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_31);
		    QueryParser parser = new QueryParser(Version.LUCENE_31, field, analyzer);
		    
		    BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
		    String line, allLines = "";
		    PrintWriter writer = null;
		    if(resFile != null)writer = new PrintWriter(new File(resFile));
		    
		    while ((line = in.readLine()) != null) {
		    	if(!useExpInfo) allLines += line;
		    	else if(line.contains("A new failure starts")){
		        	line = in.readLine();
		        	if(combineMulBugRep) allLines += line + "\n";
		        	else queryIR(line, parser, searcher, writer);
		        }
		    }
		    if(combineMulBugRep || !useExpInfo) queryIR(allLines, parser, searcher, writer);
		    if(writer != null) writer.close();
		    in.close();
		    searcher.close();
		    reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void queryIR(String line, QueryParser parser, IndexSearcher searcher,
					PrintWriter writer) throws Exception{
		System.out.println("Original string is: " + line);
//		writer.println("Original string is: " + line);
    	line = line.replace(":", " ");
    	line = line.replace("\"", " ");
    	line = line.replace("[", "(");
    	line = line.replace("]", ")");
    	line = line.replace("{", "(");
    	line = line.replace("}", ")");
    	line = line.replace("()", "");
    	System.out.println("Processed string is: " + line);
//    	writer.println("Processed string is: " + line);
    	
    	Query query = parser.parse(line);
	    System.out.println("Searching for: " + query.toString(field));
//	    writer.println("Searching for: " + query.toString(field));
	    
	    TopDocs results = searcher.search(query, 5 * maxHits);
	    ScoreDoc[] hits = results.scoreDocs;
	    System.out.println("Get: " + hits.length + " results");
//	    writer.println("Get: " + hits.length + " results");
	    
	    for (int i = 0; i < hits.length; i++) {
	        Document doc = searcher.doc(hits[i].doc);
	       	String filename = doc.get("filename");
	       	
	       	System.out.println("doc="+hits[i].doc+" score="+hits[i].score + " name="+filename);
	       	if(writer != null)writer.println("doc="+hits[i].doc+" score="+hits[i].score + " name="+filename);
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