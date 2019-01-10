package com.ymhase.binarytree;

public class BTbuilder {

	public void build(int[] arr, BinaryTree bt) {

		for (int i = 0; i < arr.length; i++) {

			if (bt.root == null)
				bt.root = new BTNode(arr[i]);

			else {

				if (arr[i] > bt.root.data) {
					BTNode rootOfItr = bt.root;
					BTNode itr = bt.root.leftNode;

					while (itr != null) {
						rootOfItr = itr;
						if (arr[i] > itr.data)
							itr = itr.leftNode;
						else
							itr = itr.rightNode;

					}

					if (arr[i] > rootOfItr.data)
						rootOfItr.leftNode = new BTNode(arr[i]);
					else
						rootOfItr.rightNode = new BTNode(arr[i]);

				} else {

					BTNode rootOfItr = bt.root;
					BTNode itr = bt.root.rightNode;

					while (itr != null) {
						rootOfItr = itr;
						if (arr[i] < itr.data)
							itr = itr.leftNode;
						else
							itr = itr.rightNode;

					}

					if (arr[i] > rootOfItr.data)
						rootOfItr.leftNode = new BTNode(arr[i]);
					else
						rootOfItr.rightNode = new BTNode(arr[i]);

				}

			}

		}

	}

	public void buildWithRecursion(int[] arr, BinaryTree bt) {
		bt.root = new BTNode(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			insert(bt.root, arr[i]);
		}

	}

	public void insert(BTNode root, int data) {

		if (root == null)
			root = new BTNode(data);

		if (data >= root.data) {
			if (root.leftNode == null)
				root.leftNode = new BTNode(data);
			else
				insert(root.leftNode, data);
		} else {

			if (root.rightNode == null)
				root.rightNode = new BTNode(data);
			else
				insert(root.rightNode, data);
		}

	}

	public static void main(String args[]) {

		int[] arr = { 4, 7, 8, 5, 2 };

		BinaryTree bt = new BinaryTree();

		BTbuilder builder = new BTbuilder();
		builder.buildWithRecursion(arr, bt);
		bt.displayTree(bt.root);

	}
}
