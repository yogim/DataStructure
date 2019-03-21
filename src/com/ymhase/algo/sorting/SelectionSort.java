package com.ymhase.algo.sorting;

public class SelectionSort {
	
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 4, 1, 7, 3, 1, 1, 56, 89 };
		
		int minIndex = 0 ;
		
		for(int i = 0 ; i<arr.length;i++) {
			
			minIndex = i;
			
			for(int j = i+1; j<arr.length;j++) {
				
				if(arr[minIndex] > arr[j]) 
					minIndex= j;
					
			}
			
			int temp= arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			
		}
		
		
		for(int i : arr)
			System.out.print(i + ", ");
		
	}

}
