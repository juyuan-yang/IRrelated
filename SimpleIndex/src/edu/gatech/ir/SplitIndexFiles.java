package edu.gatech.ir;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.FieldInfo.IndexOptions;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import edu.gatech.ir.parser.SimpleClass;
import edu.gatech.ir.parser.SimpleMethod;
import edu.gatech.ir.visitor.ClassVisitor;

public class SplitIndexFiles {
	static String docsPath = "docs";
	static String indexPath = "index";
	static String newDocsPath = "methodDocs";
	public static Set<SimpleClass> classes = new HashSet<SimpleClass>();
	public static Set<SimpleMethod> methods = new HashSet<SimpleMethod>();
	
	public static void main(String[] args) {
		boolean create = true;
		
		final File docDir = new File(docsPath);
		if (!docDir.exists() || !docDir.canRead()) {
			System.out
					.println("Document directory does not exist or is not readable, please check the path");
			System.exit(1);
		}

		Date start = new Date();
		try {
			System.out.println("Indexing to directory '" + indexPath + "'...");

			Directory dir = FSDirectory.open(new File(indexPath));
			Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_31);
			IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_31, analyzer);

			if (create) {
				// Create a new index in the directory, removing any previously indexed documents:
				iwc.setOpenMode(OpenMode.CREATE);
			} else {
				// Add new documents to an existing index:
				iwc.setOpenMode(OpenMode.CREATE_OR_APPEND);
			}

			IndexWriter writer = new IndexWriter(dir, iwc);
			splitAndIndexDocs(writer, docDir);

			writer.close();

			Date end = new Date();
			System.out.println(end.getTime() - start.getTime()
					+ " total milliseconds");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void splitAndIndexDocs(IndexWriter writer, File file) throws IOException {
		// do not try to index files that cannot be read
		if (file.canRead()) {
			if (file.isDirectory()) {
				String[] files = file.list();
				if (files != null) { // an IO error could occur
					for (int i = 0; i < files.length; i++) {
						splitAndIndexDocs(writer, new File(file, files[i]));
					}
				}
			} else {
				try {
					if(!file.getCanonicalPath().endsWith(".java")){
						return;
					}
					CompilationUnit cu = JavaParser.parse(file);
					String pack = cu.getPackage().getName().toString();
					new ClassVisitor().visit(cu, pack);
					
//					TODO: set comments to each method
//					System.out.println(cu.getComments());
//					for(Comment comment : cu.getComments()){
//
//					}
					
//					for(SimpleMethod method : methods){
//						System.out.println("=======================================");
//						System.out.println(method.getSignature());
//						System.out.println(method.getContent());
//					}
					
					// start to make new, empty documents
					for(SimpleMethod method : methods){
						Document doc = new Document();
	
						Field pathField = new Field("filename", method.getSignature(),
								Field.Store.YES, Field.Index.NOT_ANALYZED_NO_NORMS);
						pathField.setIndexOptions(IndexOptions.DOCS_ONLY);
						doc.add(pathField);
	
						doc.add(new Field("contents", new StringReader(method.getContent())));
	
						if (writer.getConfig().getOpenMode() == OpenMode.CREATE) {
							System.out.println("adding " + method.getSignature());
							writer.addDocument(doc);
						} else {
							// TODO: need to check here
							System.out.println("updating " + method.getSignature());
							writer.updateDocument(new Term("path", method.getSignature()), doc);
						}
					}
					methods.clear();
				} catch(Exception e){
					e.printStackTrace();
				} finally {
					
				}
			}
		}
	}
}
