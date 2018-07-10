package com.ymhase.binarytree;

public class Binarytree {

	private BTNode head;

	public Binarytree() {

		this.head = null;
	}

	public void insert(int data) {
		if (head == null) {
			head = new BTNode(data);
		} else {
			if (this.head.getData() > data) {
				insertAtbranch(data, this.head);
			} else {
				insertAtbranch(data, this.head);
			}
		}
	}

	private void insertAtbranch(int data, BTNode iterator) {
		if (iterator.getData() > data) {
			if (iterator.getLeft() == null) {
				iterator.setLeft(new BTNode(data));
			} else {
				insertAtbranch(data, iterator.getLeft());
			}

		} else {
			if (iterator.getRight() == null) {
				iterator.setRight(new BTNode(data));
			} else {
				insertAtbranch(data, iterator.getRight());
			}

		}

	}

	public void preorderTraversal() {

		preorder(head);

	}
	
	
	public void inorderTraversal() {

		inorder(head);

	}
	
	public void postorderTraversal() {

		postorder(head);

	}

	private void preorder(BTNode node) {

		if (node == null)
			return;

		System.out.println(node.getData());

		preorder(node.getLeft());

		preorder(node.getRight());

	}
	
	
	private void inorder(BTNode node) {

		if (node == null)
			return;


		inorder(node.getLeft());
		
		System.out.println(node.getData());

		inorder(node.getRight());

	}
	
	
	private void postorder(BTNode node) {

		if (node == null)
			return;

		postorder(node.getLeft());

		postorder(node.getRight());
		
		System.out.println(node.getData());

	}

	public static void main(String[] args) {

		Binarytree BT = new Binarytree();
		BT.insert(10);
		BT.insert(3);
		BT.insert(5);
		BT.insert(9);
		BT.insert(13);
		BT.insert(16);
		BT.insert(11);
		BT.insert(19);
		BT.insert(20);

		BT.inorderTraversal();
		
		System.out.println("--------");
		
		BT.preorderTraversal();
		
		
		System.out.println("--------");
		
		BT.postorderTraversal();

		
	}

}
