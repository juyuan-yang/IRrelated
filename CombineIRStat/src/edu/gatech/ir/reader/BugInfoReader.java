package edu.gatech.ir.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import edu.gatech.ir.result.BugInfo;

public class BugInfoReader {
	// Examples: de.susebox.java.io.ExtIOException:38
	// 		or de.susebox.java.io.ExtIOException:38/40
	public static List<BugInfo> readResData(String fileName){
		List<BugInfo> res = new ArrayList<BugInfo>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
			String str;
			
			while((str = reader.readLine()) != null){
				BugInfo item = new BugInfo(str.trim());
				res.add(item);
			}
			reader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return res;
	}
}
