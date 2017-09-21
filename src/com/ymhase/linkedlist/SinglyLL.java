package com.ymhase.linkedlist;

public class SinglyLL {

	private Node head= null;

	public void createLinkedList(int data) {
		head = new Node(data);
	}

	public Node getAddressOfLastNode() {
		Node iterator = head;
		Node prevIterator = null;
		while (iterator != null) {
			System.out.println(iterator.getData());
			prevIterator = iterator;
			iterator = (Node) iterator.getNext();
		}
		return prevIterator;
	}

	public void addNode(int data) {
		getAddressOfLastNode().setNext(new Node(data));
	}

	public void printLinkedList() {
		Node iterator = head;
		while (iterator != null) {
			System.out.println(iterator.getData());
			iterator = (Node) iterator.getNext();
		}
	}

	public static void main(String args[]) {
		SinglyLL ll = new SinglyLL();
		ll.createLinkedList(1);
		ll.addNode(2);
		ll.printLinkedList();

	}
}