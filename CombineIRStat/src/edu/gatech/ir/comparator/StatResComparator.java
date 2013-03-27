package edu.gatech.ir.comparator;

import java.util.Comparator;

import edu.gatech.ir.result.StatRes;

public class StatResComparator implements Comparator<StatRes>{

	@Override
	public int compare(StatRes arg0, StatRes arg1) {
		if(arg0.score - arg1.score < 0.000001) return 1;
		else if(arg0.score - arg1.score > 0.000001) return -1;
		else return 0;
	}

}
