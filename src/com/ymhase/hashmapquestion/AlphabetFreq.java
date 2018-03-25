package com.ymhase.hashmapquestion;

public class AlphabetFreq {

    private String str;

    private int freq[];

    public AlphabetFreq() {

	str = "abcdabcd";
	freq = new int[26];

    }

    void findFrequncey() {

	for (int i = 0; i <= (str.length() - 1); i++) {

	    int index = this.indexof(str.charAt(i));
	    freq[index]++;
	}

	this.printFreqArray();

    }

    void printFreqArray() {

	for (int i = 0; i <= 25; i++) {

	    System.out.println((char) (i + 97) + " " + freq[i]);
	}
    }

    int indexof(char a) {

	return ((int) a - 97);

    }

    public static void main(String[] args) {

	AlphabetFreq af = new AlphabetFreq();
	af.findFrequncey();

	/*
	 * String str = "abcdabcd";
	 * 
	 * for (int i = 0; i <= str.length(); i++) {
	 * 
	 * System.out.println(str.charAt(i));
	 * 
	 * }
	 */

    }

}
