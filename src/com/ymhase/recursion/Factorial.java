package com.ymhase.recursion;

public class Factorial {

	private int ofNumber;

	public Factorial(int ofNumber) {
		this.ofNumber = ofNumber;
	}

	public void findFactoril() {
		int product = 1;
		int tempNum = ofNumber;
		for (int i = 0; i < ofNumber; i++) {
			product = product * tempNum;
			tempNum--;
		}
		System.out.println(product);
	}

	public int findFactorialUsingRecursion(int n) {

		if (n >= 1) {
			return n * findFactorialUsingRecursion(n - 1);

		}
		return 1;
	}

	public static void main(String args[]) {
		Factorial fact = new Factorial(5);
		Factorial fact1 = new Factorial(5);
		System.out.println(fact.hashCode());
		System.out.println(fact);
		System.out.println(fact.toString());
		/*int product = fact.findFactorialUsingRecursion(fact.ofNumber);
		System.out.println(product);*/
		
		int a =2 ,b=2;
		if(a==b)
			System.out.println("print equal");

		
		if(fact==fact1) 
			System.out.println("print equal objects");
		
		if(fact.equals(fact))
			System.out.println("print equal objects");

	}

}
