package com.ymhase.binarytree;

import java.util.Stack;

public class Binarytree {
    private BTNode root;

    public Binarytree() {
	this.root = null;
	
    }

    public void addNode(int data) {
	this.root= addNode(this.root, data);
    }

    public BTNode addNode(BTNode node, int data) {

	if (node == null) {
	    node = new BTNode(data);

	} else {

	    if (node.getData() <= data) {
		node.left=addNode(node.left, data);
		
	    } else {
		node.right=addNode(node.right, data);
		
	    }

	}
	
	return node;
    }

    public void postTraversal() {
	Stack<BTNode> stack1 = new Stack<>();
	Stack<BTNode> stack2 = new Stack<>();

	BTNode iterator = this.root;
	stack1.push(iterator);
	while (!stack1.isEmpty()) {

	    stack2.push(stack1.pop());
	    iterator = stack2.peek();
	    if (iterator.left != null)
		stack1.push(iterator.left);
	    if (iterator.right != null)
		stack1.push(iterator.right);
	    if (!stack1.isEmpty())
		iterator = stack1.peek();
	}

	while (!stack2.isEmpty()) {
	    System.out.println(stack2.pop().data

	    );
	}

    }

    public static void main(String[] args) {
	Binarytree bt = new Binarytree();
	bt.addNode(5);
	bt.addNode(2);
	bt.addNode(7);
	bt.addNode(1);
	bt.addNode(6);
	bt.addNode(5);
	bt.addNode(11);
	bt.addNode(9);
	bt.addNode(4);
bt.postTraversal();
    }

}
