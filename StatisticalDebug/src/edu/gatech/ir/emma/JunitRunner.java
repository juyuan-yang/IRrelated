package edu.gatech.ir.emma;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class JunitRunner {
	public static int expectArg = 4;
	public static boolean runInEcl = true;
	
	public static void main(String[] args) {
		if(!runInEcl && args.length != expectArg){
			System.out.println("There must be " + expectArg + " arguments: ");
			System.out.println("      arg[0], the mode to lauch junit test." + 
							" choose 'testAll' or 'testOne', 'testAll' is default");
			System.out.println("      arg[1], the fully qualified name of the test class"
							+ " in such a mode");
			System.out.println("      arg[2], the file to store the general results"
							+ " in testAll mode");
			System.out.println("      arg[3], the method name to be tested in testOne mode");
			return;
		}
		
		String testMode, testClassName, allResPath, methodName;
		if(runInEcl){
//			testMode = "testAll";	testClassName = "de.susebox.SuseboxTestSuite";
//			allResPath = "result.txt";		methodName = "";
			testMode = "testOne";	testClassName = "de.susebox.TestExceptions";
			allResPath = "";		methodName = "testNestedExceptions";
		} else{
			testMode = (args[0] == "testOne") ? "testOne" : "testAll";
			testClassName = args[1];	allResPath = args[2];
			methodName = args[3];
		}
		
		try {
			Class testClass = Class.forName(testClassName);
			JUnitCore jc = new JUnitCore();
			Result r;
			if(testMode.equals("testAll")){
				jc.addListener(new TraceCollectionListener(allResPath));
				r = jc.run(testClass);
			} else{ // testMode == "testOne"
				Request request = Request.method(testClass, methodName);
				r = jc.run(request);
				System.out.println(r.getRunCount());
				System.out.println(r.getFailureCount());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
