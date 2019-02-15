package com.ymhase.binarytree;

import java.util.ArrayList;

public class FindPathToANode {

	public boolean find(BTNode root, ArrayList<Integer> arr, int tagetNum) {

		if (root == null)
			return false;

		arr.add(root.data);

		if (root.data == tagetNum)
			return true;

		if (find(root.leftNode, arr, tagetNum) || find(root.rightNode, arr, tagetNum))
			return true;

		arr.remove(arr.size() - 1);
		return false;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 7, 8, 5, 2 };

		BinaryTree bt = new BinaryTree();

		bt.intialiseTree(arr);

		bt.displayTree(bt.root);

		FindPathToANode fp = new FindPathToANode();

		ArrayList<Integer> path = new ArrayList<>();

		fp.find(bt.root, path, 2);

		for (Integer integer : path) {

			System.out.print(integer);
		}

		ArrayList<Integer> path2 = new ArrayList<>();
		fp.find(bt.root, path2, 5);

		System.out.println();
		for (Integer integer : path2) {

			System.out.print(integer);
		}

		System.out.println();
		for (int i = 0; i <= path.size()-1; i++) {
			if (path.get(i) != path2.get(i)) {
				
				System.out.println(path.get(i-1));
				
			}

		}

	}

}
