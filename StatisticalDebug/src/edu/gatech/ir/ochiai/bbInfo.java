package edu.gatech.ir.ochiai;

public class bbInfo implements Comparable<bbInfo>{
	public String id;
	public String bb;
	public double score;
	
	public bbInfo(String id, String bb, double score){
		this.id = id;
		this.bb = bb;
		this.score = score;
	}

	@Override
	public int compareTo(bbInfo obj) {
		if(obj.score == this.score) return 0;
		return (obj.score - this.score > 0.00001) ? 1 : -1;
	}
	
	public String toString(){
		return id + " " + score + " " + bb;
	}
}
