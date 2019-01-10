package com.ymhase.binarytree;

import java.util.Stack;

public class DFSPostorder {

	public static void postorder(BinaryTree bt) {
		BTNode itr = bt.root;

		Stack<BTNode> stack = new Stack<BTNode>();
		Stack<BTNode> stack2 = new Stack<>();

		stack.push(itr);

		while (!stack.isEmpty()) {

			itr = stack.pop();

			if (itr.leftNode != null)
				stack.push(itr.leftNode);
			if (itr.rightNode != null)
				stack.push(itr.rightNode);

			stack2.push(itr);

		}

		while(!stack2.isEmpty()){
			System.out.println(stack2.pop().data);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 7, 8, 5, 2 };

		BinaryTree bt = new BinaryTree();

		bt.createTree(arr);

		DFSPostorder.postorder(bt);
		
	}

}
