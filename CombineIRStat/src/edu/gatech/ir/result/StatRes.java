package edu.gatech.ir.result;

public class StatRes {
	// one sig example: 
	// de.susebox.java.io.ExtIOException,<init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V,48/53
	public String signature;
	public int docIndex;
	public double origScore;
	public double score;
	
	public String packName;
	public String fileName;
	public String methodName;
	public String simpleMethodName;
	public int startLine;
	public int endLine;
	
	public StatRes(String sig, int docIndex, double score){
		this.signature = sig;
		this.docIndex = docIndex;
		this.origScore = score;
		this.score = score;
		parseSig();
	}
	
	public void parseSig(){
		String sig = signature.trim();
		String[] s = sig.split(",");
		
		int lastDot = s[0].lastIndexOf(".");
		packName = (lastDot == -1) ? "" : s[0].substring(0, lastDot);
		fileName = (lastDot == -1) ? s[0] : s[0].substring(lastDot + 1);
		methodName = s[1];
		simpleMethodName = (methodName.contains("(")) ? 
						methodName.substring(0, methodName.indexOf("(")) : methodName;
		String num[] = s[2].split("/");
		startLine = Integer.parseInt(num[0]);
		endLine = Integer.parseInt(num[1]);
	}
	
	public boolean validate(){
		return startLine <= endLine && score > 0 && startLine > 0;
	}
	
	public String toString(){
		return score + " " + fileName + ":" + startLine + "/" + endLine;
	}
	
	public String simpleSig(){
		return fileName + ":" + startLine + "/" + endLine;
	}
	
	public StatRes(StatRes obj){
		this.signature = obj.signature;
		this.docIndex = obj.docIndex;
		this.origScore = obj.origScore;
		this.score = obj.score;
		
		this.packName = obj.packName;
		this.fileName = obj.fileName;
		this.methodName = obj.methodName;
		this.simpleMethodName = obj.simpleMethodName;
		this.startLine = obj.startLine;
		this.endLine = obj.endLine;
	}	
}
