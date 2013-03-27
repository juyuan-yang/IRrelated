package edu.gatech.ir.teststats.runner;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestPassListener extends RunListener {
	public void testFinished(Description desc) {
		System.out.println("------ " + desc.getClassName());
		System.out.println("------ " + desc.getMethodName());
	}

	public void testFailure(Failure failure) {
		System.out.println("******* " + failure.getTestHeader());
	}
}
