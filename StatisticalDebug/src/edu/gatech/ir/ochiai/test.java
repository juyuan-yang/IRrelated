package edu.gatech.ir.ochiai;

public class test {
	public static void main(String[] args) {
		for(int i = 2; i < 11; i++) tryNum(i);
		tryNum(2000);
	}
	public static int sol;
	public static void tryNum(int n){
		int po = n, ne = n;
		sol = 0;
		pickOne(po - 1, ne, 1);
		System.out.println(n + " " + sol);
	}
	public static void pickOne(int po, int ne, int total){
		if(po == 0 && ne == 0) sol++;
		if(po > 0) pickOne(po - 1, ne, total + 1);
		if(ne > 0 && total > 0) pickOne(po, ne - 1, total - 1);
	}
}
