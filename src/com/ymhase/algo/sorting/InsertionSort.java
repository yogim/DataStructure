package com.ymhase.algo.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 1, 7, 3, 1, 1, 1 ,1 ,1 , 1, 56, 89 };

		int i, key, j;

		for (i = 1; i < arr.length; i++) {

			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}

		for (int k : arr)
			System.out.print(k + ",");

	}

}
