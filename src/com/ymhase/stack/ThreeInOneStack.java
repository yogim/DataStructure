package com.ymhase.stack;

public class ThreeInOneStack {

    private int numberOfStack = 3;
    private int capacity;
    private int[] values;
    private int[] size;

    public ThreeInOneStack(int capacity) {
	this.capacity = capacity;
	values = new int[numberOfStack * capacity];
	size = new int[numberOfStack];
    }

    public void push(int stackNumber, int value) throws StackException {

	if (!isFull(stackNumber)) {
	    throw new StackException();
	}

	size[stackNumber]++;
	values[indexOfTop(stackNumber)] = value;
    }

    public int peek(int stackNumber) throws StackException {

	if ((size[stackNumber] == 0)) {
	    throw new StackException();
	}
	return values[indexOfTop(stackNumber)];

    }

    public int pop(int stackNumber) throws StackException {

	if (size[stackNumber] == 0) {
	    throw new StackException();
	}

	int item = values[indexOfTop(stackNumber)];

	size[stackNumber]--;
	return item;

    }

    public boolean isFull(int stackNum) throws NullPointerException {

	if (size[stackNum] >= capacity) {
	    throw new NullPointerException();
	}
	return true;
    }

    public int indexOfTop(int stackNum) {

	int offset = stackNum * capacity;
	return (size[stackNum] + offset - 1);
    }
    
    
    public boolean isEmpty(int stackNumber) {
	if(size[stackNumber]==0) {
	    return true;
	}
	
	return false;
	
    }

    public static void main(String args[]) {

	ThreeInOneStack stack = new ThreeInOneStack(4);
	try {

	    System.out.println(stack.peek(0));
	    System.out.println(stack.isEmpty(0));
	    System.out.println(stack.pop(0));
	    System.out.println(stack.isEmpty(0));
	    System.out.println(stack.peek(0));

	} catch (Exception ex) {

	    ex.printStackTrace();
	}

    }

}
