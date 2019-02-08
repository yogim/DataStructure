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
		;

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

			intialiseRecursively(arr[i], this.root);
		}

		return this.root;
	}

	public void insertRecursively(int data) {
		intialiseRecursively(data, this.root);
	}

	public void intialiseRecursively(int data, BTNode iterator) {

		if (iterator == null) {
			iterator = new BTNode(data);
			return;
		}
		if (iterator.data > data) {
			if (iterator.leftNode == null) {
				iterator.leftNode = new BTNode(data);
				return;
			} else
				intialiseRecursively(data, iterator.leftNode);
		} else {
			if (iterator.getRightNode() == null) {
				iterator.rightNode = new BTNode(data);
				return;
			} else
				intialiseRecursively(data, iterator.rightNode);

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
