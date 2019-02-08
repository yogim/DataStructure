package com.ymhase.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicateUnsortedLL {
	SinglyLinkedListNode head;
	

	class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
		
		SinglyLinkedListNode(int data){
			this.data = data ;
			this.next = null;
		}
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

	
	
	
	public  SinglyLinkedListNode distinct( ) {

		HashSet<Integer> set = new HashSet();

		SinglyLinkedListNode iterator = this.head;
		SinglyLinkedListNode previous = this.head;

		while (iterator != null) {
			if (!set.contains(iterator.data)) {
				set.add(iterator.data);
			} else {
				
				previous.next = iterator.next;
				
			}
			
			previous = iterator;
			iterator = iterator.next;
		}
		
		

		return head;

	}
	
	

	public void printLinkedList() {
		SinglyLinkedListNode iterator = head;
		while (iterator != null) {
			System.out.println(iterator.data);
			iterator = (SinglyLinkedListNode) iterator.next;
		}
	}

	public static void main(String[] args) {

		RemoveDuplicateUnsortedLL l = new RemoveDuplicateUnsortedLL();
		
		l.addNode(3);
		l.addNode(4);
		l.addNode(8);
		l.addNode(3);
		l.addNode(2);
		l.addNode(6);
		l.addNode(1);
		l.addNode(2);
		l.addNode(6);
		
		
		l.printLinkedList();
	
		l.distinct();
		System.out.println(">>>>");
		l.printLinkedList();
	}

}
