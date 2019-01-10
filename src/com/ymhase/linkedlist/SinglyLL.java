package com.ymhase.linkedlist;

import java.util.HashSet;

import javax.swing.text.Position;

public class SinglyLL {

	private Node head = null;

	public SinglyLL() {
		this.head = null;

	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addNode(int data) {
		Node itr = this.head;

		if (this.head == null) {
			head = new Node(data);
			return;
		}

		while (itr != null) {

			if (itr.next == null) {
				itr.next = new Node(data);
				return;
			}
			itr = (Node) itr.next;

		}
	}

	public void addFirst(int data) {

		// if (this.head == null) {
		// this.head = new Node(data);
		// return;
		// } else {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		// }

	}

	public void addAtPosition(int data, int postion) {
		int length = 0;
		Node itr = this.head;

		if (postion == 0) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			return;

		}

		postion--;

		while (postion != 0) {
			itr = (Node) itr.next;
			postion--;
			if (postion > 0 && itr == null) {
				System.out.println("ll is smaller than the postion");
				return;
			}
		}

		Node newNode = new Node(data);
		if (itr.next != null) {
			Node temp = (Node) itr.next;
			newNode.next = temp;
			itr.next = newNode;

		} else {
			itr.next = newNode;
		}
	}

	public void reverse() {

		Node prev = null;
		Node current = this.head;
		Node next = null;
		while (current != null) {
			next = (Node) current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		this.head = prev;

	}

	public void insertLoop() {
		Node itr = this.head;
		Node itr2 = null;
		int count = 1;
		while (itr.next != null) {

			if (count == 1) {
				itr2 = itr;
			}
			itr = (Node) itr.next;
			count++;

		}
		itr.next = itr2;

		System.out.println("Loop insert at portion at 2");
	}

	public boolean detectLoop() {
		Node itr1 = this.head;
		Node itr2 = (Node) itr1.next;
		int count =1;
		while (itr2.next != null) {

			if (itr1.next == itr2.next) {
				return true;
			}
			itr1 = (Node) itr1.next;
			for(int i = 0; i<=count;i++)
				itr2 = (Node) itr2.next;

			count++;
		}
		return false;

	}
	
	
	public void sum(SinglyLL l1, SinglyLL l2) {
		
		
		
	}

	
	public  void intersectionChecker(SinglyLL L1, SinglyLL l2) {
		
	}
	
	
	public void print() {
		Node itr = this.head;
		if (itr == null)
			System.out.println("ll is not intialised");
		else {
			while (itr != null) {
				System.out.println(itr.data);
				itr = (Node) itr.next;
			}
		}
	}

	public static void main(String[] args) {
		SinglyLL ll = new SinglyLL();

		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
	//	ll.addNode(4);
		ll.insertLoop();
		System.out.println(ll.detectLoop());

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

	public void addDatainLL() {

		this.addNodeAtEnd(new Node(2));
		this.addNodeAtEnd(new Node(3));
		this.addNodeAtEnd(new Node(4));
		this.addNodeAtEnd(new Node(5));
		this.addNodeAtEnd(new Node(6));
		this.addNodeAtEnd(new Node(7));
		this.addNodeAtEnd(new Node(8));
		this.addNodeAtEnd(new Node(9));
		this.addNodeAtEnd(new Node(10));

	}

	public void reverseLL() {

		Node prvItr = null;
		Node nextItr = null;
		Node current = this.getHead();

		while (current != null) {
			nextItr = (Node) current.getNext();
			current.setNext(prvItr);
			prvItr = current;
			current = nextItr;
		}

		this.head = prvItr;
	}

	public void createIntersectionLL() {
		SinglyLL ll1 = new SinglyLL();
		SinglyLL ll2 = new SinglyLL();
		Node itr1 = null;
		// Node itr2 = null;
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

		ll2.addNodeAtEnd(new Node(2, itr1));

		int count = -1;
		for (int i = 0; i < 10; i++) {
			itr1 = (Node) itr1.getNext();
			count++;
			if (count == 2) {

			}

		}

	}

	// public static void main(String args[]) {
	// SinglyLL ll = new SinglyLL();
	// ll.addDatainLL();
	// ll.printLinkedList();
	// ll.reverseLL();
	// ll.printLinkedList();
	//
	// }
}