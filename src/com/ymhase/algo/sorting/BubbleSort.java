package com.ymhase.algo.sorting;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,1,7,3,1,56,89};
		
		
		for(int i  = 0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		
		
		for(int i : arr)
			System.out.print(i + ",");
		
	}
	
	
	

}
