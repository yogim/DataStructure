package com.ymhase.recursion;

public class basicRecursion {

	public void print() {
		System.out.println("Hello world");
	}

	public void printNumber(int n) {

		while (!(n <= 0)) {
			System.out.println(n);
			n--;
		}

	}

	private void printNumberUsingRecursion(int n) {

		if (n > 0) {
			printNumberUsingRecursion(n - 1);
			System.out.println(n);
		}

	}

	public static void main(String args[]) {

		basicRecursion br = new basicRecursion();
		br.printNumberUsingRecursion(5);;
		

	}
}
