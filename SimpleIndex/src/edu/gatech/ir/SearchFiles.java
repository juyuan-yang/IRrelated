package edu.gatech.ir;

import java.io.File;
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
		String index = "index";
	    String field = "contents";
	    String toSearch = "Wrapper";
	    int maxHits = 10;
	    
	    IndexReader reader;
		try {
			reader = IndexReader.open(FSDirectory.open(new File(index)));
		    IndexSearcher searcher = new IndexSearcher(reader);
		    Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_31);
		    QueryParser parser = new QueryParser(Version.LUCENE_31, field, analyzer);
		    
		    Query query = parser.parse(toSearch);
		    System.out.println("Searching for: " + query.toString(field));
		    
		    TopDocs results = searcher.search(query, 5 * maxHits);
		    ScoreDoc[] hits = results.scoreDocs;
		    
		    for (int i = 0; i < hits.length; i++) {
		        Document doc = searcher.doc(hits[i].doc);
		       	String filename = doc.get("filename");
		       	
		       	System.out.println("doc="+hits[i].doc+" score="+hits[i].score + " name="+filename);
		    }
		    searcher.close();
		    reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
