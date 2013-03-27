package edu.gatech.ir.teststats.record;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TraceRecorder {
	private static Map<String, String> bb2id = new HashMap<String, String>();
	private static List<String> idListOfTrace = new ArrayList<String>();
	private static Map<String, Integer> tracePath2count = new HashMap<String, Integer>();
	private static Map<String, Integer> testCase2count = new HashMap<String, Integer>();
	private static List<String> failedTestCase = new ArrayList<String>();
	
	public static void clearBBMap(){
		bb2id.clear();
	}
	
	public static void startRecording() {
		idListOfTrace.clear();
	}

	public static boolean endRecording(String tracePath) {
		boolean isSuccess = false;

		try {
			// write the trace (in the form of a list of bb IDs)
			// as a test case may be run for several times,
			// we must keep a counter for each test case...
			Integer count = tracePath2count.get(tracePath);
			if(count == null){
				tracePath2count.put(tracePath, new Integer(1));
			}else{
				tracePath2count.put(tracePath, new Integer(count.intValue() + 1));
				tracePath = tracePath + "#" + count;
			}
			
			PrintWriter traceWriter = new PrintWriter(new BufferedWriter(
					new FileWriter(tracePath)));
			for (String bbId : idListOfTrace) {
				traceWriter.println(bbId);
			}
			traceWriter.close();
			isSuccess = true;
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return isSuccess;
	}

	public static void recordTraceInfo(String bbInfo) {
		String bbId = getBasicBlockId(bbInfo);
		idListOfTrace.add(bbId);
	}

	private static String getBasicBlockId(String bbTxt) {
		String id = bb2id.get(bbTxt);
		if (id == null) {
			int size = bb2id.size();
			id = String.valueOf(size + 1);
			bb2id.put(bbTxt, id);
		}

		return id;
	}

	public static void storeBBMap(String mapPath) {
		try {
			// write the map file
			PrintWriter mapWriter = new PrintWriter(new BufferedWriter(new FileWriter(
					mapPath)));
			Set<Entry<String, String>> mapEntrySet = bb2id.entrySet();
			for (Entry<String, String> mapEntry : mapEntrySet) {
				String key = mapEntry.getKey();
				String value = mapEntry.getValue();
				mapWriter.println(key + " " + value);
			}
			mapWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Each same test case may be ran several times, 
	 * so we need to find out the failed one's number in the queue
	 */
	public static void recordTestCaseNum(String testCaseName, boolean success){
		Integer count = testCase2count.get(testCaseName);
		if(count == null){
			testCase2count.put(testCaseName, new Integer(1));
			if(!success)
				failedTestCase.add(testCaseName + "#1");
		}else{
			testCase2count.put(testCaseName, new Integer(count.intValue() + 1));
			if(!success)
				failedTestCase.add(testCaseName + "#" + Integer.toString(count + 1));
		}
	}
	
	public static void storeFailedTraceNum(String failedTraceNumPath){
		try {
			// write the map file
			PrintWriter mapWriter = new PrintWriter(new BufferedWriter(new FileWriter(
					failedTraceNumPath)));
			for (int i = 0; i < failedTestCase.size(); i++) {
				mapWriter.println(failedTestCase.get(i));
			}
			mapWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// Just works as a test driver.
		startRecording();
		recordTraceInfo("cn.edu.sjtu.stap.ClassSample");
		endRecording("Trace.txt");
		storeBBMap("Map.txt");
	}

}
