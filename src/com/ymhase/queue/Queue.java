package com.ymhase.queue;

import com.ymhase.common.Node;

public class Queue<T> {
    private Node<T> firstNode = null;
    private Node<T> lastNode = null;

    public void add(T data) {
	Node<T> newNode = new Node<T>(data);
	if (firstNode == null) {
	    firstNode = newNode;
	    lastNode = newNode;
	} else {
	    newNode.setNext(lastNode);
	    lastNode = newNode;
	}
    }

    public T remove() {
	T data = null;
	if (firstNode == null) {
	    System.out.println("The queue is empty");
	} else {
	    data = firstNode.getData();
	    firstNode = firstNode.getNext();
	    if (firstNode == null)
		lastNode = null;
	}

	return data;
    }

    public boolean isEmpty() {

	if (lastNode == null)
	    return true;
	else
	    return false;
    }

    public T peek() {

	if (firstNode != null)
	    return firstNode.getData();
	else
	    return null;
    }

    public static void main(String[] args) {

	Queue<Integer> queue = new Queue<>();
	queue.add(1);
	System.out.println(queue.peek());
	queue.remove();
	System.out.println(queue.peek());

    }
}
