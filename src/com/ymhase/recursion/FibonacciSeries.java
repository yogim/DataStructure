package com.ymhase.recursion;

public class FibonacciSeries {

	void printFibonacci(int count) {
		int f = 0;
		int s = 1;
		System.out.println(f);
		System.out.println(s);
		for (int i = 2; i < count; i++) {
			int number = f + s;
			System.out.println(number);
			f = s;
			s = number;

		}
	}

	/*  void printFibonacciByRecursion( int count) {
		
		 static int f = 0;
		 static  int s = 1;
		 static  int n3;
		if (count > 0) {
			n3 = f + s;
			f = s;
			s = n3;
			System.out.println(n3);
			printFibonacciByRecursion(count - 1);
		}
	}*/

	

	public static void main(String args[]) {
		FibonacciSeries fs = new FibonacciSeries();
		System.out.println("0");
		System.out.println("1");
		//FibonacciSeries.printFibonacciByRecursion(13);
	}
}
