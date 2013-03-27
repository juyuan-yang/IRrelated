package edu.gatech.ir.ochiai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Runner {
	private static Map<String, String> id2bb = new HashMap<String, String>();
	private static Map<String, Set<String>> id2PassTests = new HashMap<String, Set<String>>();
	private static Map<String, Set<String>> id2FailTests = new HashMap<String, Set<String>>();
	private static List<bbInfo> rankedList = new ArrayList<bbInfo>();
	private static int passedTests = 0;
	private static int failedTests = 0;
	private static int topNum = 50;
	
	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("There must be 4 arguments: ");
			System.out.println("      arg[0], the folder for passed traces");
			System.out.println("      arg[1], the folder for failed traces");
			System.out.println("      arg[2], the file to store the map between each basic block and its id");
			System.out.println("      arg[3], the file to store results");
		}
		String passedPath = args[0], failedPath = args[1], bbMapPath = args[2], resFile = args[3];
//		String passedPath = "passed", failedPath = "failed", bbMapPath = "bbMap.txt", resFile = "res.txt";
		readBBMap(bbMapPath);
		readTestRes(passedPath, id2PassTests, true);
		readTestRes(failedPath, id2FailTests, false);
		calSuspicious();
		try{
			PrintWriter writer = new PrintWriter(new File(resFile));
			for(int i = 0; i < rankedList.size() && i < topNum; i++)
				writer.println(rankedList.get(i).toString());
			writer.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		for(int i = 0; i < rankedList.size() && i < topNum; i++)
			System.out.println(rankedList.get(i).toString());
	}

	public static void calSuspicious(){
		for(Entry<String, Set<String>> entry : id2FailTests.entrySet()){
			int exeInPass = id2PassTests.get(entry.getKey()).size();
			int exeInFail = entry.getValue().size();
			double score = exeInFail / Math.sqrt(failedTests * (exeInFail + exeInPass));
			bbInfo bb = new bbInfo(entry.getKey(), id2bb.get(entry.getKey()), score);
			rankedList.add(bb);
		}
		Collections.sort(rankedList);
	}
	
	public static void readTestRes(String folderPath, Map<String, Set<String>> id2test,
								boolean checkPassed){
		try {
			File folder = new File(folderPath);
			if(folder.isDirectory()){
				File[] files = folder.listFiles();
				if(checkPassed) passedTests = files.length;
				else failedTests = files.length;
				for(File f : files){
					String s, testName = f.getName().trim();
					BufferedReader reader = new BufferedReader(new FileReader(f));
					while((s = reader.readLine()) != null){
						s = s.trim();
						id2test.get(s).add(testName);
					}
					reader.close();
				}
			} else {
				System.out.println(folderPath + " is not a folder! Please check...");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readBBMap(String file){
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File(file)));
			String s;
			while((s = reader.readLine()) != null){
				String[] strs = s.split(" ");
				strs[0] = strs[0].trim();
				strs[1] = strs[1].trim();
				id2bb.put(strs[1], strs[0]);
				Set<String> passSet = new HashSet<String>();
				id2PassTests.put(strs[1], passSet);
				Set<String> failSet = new HashSet<String>();
				id2FailTests.put(strs[1], failSet);
			}
			reader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
