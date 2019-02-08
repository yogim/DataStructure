package com.ymhase.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public BTNode root;

	public BinaryTree() {

		this.root = null;
	}

	public void insert(int data) {
		if (root == null) {
			root = new BTNode(data);
		} else {
			if (this.root.getData() > data) {
				insertAtbranch(data, this.root);
			} else {
				insertAtbranch(data, this.root);
			}
		}
	}
	public void insertAtbranch(int data, BTNode iterator) {
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

	public void search(int data) {
		BTNode itr = this.root;
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

		if (queue.peek() != null)
			System.out.println(queue.peek().data);

		while (queue.size() != 0) {

			BTNode itr = queue.peek();

			if (itr.leftNode != null) {
				System.out.println(itr.leftNode.data);
				queue.add(itr.leftNode);
			}

			if (itr.rightNode != null) {
				System.out.println(itr.rightNode.data);
				queue.add(itr.rightNode);
			}

			queue.poll();

		}

	}

	public BTNode intialiseTree(int[] arr) {

		BTNode root = null;

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
				}

				else {
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
