package com.ymhase.stack;

public class StackSort {

    public static void main(String[] args) {
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	Integer temp;
	int count;

	stack1.push(1);
	stack1.push(3);
	stack1.push(4);
	stack1.push(2);
	stack1.push(5);
	try {
	    stack2.push(stack1.pop());
	    while (!stack2.isEmpty()) {
		temp = stack1.pop();
		count = 0;

		while (stack2.peek() != null && temp >= stack2.peek()) {
		    stack1.push(stack2.pop());
		    count++;
		}

		stack2.push(temp);

		while (count > 0) {
		    stack2.push(stack1.pop());
		    count--;
		}

		if (stack1.isEmpty()) {
		    while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		    }
		}

	    }
	    while (!stack1.isEmpty()) {
		System.out.println(">" + stack1.pop());
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
