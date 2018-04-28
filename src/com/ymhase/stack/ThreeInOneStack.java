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

    public void push(int stackNumber, int value) {

	if (!isFull(stackNumber)) {
	    System.out.println("is full");
	}

	size[stackNumber]++;
	values[indexOfTop(stackNumber)] = value;
	System.out.println(values[0]);

    }

    public boolean isFull(int stackNum) throws  NullPointerException {

	if (size[stackNum] >= capacity) {
	    throw new NullPointerException();
	}
	return true;
    }

    public int indexOfTop(int stackNum) {

	int offset = stackNum * capacity;
	int index = size[stackNum] + offset - 1;

	return index;
    }

    public static void main(String args[]) {

	ThreeInOneStack stack = new ThreeInOneStack(4);
	stack.push(0, 1);
	
	
    }

}
