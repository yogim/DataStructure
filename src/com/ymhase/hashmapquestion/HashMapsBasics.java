package com.ymhase.hashmapquestion;

import java.util.*;

public class HashMapsBasics {

    public static void main(String[] args) {

	Map<Student, StudentReportCard> hm = new HashMap<Student, StudentReportCard>();
	
	hm.put(new Student("yogi",1), new StudentReportCard(60, 'A'));
	hm.put(new Student("yogi",1), new StudentReportCard(60, 'A'));
	hm.put(new Student("yogi",1), new StudentReportCard(60, 'A'));
	hm.put(new Student("yogi",1), new StudentReportCard(60, 'A'));
	hm.put(new Student("yogi",1), new StudentReportCard(60, 'A'));
	

	Map<String, Integer> hm2 = new HashMap<String, Integer>();
	hm2.put("abcd", 123);
	hm2.put("abcd", 123);
	hm2.put("abcd", 123);
	
	
	
	
	System.out.println(hm.size());	
	System.out.println(hm2.size());	
	System.out.println(hm.get(new Student("yogi",1)));
	
	
    }

}
