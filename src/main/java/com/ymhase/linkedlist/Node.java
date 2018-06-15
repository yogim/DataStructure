package com.ymhase.linkedlist;

public class Node {

    private int data;
    private Object next;

    public Node() {
	super();
	this.next = null;
    }

    public Node(int data) {
	super();
	this.data = data;
	this.next = null;
    }

    public Node(int data, Node node) {
	super();
	this.data = data;
	this.next = node;
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

    @Override
    public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);

	/*
	 * if ((obj instanceof Node) && (((Node)obj).data == this.data)) { return true;
	 * } else { return false; }
	 */
    }
}
