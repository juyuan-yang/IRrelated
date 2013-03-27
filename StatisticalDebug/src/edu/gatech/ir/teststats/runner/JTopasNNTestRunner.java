package edu.gatech.ir.teststats.runner;

import java.io.File;
import java.io.PrintWriter;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import edu.gatech.ir.teststats.record.TraceRecorder;

/**
 * The test runner is specially designed for JTopas
 * where all the test cases can be run via a main
 * test suite - de.susebox.SuseboxTestSuite.class
 * 
 * However, we provide the flexibility to run 
 * test cases in other test classes by getting the
 * test class via command line arguments.
 * 
 * @author ChengZhang
 *
 */
public class JTopasNNTestRunner {
	public static void main(String[] args){
		if(args.length != 5){
			System.out.println("There must be four arguments for JTopasNNTestRunner: ");
			System.out.println("      arg[0], the fully qualified name of the test class");
			System.out.println("      arg[1], the folder to place the traces of failed test cases");
			System.out.println("      arg[2], the folder to place the traces of passed test cases");
			System.out.println("      arg[3], the file to store the map between each basic block and its id");
			System.out.println("      arg[4], the file to store the failed test case numbers");
			return;
		}
		
		long startTime = System.currentTimeMillis();
		String testClassName = args[0], failTraceFolder = args[1], passTraceFolder = args[2], 
				mapFilePath = args[3], failTestCaseNumPath = args[4];
//		String testClassName = "AllTests", failTraceFolder = "failed", 
//					passTraceFolder = "passed", mapFilePath = "bbMap.txt", failTestCaseNumPath = "failedTestCase.txt";
		
		// generate the config file for 
//		InsectjConfigGenerator.generateInsectjConfigFile(configFilePath, testFolder);
		
		try {
			Class testClass = Class.forName(testClassName);
			JUnitCore jc = new JUnitCore();
			jc.addListener(new TraceCollectionListener(failTraceFolder, passTraceFolder));

			TraceRecorder.clearBBMap();
			//TestRequest request = new TestRequest(Request.classes(testClass)); 			
			//Result r = jc.run(request);
			Result r = jc.run(testClass);
			
			
			TraceRecorder.storeBBMap(mapFilePath);
			TraceRecorder.storeFailedTraceNum(failTestCaseNumPath);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("The time collecting traces takes: " + (endTime - startTime));
		try{
//			PrintWriter writer = new PrintWriter(new File(Long.toString(endTime - startTime)));
//			writer.println("fuck");
//			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
