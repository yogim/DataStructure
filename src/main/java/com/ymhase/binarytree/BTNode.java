package com.ymhase.binarytree;

public class BTNode {

    int data;
    BTNode left;
    BTNode right;

    public BTNode(int data) {

	this.data = data;
	this.left = null;
	this.right = null;
    }

    public int getData() {
	return data;
    }

    public void setData(int data) {
	this.data = data;
    }

    public BTNode getLeft() {
	return left;
    }

    public void setLeft(BTNode left) {
	this.left = left;
    }

    public BTNode getRight() {
	return right;
    }

    public void setRight(BTNode right) {
	this.right = right;
    }

}
