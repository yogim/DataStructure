package com.ymhase.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryT implements Tree {

	private BTNode root;

	public void bfs() {
		Queue<BTNode> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {

			BTNode temp = q.poll();

			System.out.println(temp.data);

			if (temp.leftNode != null)
				q.add(temp.leftNode);

			if (temp.rightNode != null)
				q.add(temp.rightNode);

		}

	}

	@Override
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

	@Override
	public BTNode getRoot() {
		return this.root;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		BinaryT bt = new BinaryT();

		bt.intialiseTree(arr);

		bt.bfs();

	}

}
