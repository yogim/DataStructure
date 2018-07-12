package com.ymhase.arraynstring;

public class StringRotation {

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
    public static void checkWithCharArray() {

	String str = "waterbottle";
	String str2 = "erbottaewat";
	char[] s = str.toCharArray();
	char[] s2 = str2.toCharArray();
	int postion;
	int itr;
	boolean isRotation = true;

	itr = 0;

	while (s[0] != s2[itr]) {
	    itr++;
	}

	System.out.println(itr);
	System.out.println(str.length() - itr - 1);
	postion = itr;
	int i =0;

	while (itr <= (str.length() - 1)) {
	    if (s[i] != s2[itr]) {
		isRotation = false;
	    }
	    itr++;
	    i++;
	}

	itr = 0;

	while (itr < (postion)) {
	    if (s[i] != s2[itr]) {
		isRotation = false;
	    }
	    itr++;
	    i++;
	}
	
	
	if(isRotation) {
	    System.out.println("is rotation");
	}else {
	    System.out.println("not a rotation");
	}

    }

    public static void main(String args[]) {
	//new StringRotation().checkWithCharArray();

    }

}
