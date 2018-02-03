package com.ymhase.arraynstring;

public class OneEditInsertDelete {

	public boolean checkOneEditInserDelete(String str1, String str2) {

 		int editInserDeleteStatus = 0;
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();

		int[] charInStr1 = new int[128];
		int[] charInStr2 = new int[128];

		for (int i = 0; i <= str1Array.length - 1; i++) {
			charInStr1[(int) str1Array[i]]++;

		}
		for (int i = 0; i <=str2Array.length - 1; i++) {
			charInStr2[(int) str2Array[i]]++;

		}

		for (int i = 0; i < 128; i++) {
			if (charInStr1[i] != charInStr2[i]) {
				editInserDeleteStatus++;
			}

		}

		if (editInserDeleteStatus > 1) {
			return false;
		}

		return true;

	}

	public static void main(String args[]) {
		
		
		System.out.println(new OneEditInsertDelete().checkOneEditInserDelete("pale", "ale"));

	}

}
