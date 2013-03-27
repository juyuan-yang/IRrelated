package edu.gatech.ir.parser;

import java.util.ArrayList;
import java.util.List;

public class SimpleClass {
	public String className;
	public String javadoc;
	public String comment;
	public List<SimpleMethod> methods;
	
	public SimpleClass(String className, String javadoc, String comment){
		methods = new ArrayList<SimpleMethod>();
		this.className = className;
		this.javadoc = javadoc;
		this.comment = comment;
	}
}
