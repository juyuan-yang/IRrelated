package edu.gatech.ir.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleClass {
	public List<String> src;
	public List<String> classComments;
	public Map<String, List<String>> method2src;
	
	public SimpleClass(){
		src = new ArrayList<String>();
		classComments = new ArrayList<String>();
		method2src = new HashMap<String, List<String>>();
	}
	
	public void addLineToSrc(String s){
		src.add(s);
	}
}
