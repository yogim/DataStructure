package com.ymhase.binarytree;

import java.util.Stack;

public class DFSInorder {

	public static void inorder(BinaryTree bt) {
		BTNode itr = bt.root;

		Stack<BTNode> stack = new Stack<>();

		while (true) {

			if (itr != null) {

				stack.push(itr);
				itr = itr.leftNode;
			}

			else {
				if (stack.isEmpty())
					break;

				itr = stack.pop();
				System.out.print(itr.data);
				itr = itr.rightNode;

			}

		}

	}

	
	private static void inorderRecursion(BTNode node) {

		if (node == null)
			return;

		inorderRecursion(node.getLeftNode());

		System.out.print(node.getData());

		inorderRecursion(node.getRightNode());

	}

	public static void main(String[] args) {

		int[] arr = { 4, 7, 8, 5, 2 };

		BinaryTree bt = new BinaryTree();

		bt.intialiseTree(arr);

		DFSInorder.inorder(bt);
		
		System.out.print(">>>");
		
		DFSInorder.inorderRecursion(bt.root);

	}

}
