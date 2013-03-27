package edu.gatech.ir.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.gatech.ir.result.OneBugRes;

public class DataCenter {
	public String folder;
	public List<OneBugRes> bugList;
	
	public DataCenter(String folder){
		this.folder = folder;
		bugList = new ArrayList<OneBugRes>();
	}
	
	public void readRawData(){
		File dir = new File(folder);
		if(dir.isDirectory()){ // jtopas
			File[] subDirs = dir.listFiles();
			for(File subDir : subDirs){ // 1.1
				if(subDir.isDirectory()){
					OneBugRes item = new OneBugRes(folder + "/" + subDir.getName());
					item.readResData();
					item.adjustScoreAvg();
					item.calHit();
					bugList.add(item);
				}
			}
		}
	}
	
	public void combineStatIRclaz(double w1, double w2){
		for(int i = 0; i < bugList.size(); i++){
			bugList.get(i).combineStatIRclaz(w1, w2);
		}
	}
	
	public void combineStatLinearIRclaz(double w1, double w2){
		for(int i = 0; i < bugList.size(); i++){
			bugList.get(i).combineStatLinearIRclaz(w1, w2);
		}
	}
	
	public void printList(double w1, double w2){
		for(int i = 0; i < bugList.size(); i++){
			bugList.get(i).printList(w1, w2);
		}
	}
	
	public void printCombHits(){
		System.out.println("test case \tstat \tcombined \tIR class \tIR method");
		for(int i = 0; i < bugList.size(); i++){
			System.out.println(bugList.get(i).getCombHits());
		}
	}
	
	public void printOrigHits(){
		System.out.println("test case \tstat \tIR class \tIR method");
		for(int i = 0; i < bugList.size(); i++){
			System.out.println(bugList.get(i).getOrigHits());
		}
	}
}
