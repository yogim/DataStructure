package com.ymhase.arraynstring;

public class CompressString {

    public void newCompression(String str) {
	char[] strArray = str.toCharArray();
	String compStr="";
	char iterator = strArray[0];
	int count = 0;
	for (int i = 0; i <=str.length()-1; i++) {
	    if (iterator == strArray[i]) {
		count++;
	    } else {
		compStr = compStr + iterator + count;
		iterator = strArray[i];
		count =1 ; 
	    }

	}
	compStr = compStr + iterator + count;
	System.out.println(">>"+compStr);
    }

    public void compress(String str) {

	char[] strArray = str.toCharArray();

	char iterator = strArray[0];
	int counter = 1;

	String compressedStr = "";

	for (int i = 1; i < strArray.length; i++) {

	    if (iterator == strArray[i]) {
		counter++;
	    } else {

		compressedStr = compressedStr + "" + iterator + "" + counter;
		counter = 1;
		iterator = strArray[i];
	    }

	}

	compressedStr = compressedStr + "" + iterator + "" + counter;

	System.out.println(compressedStr);

    }

    public static void main(String[] args) {


	
	//System.out.println(str.length());
	
	new CompressString().newCompression("aabb");
    }

}
