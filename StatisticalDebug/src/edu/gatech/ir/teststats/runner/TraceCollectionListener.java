package edu.gatech.ir.teststats.runner;

import java.io.File;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import edu.gatech.ir.teststats.record.TraceRecorder;

public class TraceCollectionListener extends RunListener {
	private String failTraceFolder;
	private String passTraceFolder;
	private boolean newFailure;
	
	public TraceCollectionListener(String fFolder, String pFolder){
		this.failTraceFolder = fFolder;
		this.passTraceFolder = pFolder;
	}
	
	public void testStarted(Description desc){
		TraceRecorder.startRecording();
	}
	
	public void testFailure(Failure f){
		newFailure = true;
		System.out.println("THIS IS A TEST FAILURE: ");
		System.out.println(f.getMessage());
		System.out.println(f.getTrace());
		System.out.println(f.getException());
	}
	
	/**
	 * This callback method is invoked AFTER testFailure,
	 * so it relies testFailure to correctly update the flag, newFailure.
	 */
	public void testFinished(Description desc){
		StringBuilder traceFileName = new StringBuilder();
		traceFileName.append(desc.getClassName());
		traceFileName.append("#");
		traceFileName.append(desc.getMethodName());
		
		if(newFailure){
			TraceRecorder.endRecording(failTraceFolder + File.separator + traceFileName.toString());
			TraceRecorder.recordTestCaseNum(traceFileName.toString(), false);
		}else{
			TraceRecorder.endRecording(passTraceFolder + File.separator + traceFileName.toString());
			TraceRecorder.recordTestCaseNum(traceFileName.toString(), true);
		}
		
		// after recording the trace file, reset the flag
		newFailure = false;
	}
}
