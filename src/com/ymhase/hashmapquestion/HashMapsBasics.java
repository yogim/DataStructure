package com.ymhase.hashmapquestion;

import java.util.HashMap;

public class HashMapsBasics {

    public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("abcd", 1);
		hm.put("abcd", 2);
		System.out.println(hm.get("abcd"));
    
    }

}
