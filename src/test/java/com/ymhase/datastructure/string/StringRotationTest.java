package com.ymhase.datastructure.string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringRotationTest {

    public int getMin(int[] array) {
	Arrays.sort(array);
	int max = array[array.length - 1];
	ArrayList<Integer> a = new ArrayList<>();

	for (int i = 0; i <= max; i++) {
	    a.add(i);
	}

	int flag = 0;
	int check = 1;
	while (flag != 1) {

	    if (a.contains(check)) {
		flag = 1;
		break;
	    }

	    check++;
	}

	return check;
    }

    public static void main(String[] args) {

	int[] array = {1,3,6,4,1,2};
	Arrays.sort(array);
	int max = array[array.length - 1];
	ArrayList<Integer> a = new ArrayList<>();

	for (int i = 0; i <= max; i++) {
	    a.add(i);
	}

	int flag = 0;
	int check = 1;
	while (flag != 1) {

	    if (a.contains(check)) {
		flag = 1;
		break;
	    }

	    check++;
	}

	System.out.println(check);

    }

}
