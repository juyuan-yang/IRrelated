package edu.gatech.ir.result;

public class IRmetdRes {
	// one method example: de.susebox.java.lang.ExtIndexOutOfBoundsException#getArguments#100:102
	public String method;
	public int docIndex;
	public double origScore;
	public double score;
	
	public String packName;
	public String fileName;
	public String methodName;
	public int startLine;
	public int endLine;
	
	public IRmetdRes(String method, int docIndex, double score){
		this.method = method;
		this.docIndex = docIndex;
		this.score = score;
		this.origScore = score;
		parseMethod();
	}
	
	public void parseMethod(){
		String[] s = method.split("#");
		
		int lastDot = s[0].lastIndexOf(".");
		packName = (lastDot == -1) ? "" : s[0].substring(0, lastDot);
		fileName = (lastDot == -1) ? s[0] : s[0].substring(lastDot + 1);
		methodName = s[1];
		String num[] = s[2].split(":");
		startLine = Integer.parseInt(num[0]);
		endLine = Integer.parseInt(num[1]);
	}
}
