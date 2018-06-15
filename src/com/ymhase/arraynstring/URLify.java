package com.ymhase.arraynstring;

import java.util.HashMap;

public class URLify {

    public String findTrueLenght(String str, int length) {

	char[] charArray = str.toCharArray();
	int noOfSpace = 0;
	for (char c : charArray) {
	    if (c == ' ') {
		noOfSpace++;
	    }
	}

	System.out.println(noOfSpace);

	int trueLength = 2 * noOfSpace + length;

	if (!(trueLength <= length)) {

	    for (int i = (trueLength - 1); i >= 0; i--) {

	    }

	}

	return str;

    }

    public static void main(String args[]) {

	HashMap<Integer, String> useCases = new HashMap<>();

	useCases.put(1, "abcd");
	useCases.put(2, " abcd ");
	useCases.put(3, "ab cd");
	useCases.put(4, " ab cd ");
	useCases.put(5, "ab    cd");
	useCases.put(6, "    ab cd   ");

	String str = "Mr John Smith";

	URLify urlify = new URLify();
	urlify.findTrueLenght(str, 13);
	System.out.println(str.length());
	System.out.println(str.toCharArray().length);

    }
}
