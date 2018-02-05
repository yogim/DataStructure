package com.ymhase.linkedlist;

import java.util.HashSet;

public class SinglyLL {

    private Node head = null;

    public void createLinkedList(int data) {
	head = new Node(data);
    }

    public Node getAddressOfLastNode() {
	Node iterator = head;
	Node prevIterator = null;
	while (iterator != null) {
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

    public void removeDuplicate() {
	Node iterator = head;
	Node previous = head;
	HashSet<Integer> set = new HashSet<Integer>();
	while (iterator != null) {

	    if (!set.contains(iterator.getData())) {
		set.add(iterator.getData());
		
	    } else {
		previous.setNext(iterator.getNext());
		
	    }
	    previous = iterator;
	    iterator = (Node) iterator.getNext();
	    
	}
    }

    public static void main(String args[]) {
	SinglyLL ll = new SinglyLL();
	ll.createLinkedList(1);
	ll.addNode(2);
	ll.addNode(2);
	ll.addNode(3);
	ll.addNode(3);
	ll.removeDuplicate();
	ll.printLinkedList();

    }
}