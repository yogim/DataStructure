package com.ymhase.linkedlist;

public class Node {

	private int data;
	private Object next;

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public Node(int data, Object next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Object getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

}
