package com.ymhase.arraynstring;

public class UniqueChar {

	public boolean isUnique() {
		String str = "abcda";
		boolean[] char_set = new boolean[128];
		
		for (int i=0; i< str.length() ; i++) {
	        if(char_set[str.charAt(i)]) {
	        	return false;
	        }
	        char_set[str.charAt(i)] =  true;
		}
		return true;
	}

	public static void main(String args[]) {
		
		UniqueChar UC = new UniqueChar();
		
		System.out.println(UC.isUnique());
		

	}

}
