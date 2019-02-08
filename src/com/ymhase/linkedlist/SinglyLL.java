package com.ymhase.linkedlist;

import java.util.HashSet;

public class SinglyLL {

	private SinglyLinkedListNode head = null;

	public SinglyLL() {
		this.head = null;

	}

	public SinglyLinkedListNode getHead() {
		return head;
	}

	public void setHead(SinglyLinkedListNode head) {
		this.head = head;
	}

	public void addNode(int data) {
		SinglyLinkedListNode itr = this.head;

		if (this.head == null) {
			head = new SinglyLinkedListNode(data);
			return;
		}

		while (itr != null) {

			if (itr.next == null) {
				itr.next = new SinglyLinkedListNode(data);
				return;
			}
			itr = (SinglyLinkedListNode) itr.next;

		}
	}

	public void addFirst(int data) {

		// if (this.head == null) {
		// this.head = new Node(data);
		// return;
		// } else {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		newNode.next = head;
		head = newNode;
		// }

	}

	public void addAtPosition(int data, int postion) {
		int length = 0;
		SinglyLinkedListNode itr = this.head;

		if (postion == 0) {
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
			newNode.next = head;
			head = newNode;
			return;

		}

		postion--;

		while (postion != 0) {
			itr = (SinglyLinkedListNode) itr.next;
			postion--;
			if (postion > 0 && itr == null) {
				System.out.println("ll is smaller than the postion");
				return;
			}
		}

		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		if (itr.next != null) {
			SinglyLinkedListNode temp = (SinglyLinkedListNode) itr.next;
			newNode.next = temp;
			itr.next = newNode;

		} else {
			itr.next = newNode;
		}
	}

