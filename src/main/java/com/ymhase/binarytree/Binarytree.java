package com.ymhase.binarytree;

public class Binarytree {
	private BTNode root;

	public Binarytree() {
		this.root = null;

	}

	public void addNode(int data) {
		this.root = addNode(this.root, data);
	}

	public BTNode addNode(BTNode currentNode, int data) {

		if (currentNode == null) {
			return new BTNode(data);

		} else {

			if (currentNode.getData() <= data) {
				currentNode.left = addNode(currentNode.left, data);

			} else {
				currentNode.right = addNode(currentNode.right, data);

			}

		}

		return currentNode;
	}

	public void inorderTrav() {
		inorderTrav(this.root);
	}

	public void preorderTrav() {

		preorderTrav(this.root);

	}

	public void postTrav() {
		postTrav(this.root);
	}

	public void inorderTrav(BTNode currentNode) { // left- root - right

		if (currentNode != null) {
			inorderTrav(currentNode.getLeft());
			inorderTrav(currentNode.getRight());
			System.out.println(currentNode.getData());
		}

	}

	public void preorderTrav(BTNode currentNode) { // root left right

		if (currentNode != null) {
			System.out.println(currentNode.getData());
			inorderTrav(currentNode.getLeft());
			inorderTrav(currentNode.getRight());
		}

	}

	private void postTrav(BTNode root) {

	}

	public static void main(String[] args) {
		Binarytree bt = new Binarytree();
		bt.addNode(5);
		bt.addNode(2);
		bt.addNode(7);
		bt.addNode(1);
		bt.addNode(6);
		bt.addNode(11);
		bt.addNode(9);
		bt.addNode(4);
		bt.inorderTrav(bt.root);
	}

}
