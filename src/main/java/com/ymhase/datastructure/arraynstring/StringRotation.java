package com.ymhase.datastructure.arraynstring;

import com.ymhase.common.RunAlgorithm;

public class StringRotation  implements RunAlgorithm{

    public void isrotation(String s1, String s2) {

	if (s1.length() == s2.length() && s1.length() > 0) {

	    String s1s1 = s1 + s1;

	    if (isSubstring(s1s1, s2)) {
		System.out.println("is rotation");
	    } else {
		System.out.println("Not rotation");
	    }

	}

    }

    public static boolean isSubstring(String s1, String s2) {
	if (s1.length() == s2.length())
	    return s1.equals(s2);
	else if (s1.length() > s2.length())
	    return s1.contains(s2);
	else
	    return s2.contains(s1);

    }

    // find postion of start char of string1 in string2. Then, start comparing each
    // char in rotation manner
    public boolean checkWithCharArray(String string1, String string2 ) {

	char[] charString1 = string1.toCharArray();
	char[] charString2 = string2.toCharArray();
	int postion;
	int iterator;
	boolean isRotation = true;

	iterator = 0;

	while (charString1[0] != charString2[iterator]) {
	    iterator++;
	}

	System.out.println(iterator);
	System.out.println(string1.length() - iterator - 1);
	postion = iterator;
	int i =0;

	while (iterator <= (string1.length() - 1)) {
	    if (charString1[i] != charString2[iterator]) {
		isRotation = false;
	    }
	    iterator++;
	    i++;
	}

	iterator = 0;

	while (iterator < (postion)) {
	    if (charString1[i] != charString2[iterator]) {
		isRotation = false;
	    }
	    iterator++;
	    i++;
	}
	
	
	return isRotation;
	
    }


    @Override
    public Object runAlgorithm(String string1, String string2 ) {
	
	
	return this.checkWithCharArray(string1, string2);
    }

    @Override
    public Object runAlgorithm() {
	// TODO Auto-generated method stub
	return null;
    }

}
