package edu.gatech.ir.runner;

import java.text.DecimalFormat;

public class Runner {
	public static void main(String[] args) {
		
		DataCenter data = new DataCenter("new_jtopas");
		data.readRawData();
		data.printOrigHits();
		data.combineStatIRclaz(0.5, 0.5);
		data.printCombHits();
		data.printList(0.5, 0.5);
//		data.combineStatIRclaz(0.9, 0.1);
//		data.printCombHits();
//		data.combineStatLinearIRclaz(0.5, 0.5);
//		data.printCombHits();
//		DataCenter data1 = new DataCenter("common");
//		data1.readRawData();
//		data1.printOrigHits();
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		// linear combine, rate from 0.1, 0.2 ... to 0.9
//		for(int i = 1; i < 10; i++){
//			double rate = i / (double)10;
//			DataCenter data = new DataCenter("common");
//			data.readRawData();
//			data.combineStatIRclaz(rate, 1 - rate);
//			//data.printList(rate, 1 - rate);
//			
//			System.out.println("rate: " + df.format(rate) + "," + df.format(1 - rate));
//			data.printCombHits();
//		}
		
		// IR on method level or class level
		// IR with or without desc
//		DataCenter data1 = new DataCenter("jtopas");
//		data1.readRawData();
//		data1.printOrigHits();
//		
//		DataCenter data2 = new DataCenter("common");
//		data2.readRawData();
//		data2.printOrigHits();
//		
//		DataCenter data3 = new DataCenter("new_jtopas");
//		data3.readRawData();
//		data3.printOrigHits();
	}
}
