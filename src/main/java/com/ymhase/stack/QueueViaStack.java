package com.ymhase.stack;

public class QueueViaStack {

    Stack<Integer> newStack;
    Stack<Integer> oldStack;

    public QueueViaStack() {

	newStack = new Stack<>();
	oldStack = new Stack<>();
    }

    public void moveNewtoOld() {

	while (!newStack.isEmpty()) {
	    try {
		oldStack.push(newStack.pop());
	    } catch (StackException e) {
		e.printStackTrace();
	    }
	}

    }

    public void moveOldtoNew() {
	while (!oldStack.isEmpty()) {
	    try {
		newStack.push(oldStack.pop());
	    } catch (StackException e) {
		e.printStackTrace();
	    }
	}

    }

    public void add(Integer data) {

	newStack.push(data);

    }

    public Integer remove() {
	moveNewtoOld();
	Integer item=null;
	try {
	   item = oldStack.pop();
	} catch (StackException e) {
	    e.printStackTrace();
	}
	
	moveOldtoNew();

	return item;
    }

    public Integer peek() {

	Integer item;
	moveNewtoOld();
	item = oldStack.peek();
	moveOldtoNew();
	return item;

    }

    public boolean isEmpty() {

	if (newStack.isEmpty())
	    return true;
	else
	    return false;

    }

    public static void main(String[] args) throws StackException {

	QueueViaStack qs = new QueueViaStack();
	System.out.println(qs.isEmpty());
	qs.add(1);
	qs.add(2);
	qs.remove();
	System.out.println(qs.peek());

    }

}
