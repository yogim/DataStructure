package com.ymhase.arraynstring;

public class OneEditInsertDelete {

    public boolean checkOneEditInserDelete(String str1, String str2) {

	if (str1.length() == str2.length()) {
	    return checkReplace(str1, str2);
	} else {
	    if (str1.length() + 1 == str2.length()) {
		return checkInsert(str1, str2);
	    } else {
		if (str1.length() - 1 == str2.length()) {
		    return checkDelete(str1, str2);
		}
	    }
	}

	return true;
    }

    private boolean checkDelete(String str1, String str2) {

//	int onedelete;
	for (int i = 0; i <= str1.length(); i++) {

	    if (str1.charAt(i) != str2.charAt(i)) {
	    }

	}
	
	return false;

    }

    private boolean checkInsert(String str1, String str2) {
	
	return false;

    }

    private boolean checkReplace(String str1, String str2) {

	return false;
    }

    public static void main(String args[]) {

	
    }

}
