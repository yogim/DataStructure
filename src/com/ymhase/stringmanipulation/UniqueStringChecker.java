package com.ymhase.stringmanipulation;

import com.ymhase.common.AlgoFactory;

public class UniqueStringChecker implements AlgoFactory {

    private String str;

    public boolean check() {

	boolean UniqueStatus = true;
	boolean[] char_set = new boolean[128];

	for (int i = 0; i <= str.length() - 1; i++) {
	    int asciiValue = str.charAt(i);
	    if (char_set[asciiValue]) {
		UniqueStatus = false;
		return UniqueStatus;
	    }
	    char_set[asciiValue] = true;
	}
	return UniqueStatus;
    }

  

    @Override
    public Object getAlgorithm() {
	// TODO Auto-generated method stub
	return new UniqueStringChecker();
    }

}
