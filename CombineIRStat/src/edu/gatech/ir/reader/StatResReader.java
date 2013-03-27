package edu.gatech.ir.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import edu.gatech.ir.result.StatRes;;

public class StatResReader {
	// current format: 689 1.0 de.susebox.java.io.ExtIOException,getFormat()Ljava/lang/String;,15/15
	public static List<StatRes> readResData(String fileName){
		List<StatRes> res = new ArrayList<StatRes>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
			String str;
			
			while((str = reader.readLine()) != null){
				String[] s = str.trim().split(" ");
				int docIndex = Integer.parseInt(s[0]);
				double score = Double.parseDouble(s[1]);
				StatRes item = new StatRes(s[2], docIndex, score);
				if(item.validate()) res.add(item);
			}
			reader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return res;
	}
}