	public void reverse() {

		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode current = this.head;
		SinglyLinkedListNode next = null;
		while (current != null) {
			next = (SinglyLinkedListNode) current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		this.head = prev;

	}

	public void insertLoop() {
		SinglyLinkedListNode itr = this.head;
		SinglyLinkedListNode itr2 = null;
		int count = 1;
		while (itr.next != null) {

			if (count == 1) {
				itr2 = itr;
			}
			itr = (SinglyLinkedListNode) itr.next;
			count++;

		}
		itr.next = itr2;

		System.out.println("Loop insert at portion at 2");
	}

	public boolean detectLoop() {
		SinglyLinkedListNode itr1 = this.head;
		SinglyLinkedListNode itr2 = (SinglyLinkedListNode) itr1.next;
		int count = 1;
		while (itr2.next != null) {

			if (itr1.next == itr2.next) {
				return true;
			}
			itr1 = (SinglyLinkedListNode) itr1.next;
			for (int i = 0; i <= count; i++)
				itr2 = (SinglyLinkedListNode) itr2.next;

			count++;
		}
		return false;

	}

	public void sum(SinglyLL l1, SinglyLL l2) {

	}

	public void intersectionChecker(SinglyLL L1, SinglyLL l2) {

	}

	public void print() {
		SinglyLinkedListNode itr = this.head;
		if (itr == null)
			System.out.println("ll is not intialised");
		else {
			while (itr != null) {
				System.out.println(itr.data);
				itr = (SinglyLinkedListNode) itr.next;
			}
		}
	}

	public boolean hasCycle(SinglyLinkedListNode head) {

		if (head == null || head.next == null)
			return false;

		SinglyLinkedListNode fast = head;
		SinglyLinkedListNode slow = head;

		while (fast != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;

		}

		return false;

	}

	public void deleteLinkedList() {
		this.setHead(null);
	}

	public SinglyLinkedListNode getAddressOfLastNode() {
		SinglyLinkedListNode iterator = head;
		while (iterator.getNext() != null) {
			iterator = (SinglyLinkedListNode) iterator.getNext();
		}
		return iterator;
	}

	public void addNodeAtEnd(SinglyLinkedListNode newNode) {
		getAddressOfLastNode().setNext(newNode);
	}

	public boolean addNodeAtStart(SinglyLinkedListNode newNode) {
		if (head == null) {
			this.head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		return true;
	}

	public boolean addNodeAtPosition(SinglyLinkedListNode newNode, int postion) {
		SinglyLinkedListNode iterator = head;
		SinglyLinkedListNode prvNode = null;
		if (iterator != null) {
			while (postion < 0) {
				if (iterator.getNext() != null) {
					prvNode = iterator;
					iterator = (SinglyLinkedListNode) iterator.getNext();
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
		SinglyLinkedListNode iterator = head;
		while (iterator != null) {
			System.out.println(iterator.getData());
			iterator = (SinglyLinkedListNode) iterator.getNext();
		}
	}

	public void removeDuplicate() {
		SinglyLinkedListNode iterator = head;
		SinglyLinkedListNode previous = head;
		HashSet<Integer> set = new HashSet<Integer>();
		while (iterator != null) {
			if (!set.contains(iterator.getData())) {
				set.add(iterator.getData());
			} else {
				previous.setNext(iterator.getNext());
			}
			previous = iterator;
			iterator = (SinglyLinkedListNode) iterator.getNext();
		}
	}

	public void deleteStartNode() {
		try {
			this.head = (SinglyLinkedListNode) head.getNext();
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

	public void deleteLastNode() {
		SinglyLinkedListNode iterator = this.head;
		SinglyLinkedListNode prvNode = null;
		try {
			while (iterator.getNext() != null) {
				prvNode = iterator;
				iterator = (SinglyLinkedListNode) iterator.getNext();
			}
			prvNode.setNext(null);
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

	public void addDatainLL() {

		this.addNodeAtEnd(new SinglyLinkedListNode(2));
		this.addNodeAtEnd(new SinglyLinkedListNode(3));
		this.addNodeAtEnd(new SinglyLinkedListNode(4));
		this.addNodeAtEnd(new SinglyLinkedListNode(5));
		this.addNodeAtEnd(new SinglyLinkedListNode(6));
		this.addNodeAtEnd(new SinglyLinkedListNode(7));
		this.addNodeAtEnd(new SinglyLinkedListNode(8));
		this.addNodeAtEnd(new SinglyLinkedListNode(9));
		this.addNodeAtEnd(new SinglyLinkedListNode(10));

	}

	public void reverseLL() {

		SinglyLinkedListNode prvItr = null;
		SinglyLinkedListNode nextItr = null;
		SinglyLinkedListNode current = this.getHead();

		while (current != null) {
			nextItr = (SinglyLinkedListNode) current.getNext();
			current.setNext(prvItr);
			prvItr = current;
			current = nextItr;
		}

		this.head = prvItr;
	}

	public void createIntersectionLL() {
		SinglyLL ll1 = new SinglyLL();
		SinglyLL ll2 = new SinglyLL();
		SinglyLinkedListNode itr1 = null;
		// Node itr2 = null;
		ll1.addNodeAtEnd(new SinglyLinkedListNode(2));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(3));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(4));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(5));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(6));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(7));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(8));
		ll1.addNodeAtEnd(new SinglyLinkedListNode(9));
		itr1 = ll1.getHead();

		for (int i = 0; i < 3; i++) {
			itr1 = (SinglyLinkedListNode) itr1.getNext();
		}

		ll2.addNodeAtEnd(new SinglyLinkedListNode(2, itr1));

		int count = -1;
		for (int i = 0; i < 10; i++) {
			itr1 = (SinglyLinkedListNode) itr1.getNext();
			count++;
			if (count == 2) {

			}

		}

	}

	public SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
		SinglyLinkedListNode newList = null;
		SinglyLinkedListNode itr = newList;

		while ((l1 != null && l2 != null)) {

			if (l1.data == l2.data) {
				if (newList == null) {
					newList = new SinglyLinkedListNode(l1.data);
					l1 = l1.next;
					itr = newList;
					itr.next = new SinglyLinkedListNode(l2.data);
					itr = itr.next;
					l2 = l2.next;
				} else {

					itr.next = new SinglyLinkedListNode(l1.data);
					l1 = l1.next;
					itr = itr.next;
					itr.next = new SinglyLinkedListNode(l2.data);
					itr = itr.next;
					l2 = l2.next;
				}
			} else {
				if (l1.data < l2.data) {
					if (newList == null) {
						newList = new SinglyLinkedListNode(l1.data);
						l1 = l1.next;
						itr = newList;

					} else {

						itr.next = new SinglyLinkedListNode(l1.data);
						l1 = l1.next;
						itr = itr.next;

					}

				} else {
					if (l1.data > l2.data) {
						if (newList == null) {
							newList = new SinglyLinkedListNode(l2.data);
							l2 = l2.next;
							itr = newList;
						} else {

							itr.next = new SinglyLinkedListNode(l2.data);
							l2 = l2.next;
							itr = itr.next;
						}

					}

				}

			}

		}

		if (l1 != null) {
			if (itr == null) {
				newList = new SinglyLinkedListNode(l1.data);
				l1 = l1.next;
				itr = newList;
				itr.next = l1;
			} else
				itr.next = l1;
		}
		if (l2 != null) {

			if (itr == null) {
				newList = new SinglyLinkedListNode(l2.data);
				l2 = l2.next;
				itr = newList;
				itr.next = l2;
			} else
				itr.next = l2;
		}

		return newList;
	}

	public static void main(String[] args) {
		SinglyLL ll = new SinglyLL();

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