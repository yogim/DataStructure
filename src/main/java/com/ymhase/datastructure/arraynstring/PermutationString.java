package com.ymhase.datastructure.arraynstring;

import java.util.Arrays;

public class PermutationString {

	public String sortString(String str) {
		char[] toChar = str.toCharArray();
		Arrays.sort(toChar);
		return new String(toChar);

	}

	public boolean checkBySort() {
		String str1 = "abcd";
		String str2 = "cdba";

		if (str1.length() != str2.length())
			return false;

		return sortString(str1).equals(sortString(str2));

	}

	public boolean checkByIdenticalchar() {

		String str1 = "aa'bcd";
		String str2 = "cdbaa";

		if (str1.length() != str2.length())
			return false;
		
		int[] letter = new int[128];
		
		for(int i =0 ; i< str1.length() ; i++) {
			letter[(int)str1.charAt(i)]++;
			letter[(int)str2.charAt(i)]--;
		   if(letter[i]!=0)   
			   return false;
			
		}
		
		return true;
	}

	public static void main(String args[]) {

		if (new PermutationString().checkByIdenticalchar())
			System.out.println("true");
		else
			System.out.println("False");

	}

}
