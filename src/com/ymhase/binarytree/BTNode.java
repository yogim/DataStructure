package com.ymhase.binarytree;

public class BTNode {

	public BTNode leftNode;
	public BTNode rightNode;
	public int data;

	BTNode(int data) {
		this.leftNode = null;
		this.rightNode = null;
		this.data = data;
	}

	public BTNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BTNode leftNode) {
		this.leftNode = leftNode;
	}

	public BTNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BTNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
