package com.ymhase.binarytree;

public class BTNode {
    
    	int data;
    	Object left;
    	Object  right;
    	
    	
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


	public Object getLeft() {
	    return left;
	}


	public void setLeft(Object left) {
	    this.left = left;
	}


	public Object getRight() {
	    return right;
	}


	public void setRight(Object right) {
	    this.right = right;
	}
    	
    	
    	
    	
    

}
