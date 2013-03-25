package edu.gatech.ir;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import edu.gatech.ir.parser.SimpleClass;

public class SplitIndexFiles {
	static String docsPath = "docs";
	static String indexPath = "index";
	static String newDocsPath = "methodDocs";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		splitCode();
	}
	
	public static void splitCode(){
		final File docDir = new File(docsPath);
		if (!docDir.exists() || !docDir.canRead()) {
			System.out
					.println("Document directory does not exist or is not readable, please check the path");
			System.exit(1);
		}
		readFile(docDir);
	}

	public static void readFile(File file){
		// do not try to index files that cannot be read
		if (file.canRead()) {
			if (file.isDirectory()) {
				String[] files = file.list();
				if (files != null) { // an IO error could occur
					for (int i = 0; i < files.length; i++) {
						readFile(new File(file, files[i]));
					}
				}
			} else {
				try {
					if(!file.getCanonicalPath().endsWith(".java")){
						return;
					}
					CompilationUnit cu = JavaParser.parse(file);
					System.out.println(cu.toString());
				} catch(Exception e){
					e.printStackTrace();
				} finally {
					
				}
			}
		}
	}
}
