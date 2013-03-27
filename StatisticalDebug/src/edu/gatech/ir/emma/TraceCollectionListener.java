package edu.gatech.ir.emma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TraceCollectionListener extends RunListener {
	private PrintWriter writer;
	private boolean testfailed = false;
	
	public TraceCollectionListener(String resultFilePath) throws FileNotFoundException{
		writer = new PrintWriter(new File(resultFilePath));
	}
	
	// Called when an atomic test fails.
	public void testFailure(Failure f){
		this.testfailed = true;
	}
	
	// Called when an atomic test has finished, whether the test succeeds or fails.
	// This method is called AFTER testFailure
	public void testFinished(Description desc){
		StringBuilder traceFileName = new StringBuilder();
		traceFileName.append(desc.getClassName());
		traceFileName.append("#");
		traceFileName.append(desc.getMethodName());
		writer.println(desc.getClassName() + " " + desc.getMethodName()
						+ " " + (testfailed ? "Failed" : "Passed"));
		this.testfailed = false;
	}
	
	// Called when all tests have finished
	public void testRunFinished(Result result){
		writer.close();
	}
	
//	// Called before any tests have been run.
//	public void testRunStarted(Description description){
//		
//	}
//	
//	// Called when an atomic test is about to be started. 
//	public void testStarted(Description description) {
//		
//	}     
}
