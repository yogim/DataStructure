package com.ymhase.datastructure.arraynstring;

import java.util.Arrays;

public class permutationStrChecker {

    public String sort(String str) {

	char[] content = str.toCharArray();
	Arrays.sort(content);
	return new String(content);

    }

    public boolean sortingApproch(String str1, String str2) {

	if (str1.length() != str2.length())
	    return false;

	return sort(str1).equals(sort(str2));
    }

    public static void main(String[] args) {

	
	permutationStrChecker checker = new permutationStrChecker();
	if(checker.sortingApproch("abcd", "abde")) {
	    System.out.println("equal");
	}else {
	    System.out.println("not equal");
	}
    }

}
