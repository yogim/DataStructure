package com.ymhase.arraynstring;

public class URLify {

	public void findTrueLenght(String str) {

		char[] charArray = str.toCharArray();
		int noOfSpace = 0;
		for (char c : charArray) {
			if (c == ' ') {
				noOfSpace++;
			}
		}
		System.out.println(noOfSpace);
	}

	public void removeExtraSpaces(String str) {
		
	}
	
	
	public static void main(String args[]) {

		String str = "abcd   abcd";
		new URLify().findTrueLenght(str);

	}
}
