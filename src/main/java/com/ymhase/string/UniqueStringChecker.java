package com.ymhase.string;

public class UniqueStringChecker {

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

}
