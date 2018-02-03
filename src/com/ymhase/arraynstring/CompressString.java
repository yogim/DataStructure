package com.ymhase.arraynstring;

public class CompressString {

	
	
	public void compress(String str) {
		
		char[] strArray = str.toCharArray();
		
		char iterator = strArray[0];
		int counter=1;
		
		String  compressedStr="";
		
		for (int i =1 ; i<strArray.length ;  i ++) {
			
			if (iterator == strArray[i]) {
				counter++;
			}else {
				
				compressedStr = compressedStr+""+iterator +""+counter;
				counter=1;
				iterator = strArray[i];
			}
			
		}
		
		compressedStr = compressedStr+""+iterator +""+counter;
		
		
		System.out.println(compressedStr);
		
	}
	
	public static void main(String[] args) {
	
		
		
		new CompressString().compress("aaabbccccc");
	}

}
