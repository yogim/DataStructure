package com.ymhase.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public BTNode root;

	public BinaryTree() {

		this.root = null;
	}

	public void insertNode(int data) {
		BTNode bt = this.root;
		Queue<BTNode> q = new LinkedList<BTNode>();

		q.add(bt);

		while (true) {
			BTNode node = q.poll();
			if (node.leftNode == null) {
				node = new BTNode(data);
				break;
			}
			if (node.leftNode == null) {
				node = new BTNode(data);
				break;
			}

			if (node.leftNode != null)
				q.add(node.leftNode);

			if (node.rightNode != null)
				q.add(node.leftNode);

		}

	}

	public void search(int data) {
		BTNode itr = this.root;
		while (itr != null) {
			if (itr.getData() == data) {
				System.out.println("Found");
				return;
			}
			if (itr.getData() > data) {
				itr = itr.getLeftNode();
			} else {
				itr = itr.getRightNode();
			}
		}
	}

	public void delete(int data) {
		BTNode itr = this.root;
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

	public void displayTree(BTNode root) {
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);

//		if (queue.peek() != null)
//			System.out.println(queue.peek().data);

		while (!queue.isEmpty()) {

			BTNode itr = queue.poll();
			
			System.out.println(itr.data);

			if (itr.leftNode != null) {
				//System.out.println(itr.leftNode.data);
				queue.add(itr.leftNode);
			}

			if (itr.rightNode != null) {
				//System.out.println(itr.rightNode.data);
				queue.add(itr.rightNode);
			}

		}

	}

	public BTNode intialiseTree(int[] arr) {

		//BTNode root = null;

		Queue<BTNode> q = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			if (root == null) {
				root = new BTNode(arr[i]);
				q.add(root);
			} else {
				if (q.peek().leftNode == null) {
					BTNode n = new BTNode(arr[i]);
					q.peek().leftNode = n;
					q.add(n);
				} else {
					BTNode n = new BTNode(arr[i]);
					q.peek().rightNode = n;
					q.add(n);
				}

				if (q.peek().leftNode != null && q.peek().rightNode != null)
					q.remove();
			}

		}

		return root;
	}

	public BTNode getRoot() {
		return this.root;
	}

	public static void main(String[] args) {

	}

}
