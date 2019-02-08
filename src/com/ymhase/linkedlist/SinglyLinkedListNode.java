package com.ymhase.linkedlist;

public class SinglyLinkedListNode {

	public int data;
	public SinglyLinkedListNode next;

	public SinglyLinkedListNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public SinglyLinkedListNode(int data, SinglyLinkedListNode node) {
		super();
		this.data = data;
		this.next = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SinglyLinkedListNode getNext() {
		return next;
	}

	public void setNext(SinglyLinkedListNode next) {
		this.next = next;
	}

}
