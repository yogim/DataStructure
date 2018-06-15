package com.ymhase.recursion;

import java.util.Arrays;

public class StringLength {
	private static void printTriangle(int[] a) {

		if (a.length < 1)
			return;

		int[] newArray = new int[a.length - 1];
		for (int i = 0; i < a.length-1; i++) {
			newArray[i] = a[i] + a[i + 1];
		}

		printTriangle(newArray);
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		printTriangle(A);
	}

}
