package com.ymhase.binarytree;

public class BinarySearchTree implements Tree {

	private BTNode root;

	@Override
	public BTNode intialiseTree(int[] arr) {

		for (int i = 0; i <= arr.length; i++) {
			insert(arr[i]);
		}

		return this.root;
	}

	public void insert(int data) {

		BTNode parent = this.root;
		BTNode itr = this.root;

		if (parent == null) {
			parent = new BTNode(data);
			return;
		}

		while (itr != null) {
			parent = itr;
			if (data > itr.data)
				itr = itr.rightNode;
			else
				itr = itr.leftNode;
		}

		if (parent.data > data)
			parent.leftNode = new BTNode(data);
		else
			parent.rightNode = new BTNode(data);
	}

	public BTNode intialiseRecursively(int[] arr) {

		for (int i = 0; i <= arr.length; i++) {

			insertRecursively(arr[i], this.root);
		}

		return this.root;
	}

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

	public void insertRecursively(int data, BTNode root) {

		if (root == null) {
			root = new BTNode(data);
			return;
		}
		if (root.data > data) {
			if (root.leftNode == null) {
				root.leftNode = new BTNode(data);
				return;
			} else
				insertRecursively(data, root.leftNode);
		} else {
			if (root.getRightNode() == null) {
				root.rightNode = new BTNode(data);
				return;
			} else
				insertRecursively(data, root.rightNode);

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

	@Override
	public BTNode getRoot() {
		return this.root;
	}

	@Override
	public void delete() {

	}

}
