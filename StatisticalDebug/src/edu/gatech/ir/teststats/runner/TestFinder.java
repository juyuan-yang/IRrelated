package edu.gatech.ir.teststats.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestFinder {
	private List<String> pkgList;
	private File rootDir;
	
	public TestFinder(File root){
		this.rootDir = root;
		pkgList = new ArrayList<String>();
	}
	
	public List<String> findAllTests(){
		List<String> testClasses = new ArrayList<String>();
		findTest(rootDir, testClasses);
		
		return testClasses;
	}
	
	private void findTest(File parent, List<String> testClasses){
		File[] files = parent.listFiles();
		if(files != null){
			StringBuilder currentPkg = new StringBuilder();
			for(int i = 0; i < pkgList.size(); i++){
				currentPkg.append(pkgList.get(i));
				currentPkg.append(".");
			}
			
			for(File f : files){
				if(f.isFile()){
					if(f.getName().endsWith(".class")){
						testClasses.add(currentPkg.toString() + f.getName());
					}
				}else if(f.isDirectory()){
					String currentDir = f.getName();
					pkgList.add(currentDir);
					findTest(f, testClasses);
					pkgList.remove(pkgList.size() - 1);
				}else{
					System.out.println("The file is neither a plain file nor a directory.");
				}
			}
		}
	}
	
	public static void main(String[] args){
		File testRoot = new File("G:/21_SIR/Reconfiguration_2011/configured_JavaObjects/tmp/test_bin/");
		TestFinder finder = new TestFinder(testRoot);
		List<String> tests = finder.findAllTests();
//		System.out.println(tests);
		for(String t : tests){
			System.out.println(t);
		}
	}
}
