package com.ymhase.stack;

import com.ymhase.common.Node;

public class Stack<T> {
    private Node<T> first = null;

    public T pop() throws StackException{
	if (first == null) {
	  
	    throw  new StackException();
	} else {
	    T data = first.getData();
	    first = first.getNext();
	    return data;
	}

    }

    public void push(T data) {
	Node<T> newNode = new Node<T>(data);
	newNode.setNext(first);

	first = newNode;
    }
    
    public boolean isEmpty() {
	if(first==null)
	    return true;
	else
	    return false;
	
    }

    public T peek() {

	if (first == null) {
	    return null;
	} else {
	    return first.getData();
	}
    }

    public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	
	try {
	    stack.pop();
	} catch (StackException e) {
	    System.out.println(e.getMsg());
	    e.printStackTrace();
	}

    }

}
