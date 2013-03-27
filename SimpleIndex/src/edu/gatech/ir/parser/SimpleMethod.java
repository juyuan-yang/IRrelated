package edu.gatech.ir.parser;

public class SimpleMethod {
	public String method;
	public SimpleClass parent;
	public String javadoc;
	public String comment;
	public String content;
	public int begin;
	public int end;
	
	// TODO: deal with inheritance
	public SimpleMethod(String method, SimpleClass parent, String javadoc, 
			String comment, String content){
		this.method = method;
		this.parent = parent;
		this.javadoc = javadoc;
		this.comment = comment;
		this.content = content;
	}
	
	public String getSignature(){
		return parent.className + "#" + method + "#" + begin + ":" + end;
	}
	
	public String getContent(){
		return parent.javadoc + "\n" + content;
	}
	
	public void setLineInfo(int begin, int end){
		this.begin = begin;
		this.end = end;
	}
}
