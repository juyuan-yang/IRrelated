package edu.gatech.ir.result;

import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.gatech.ir.comparator.StatResComparator;
import edu.gatech.ir.reader.BugInfoReader;
import edu.gatech.ir.reader.IRclazResReader;
import edu.gatech.ir.reader.IRmetdResReader;
import edu.gatech.ir.reader.StatResReader;

public class OneBugRes {
	public String folder;
	
	public List<StatRes> statResList;
	public List<IRclazRes> iRclazResList;
	public List<IRmetdRes> iRmetdResList;
	public List<BugInfo> bugInfoList;

	public List<StatRes> combinedList;
	
	// maybe 1.5, when hit on 1st, while 1st and 2nd have same score
	public double iRclazHit, iRmetdHit, statHit, combHit; 
	public double statAvg;
	
	public OneBugRes(String folder){
		this.folder = folder;
		iRclazHit = -1;
		iRmetdHit = -1;
		statHit = -1;
		combHit = -1;
	}
	
	public void readResData(){
		statResList = StatResReader.readResData(folder + "/stat.txt");
		iRclazResList = IRclazResReader.readResData(folder + "/IRclaz.txt");
		iRmetdResList = IRmetdResReader.readResData(folder + "/IRmetd.txt");
		bugInfoList = BugInfoReader.readResData(folder + "/bug.txt");
	}
	
	public void adjustScoreAvg(){
		if(statResList.size() == 0 || iRclazResList.size() == 0 
				|| iRmetdResList.size() == 0) return;
		statAvg = 0;
		double irclazAvg = 0, irmetdAvg = 0;
		for(int i = 0; i < statResList.size(); i++){
			statAvg += statResList.get(i).origScore;
		}
		for(int i = 0; i < iRclazResList.size(); i++){
			irclazAvg += iRclazResList.get(i).origScore;
		}
		for(int i = 0; i < iRmetdResList.size(); i++){
			irmetdAvg += iRmetdResList.get(i).origScore;
		}
		statAvg /= statResList.size();
		irclazAvg /= iRclazResList.size();
		irmetdAvg /= iRmetdResList.size();
		
		double clazRate = statAvg / irclazAvg;
		double metdRate = statAvg / irmetdAvg;
		
		for(int i = 0; i < iRclazResList.size(); i++){
			iRclazResList.get(i).score *= clazRate;
		}
		for(int i = 0; i < iRmetdResList.size(); i++){
			iRmetdResList.get(i).score *= metdRate;
		}
	}
	
	public void calHit(){
		int start, end;
		statHit = calHitForStat(statResList);
		
		for(int i = 0; i < iRclazResList.size(); i++){
			for(int j = 0; j < bugInfoList.size(); j++){
				if(bugInfoList.get(j).isEqual(iRclazResList.get(i))){
					iRclazHit = i + 1;
					break;
				}
			}
			if(iRclazHit != -1){
				IRclazRes target = iRclazResList.get(i);
				start = i - 1;
				end = i + 1;
				while(start >= 0 && iRclazResList.get(start).score == target.score) start--;
				while(end < iRclazResList.size() && iRclazResList.get(end).score == target.score) end++;
				iRclazHit = (start + end) / (double)2 + 1;
				break;
			}
		}
		
		for(int i = 0; i < iRmetdResList.size(); i++){
			for(int j = 0; j < bugInfoList.size(); j++){
				if(bugInfoList.get(j).isEqual(iRmetdResList.get(i))){
					iRmetdHit = i + 1;
					break;
				}
			}
			if(iRmetdHit != -1){
				IRmetdRes target = iRmetdResList.get(i);
				start = i - 1;
				end = i + 1;
				while(start >= 0 && iRmetdResList.get(start).score == target.score) start--;
				while(end < iRmetdResList.size() && iRmetdResList.get(end).score == target.score) end++;
				iRmetdHit = (start + end) / (double)2 + 1;
				break;
			}
		}
	}
	
	public double calHitForStat(List<StatRes> list){
		int start, end;
		double hit = -1;
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < bugInfoList.size(); j++){
				if(bugInfoList.get(j).isEqual(list.get(i))){
					hit = i + 1;
					break;
				}
			}
			if(hit != -1){
				StatRes target = list.get(i);
				start = i - 1;
				end = i + 1;
				while(start >= 0 && list.get(start).score == target.score) start--;
				while(end < list.size() && list.get(end).score == target.score) end++;
				hit = (start + end) / (double)2 + 1;
				break;
			}
		}
		return hit;
	}
	
	public void combineStatIRclaz(double w1, double w2){
		combinedList = new ArrayList<StatRes>();
		for(StatRes res : statResList) combinedList.add(new StatRes(res));
		for(StatRes res : combinedList){
			res.score *= w1;
			for(IRclazRes claz : iRclazResList){
				if(res.fileName.equals(claz.fileName)){
					res.score += claz.score * w2;
					break;
				}
			}
		}
		Collections.sort(combinedList, new StatResComparator());
		combHit = calHitForStat(combinedList);
	}
	
	public void combineStatLinearIRclaz(double w1, double w2){
		// Assume the average score of IRclaz is 0.5
		double rate = statAvg * 2;
		int size = iRclazResList.size();
		combinedList = new ArrayList<StatRes>();
		for(StatRes res : statResList) combinedList.add(new StatRes(res));
//		for(StatRes res : combinedList) System.out.println(res.toString());
		for(StatRes res : combinedList){
			res.score *= w1;
			for(int i = 0; i < size; i++){
				IRclazRes claz = iRclazResList.get(i);
				if(res.fileName.equals(claz.fileName)){
					if(size > 1)
						res.score += (1 - i / (size - 1)) * rate * w2;
					else res.score += 0.5 * w2;
					break;
				}
			}
		}
		Collections.sort(combinedList, new StatResComparator());
		combHit = calHitForStat(combinedList);
//		for(StatRes res : combinedList) System.out.println(res.toString());
	}
	
	public String getOrigHits(){
		return folder + "\t" + statHit + "\t" + iRclazHit + "\t" + iRmetdHit;
	}
	
	public String getCombHits(){
		return folder + "\t" + statHit + "\t" + combHit + "\t" + iRclazHit + "\t" + iRmetdHit;
	}
	
	public void printList(double w1, double w2){
		try{
			PrintWriter writer = new PrintWriter(new File(folder + "/combine.txt"));
			writer.println("Score\tstat\tIR\tsig");
			DecimalFormat df = new DecimalFormat("0.00");
			for(StatRes res : combinedList){
				writer.println(df.format(res.score) + "\t" + df.format(res.origScore)
								+ "\t" + df.format((res.score - res.origScore*w1)/w2)
								+ "\t" + res.simpleSig());
			}
			writer.close();
		} catch(Exception e){
			
		}
	}
}