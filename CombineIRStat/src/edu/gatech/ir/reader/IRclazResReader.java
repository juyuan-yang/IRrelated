package edu.gatech.ir.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import edu.gatech.ir.result.IRclazRes;

public class IRclazResReader {
	// current format: doc=13 score=0.0075278627 name=Tokenizer.java
	public static List<IRclazRes> readResData(String fileName){
		List<IRclazRes> res = new ArrayList<IRclazRes>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
			String str;
			
			while((str = reader.readLine()) != null){
				String[] s = str.trim().split(" ");
				int docIndex = Integer.parseInt(s[0].substring(s[0].indexOf("=") + 1));
				double score = Double.parseDouble(s[1].substring(s[1].indexOf("=") + 1));
				String file = s[2].substring(s[2].indexOf("=") + 1);
				file = file.substring(0, file.indexOf(".java"));
				IRclazRes item = new IRclazRes(file, docIndex, score);
				res.add(item);
			}
			reader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return res;
	}
}
