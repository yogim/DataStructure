package com.ymhase.binarytree;

import java.util.Stack;

public class DFSPreorder {

	public static void preorderTraversal(BinaryTree BT) {

		BTNode itr = BT.root;

		Stack<BTNode> stack = new Stack<BTNode>();

		stack.push(itr);

		while (!stack.isEmpty()) {

			BTNode node = stack.pop();

			System.out.println(node.data);

			if (node.rightNode != null)
				stack.push(node.rightNode);

			if (node.leftNode != null)
				stack.push(node.leftNode);

		}

	}

	private static void preorderRecursively(BTNode node) {

		if (node == null)
			return;

		System.out.println(node.getData());

		preorderRecursively(node.getLeftNode());

		preorderRecursively(node.getRightNode());

	}

	public static void main(String[] args) {

		int[] arr = { 4, 7, 8, 5, 2 };

		BinaryTree bt = new BinaryTree();

		bt.createTree(arr);

		DFSPreorder.preorderTraversal(bt);

		System.out.println(">>>>>");

		DFSPreorder.preorderRecursively(bt.root);

	}
}
