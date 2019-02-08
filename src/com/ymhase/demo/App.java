package com.ymhase.demo;

public class App {

	public int reverse(int x) {

		if (x / 10 == 0)
			return x;

		int mf = 1;

		if (x < 0) {
			mf = -1;
			x = x * -1;
		}

		int ans = 0;
		StringBuilder str = new StringBuilder();
		while (x != 0) {

			str.append(x % 10);
			x = x / 10;

		}

		String s = str.toString();
		Integer a = Integer.valueOf(s);

		return ans * mf;
	}

	public void printCharArr() {
		char[] s = {'h','e','l','l','o'};
		
		int i = 0;
        int j = s.length-1;
        char temp;
        int mid =(s.length-1)/2;
        while(i!=mid){
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j--;
            i++;
            
        }
		
        for(char c : s) {
        	System.out.println(c);
        }
        
	}
	
	public static void main(String[] args) {

		App a = new App();
		a.printCharArr();
		System.out.println();
	}

}
