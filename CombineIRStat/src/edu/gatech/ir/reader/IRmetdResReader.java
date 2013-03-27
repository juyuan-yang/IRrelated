package edu.gatech.ir.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import edu.gatech.ir.result.IRmetdRes;;

public class IRmetdResReader {
	// current format: doc=228 score=0.15291964 name=de.susebox.java.lang.ExtIndexOutOfBoundsException#getArguments#100:102
	public static List<IRmetdRes> readResData(String fileName){
		List<IRmetdRes> res = new ArrayList<IRmetdRes>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
			String str;
			
			while((str = reader.readLine()) != null){
				String[] s = str.trim().split(" ");
				
				int docIndex = Integer.parseInt(s[0].substring(s[0].indexOf("=") + 1));
				double score = Double.parseDouble(s[1].substring(s[1].indexOf("=") + 1));
				String method = s[2].substring(s[2].indexOf("=") + 1);
				
				IRmetdRes item = new IRmetdRes(method, docIndex, score);
				res.add(item);
			}
			reader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return res;
	}
}
