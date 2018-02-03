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

    public static void main(String args[]) {
		new StringRotation().isrotation("abcd", "cdaa");
	
	
    }

}
