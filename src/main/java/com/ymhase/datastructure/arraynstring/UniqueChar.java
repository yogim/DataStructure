package com.ymhase.datastructure.arraynstring;

public class UniqueChar {

    public static void main(String args[]) {

	String str = "abcd  "; 
	boolean UniqueStaus = true;
	boolean[] char_set = new boolean[128];

	for (int i = 0; i <= str.length() - 1; i++) {

	    int asciiValue = str.charAt(i);
	    if (char_set[asciiValue]) {

		UniqueStaus = false;
		break;
	    }
	    char_set[asciiValue] = true;

	}
	if (UniqueStaus == false) {
	    System.out.println("not Unique");
	} else {

	    System.out.println("Unique");
	}
    }

}
