package com.ymhase.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binarytree {

	private BTNode head;

	public Binarytree() {

		this.head = null;
	}

	public void insert(int data) {
		if (head == null) {
			head = new BTNode(data);
		} else {
			if (this.head.getData() > data) {
				insertAtbranch(data, this.head);
			} else {
				insertAtbranch(data, this.head);
			}
		}
	}

	private void insertAtbranch(int data, BTNode iterator) {
		if (iterator.getData() > data) {
			if (iterator.getLeftNode() == null) {
				iterator.setLeftNode(new BTNode(data));
			} else {
				insertAtbranch(data, iterator.getLeftNode());
			}

		} else {
			if (iterator.getRightNode() == null) {
				iterator.setRightNode(new BTNode(data));
			} else {
				insertAtbranch(data, iterator.getRightNode());
			}

		}

	}

	public void preorderTraversal() {

		preorder(head);

	}

	public void inorderTraversal() {

		inorder(head);

	}

	public void postorderTraversal() {

		postorder(head);

	}

	private void preorder(BTNode node) {

		if (node == null)
			return;

		System.out.println(node.getData());

		preorder(node.getLeftNode());

		preorder(node.getRightNode());

	}

	private void inorder(BTNode node) {

		if (node == null)
			return;

		inorder(node.getLeftNode());

		System.out.println(node.getData());

		inorder(node.getRightNode());

	}

	private void postorder(BTNode node) {

		if (node == null)
			return;

		postorder(node.getLeftNode());

		postorder(node.getRightNode());

		System.out.println(node.getData());

	}

	private void insertWithoutRecursion(int data) {

		BTNode iterator = head;

		BTNode parent = null;
		if (iterator == null) {

			this.head = new BTNode(data);
			return;
		}

		// iterator.setLeft(new BTNode(data));

		while (iterator != null) {
			parent = iterator;
			if (iterator.getData() > data) {
				iterator = iterator.getLeftNode();
			} else {
				iterator = iterator.getRightNode();
			}
		}

		if (parent.getData() > data) {
			parent.setLeftNode(new BTNode(data));
		} else {
			parent.setRightNode(new BTNode(data));
		}

	}

	private void postorderWithoutIteration() {
		Stack<BTNode> s1 = new Stack<>();
		Stack<BTNode> s2 = new Stack<>();

		if (this.head != null) {
			s1.push(this.head);
		} else {
			System.out.println("Tree is empty");
			return;
		}

		while ((!s1.isEmpty()) && (s1.peek() != null)) {

			s2.push(s1.pop());

			if (s2.peek().getLeftNode() != null) {
				// System.out.println(s2.peek().getLeft().getData());
				// System.out.println(s2.peek().getData());

				s1.push(s2.peek().getLeftNode());

			}

			if (s2.peek().getRightNode() != null) {
				s1.push(s2.peek().getRightNode());
			}

		}

		while (!s2.isEmpty()) {
			System.out.println(s2.pop().getData());

		}

	}

	public void search(int data) {
		BTNode itr = this.head;
		while (itr != null) {
			if (itr.getData() == data) {
				System.out.println("Found");
				break;
			}
			if (itr.getData() > data) {
				itr = itr.getLeftNode();
			} else {
				itr = itr.getRightNode();
			}
		}
	}

	public void delete(int data) {
		BTNode itr = this.head;
		BTNode prvitr = null;

		while (itr != null) {

			if (itr.getData() == data) {
				itr.getRightNode().setLeftNode(itr.getLeftNode());
				prvitr.setRightNode(itr.getRightNode());
				break;
			}

			prvitr = itr;
			if (itr.getData() > data) {
				itr = itr.getLeftNode();
			} else {
				itr = itr.getRightNode();
			}

		}

	}

	public void dfs() {

		BTNode itr = this.head;
		Stack<BTNode> s = new Stack<>();
		s.push(itr);

		while (!s.empty()) {

		}

	}

	public void bfs() {

		// BTNode itr = this.head;
		Queue<BTNode> q = new LinkedList<>();
		q.add(this.head);

		while (!q.isEmpty()) {
			if (q.peek().getLeftNode() != null) {
				// System.out.println(q.peek().getData());
				q.add(q.peek().getLeftNode());
			}

			if (q.peek().getRightNode() != null) {
				// System.out.println(q.peek().getData());
				q.add(q.peek().getRightNode());
			}

			System.out.println(q.poll().getData());

		}

	}

	private void intiaiseWithoutRecusion() {
		this.insert(10);
		this.insert(3);
		this.insert(5);
		this.insert(9);
		this.insert(13);
		this.insert(16);
		this.insert(11);
		this.insert(19);
		this.insert(20);

	}

	private void intialiseWithoutRecursion() {

		this.insertWithoutRecursion(10);
		this.insertWithoutRecursion(3);
		this.insertWithoutRecursion(2);
		this.insertWithoutRecursion(9);
		this.insertWithoutRecursion(13);
		this.insertWithoutRecursion(16);
		this.insertWithoutRecursion(11);
		this.insertWithoutRecursion(19);
		this.insertWithoutRecursion(20);

	}

	public static void main(String[] args) {

		Binarytree BT = new Binarytree();
		BT.intialiseWithoutRecursion();
		// BT.postorderTraversal();
		System.out.println("----");
		BT.bfs();

	}

}
