package edu.gatech.ir.teststats.config;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import edu.gatech.ir.teststats.runner.TestFinder;

public class InsectjConfigGenerator {
	public static boolean generateInsectjConfigFile(String iConfig, String testFolderPath){
		boolean isSuccess = false;
		
		try{
			TestFinder tFinder = new TestFinder(new File(testFolderPath));
			List<String> testClassNames = tFinder.findAllTests(); // take care, the class names end with ".class"
			
			PrintWriter configWriter = new PrintWriter(iConfig);
			configWriter.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>");
			configWriter.println("<insectconfig>");
			configWriter.println("<settings dump=\"false\" dumpdir=\"\" verbose=\"false\"/>");
			configWriter.println("<probe arguments=\"\" class=\"edu.gatech.cc.rtinsect.inserters.BasicBlockProbeInserter\" " +
					"monitor=\"edu.gatech.ir.teststats.record.NNBasicBlockMonitor\"/>");
			
			configWriter.println("<instrument>");
			for(String tc : testClassNames){
				configWriter.println(tc.substring(0, tc.length() - ".class".length()));
			}
			configWriter.println("</instrument>");
			configWriter.println("</insectconfig>");
			
			configWriter.close();
			isSuccess = true;
		}catch(IOException io){
			io.printStackTrace();
		}
		return isSuccess;
	}
	
	public static void main(String[] args){
		String configFile = args[0];
		String testFolder = args[1];
		generateInsectjConfigFile(configFile, testFolder);
	}
}
