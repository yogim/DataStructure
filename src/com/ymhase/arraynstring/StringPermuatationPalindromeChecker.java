package com.ymhase.arraynstring;

public class StringPermuatationPalindromeChecker {
	private String str;

	public StringPermuatationPalindromeChecker(String str) {

		this.str = str;
	}

	public int findTrueLenght() {

		char[] charArray = this.str.toCharArray();
		int noOfSpace = 0;
		for (char c : charArray) {
			if (c != ' ') {
				noOfSpace++;
			}
		}

		return noOfSpace;
	}

	public void palindromeChecker() {
		int[] charCount = new int[128];
		int oddCount = 0;
		char[] strArray = this.str.toCharArray();

		for (int i = 0; i <= strArray.length-1; i++)
			charCount[(int)strArray[i]]++;

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] % 2 != 0)
				oddCount++;
		}

		if (strArray.length % 2 == 0) {
			if (oddCount >= 1)
				System.out.println("even Not palindrome");
			else
				System.out.println("even Palindrome");

		}else {
			
			if (oddCount == 1)
				System.out.println("odd palindrome");
			else
				System.out.println("odd Not palindrome");
			
		}

	}

	public static void main(String[] args) {

		String str = "abccba";
		StringPermuatationPalindromeChecker checker = new StringPermuatationPalindromeChecker(str);
		checker.palindromeChecker();
		
		
		
	}

}
