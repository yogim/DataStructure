package com.ymhase.stack;

import com.ymhase.linkedlist.*;

public class StackMin {
    private Node first = null;
    private int min;

    public int pop() throws StackException {
	if (first == null) {

	    throw new StackException();
	} else {
	    int data = first.getData();
	    first = (Node) first.getNext();
	    return data;
	}

    }

    public void push(int data) {
	
	if(this.isEmpty()) {
	    min= data;
	}

	Node newNode = new Node(data);
	if (min > data) {
	    min = data;
	}
	newNode.setNext(first);
	first = newNode;
    }

    public boolean isEmpty() {
	if (first == null)
	    return true;
	else
	    return false;

    }

    public Object peek() {

	if (first == null) {
	    return null;
	} else {
	    return first.getData();
	}
    }

    public static void main(String[] args) {

	StackMin s = new StackMin();
	s.push(1);
	s.push(2);
	System.out.println(s.min);
    }

}
