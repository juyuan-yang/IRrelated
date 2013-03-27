package edu.gatech.ir.result;

public class IRclazRes {
	public String fileName;
	public int docIndex;
	public double origScore;
	public double score;
	
	public IRclazRes(String file, int docIndex, double score){
		this.fileName = file;
		this.docIndex = docIndex;
		this.score = score;
		this.origScore = score;
	}
}
