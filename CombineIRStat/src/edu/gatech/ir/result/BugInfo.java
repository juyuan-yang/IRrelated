package edu.gatech.ir.result;

public class BugInfo {
	// Examples: de.susebox.java.io.ExtIOException:38
	// or de.susebox.java.io.ExtIOException:38/40
	public String bugInfo;
	
	public String packName;
	public String fileName;
	public int startLine;
	public int endLine;
	
	public BugInfo(String pack, String file, int start, int end){
		packName = pack;
		fileName = file;
		startLine = start;
		endLine = end;
	}
	
	public BugInfo(String bugInfo){
		this.bugInfo = bugInfo;
		parseBugInfo();
	}
	
	public void parseBugInfo(){
		String[] s = bugInfo.split(":");
		int lastDot = s[0].lastIndexOf(".");
		
		packName = (lastDot == -1) ? "" : s[0].substring(0, lastDot);
		fileName = (lastDot == -1) ? s[0] : s[0].substring(lastDot + 1);
		
		if(s[1].contains("/")){
			String[] num = s[1].split("/");
			startLine = Integer.parseInt(num[0]);
			endLine = Integer.parseInt(num[1]);
		} else {
			startLine = Integer.parseInt(s[1]);
			endLine = startLine;
		}
	}
	
	public boolean isEqual(StatRes item){
		return (fileName.equals(item.fileName) && packName.equals(item.packName)
					&& (startLine <= item.endLine && endLine >= item.startLine));
	}
	
	public boolean isEqual(IRclazRes item){
		return fileName.equals(item.fileName);
	}
	
	public boolean isEqual(IRmetdRes item){
		return fileName.equals(item.fileName);
	}
}
