package com.ymhase.linkedlist;

import java.util.HashSet;

public class SinglyLL {

    private Node head = null;

    public Node getHead() {
	return head;
    }

    public void setHead(Node head) {
	this.head = head;
    }

    public void createLinkedList(Node newNode) {
	if (head == null) {
	    head = newNode;
	} else {
	    System.out.println("LL exist , use add function");
	}
    }

    public void deleteLinkedList() {
	this.setHead(null);
    }

    public Node getAddressOfLastNode() {
	Node iterator = head;
	while (iterator.getNext() != null) {
	    iterator = (Node) iterator.getNext();
	}
	return iterator;
    }

    public void addNodeAtEnd(Node newNode) {
	getAddressOfLastNode().setNext(newNode);
    }

    public boolean addNodeAtStart(Node newNode) {
	if (head == null) {
	    this.head = newNode;
	} else {
	    newNode.setNext(head);
	    head = newNode;
	}
	return true;
    }

    public boolean addNodeAtPosition(Node newNode, int postion) {
	Node iterator = head;
	Node prvNode = null;
	if (iterator != null) {
	    while (postion < 0) {
		if (iterator.getNext() != null) {
		    prvNode = iterator;
		    iterator = (Node) iterator.getNext();
		    postion--;
		} else {
		    System.out.println("Linked list is short");
		    return false;
		}
		newNode.setNext(iterator.getNext());
		prvNode.setNext(newNode);
	    }
	}
	return true;
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

    public void deleteStartNode() {
	try {
	    this.head = (Node) head.getNext();
	} catch (Exception e) {
	    System.out.println("Exception occured");
	}
    }

    public void deleteLastNode() {
	Node iterator = this.head;
	Node prvNode = null;
	try {
	    while (iterator.getNext() != null) {
		prvNode = iterator;
		iterator = (Node) iterator.getNext();
	    }
	    prvNode.setNext(null);
	} catch (Exception e) {
	    System.out.println("Exception occured");
	}
    }

    public void reverseLL() {

    }

    public void createIntersectionLL() {
	SinglyLL ll1 = new SinglyLL();
	SinglyLL ll2 = new SinglyLL();
	Node itr1 = null;
	Node itr2 = null;
	ll1.createLinkedList(new Node(1));
	ll1.addNodeAtEnd(new Node(2));
	ll1.addNodeAtEnd(new Node(3));
	ll1.addNodeAtEnd(new Node(4));
	ll1.addNodeAtEnd(new Node(5));
	ll1.addNodeAtEnd(new Node(6));
	ll1.addNodeAtEnd(new Node(7));
	ll1.addNodeAtEnd(new Node(8));
	ll1.addNodeAtEnd(new Node(9));
	itr1 = ll1.getHead();

	for (int i = 0; i < 3; i++) {
	    itr1 = (Node) itr1.getNext();
	}

	ll2.createLinkedList(new Node(1));
	ll2.addNodeAtEnd(new Node(2, itr1));

	int count = -1;
	for (int i = 0; i < 10; i++) {
	    itr1 = (Node) itr1.getNext();
	    count++;
	    if (count == 2) {

	    }

	}

    }

    public static void main(String args[]) {
	SinglyLL ll = new SinglyLL();
	ll.createLinkedList(new Node(1));
	ll.addNodeAtStart(new Node(2));
	ll.deleteLastNode();
	ll.printLinkedList();

    }
}