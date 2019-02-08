package com.ymhase.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Deserialize {

	private BTNode root;

	public void bfs() {
		Queue<BTNode> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {

			BTNode temp = q.poll();

			System.out.println(temp.data);

			if (temp.leftNode != null)
				q.add(temp.leftNode);

			if (temp.rightNode != null)
				q.add(temp.rightNode);

		}

	}

	public BTNode intialiseTree(int[] arr) {

		BTNode root = null;

		Queue<BTNode> q = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {

			if (root == null) {
				root = new BTNode(arr[i]);
				q.add(root);
			} else {

				if (q.peek().leftNode == null) {
					BTNode n = new BTNode(arr[i]);
					q.peek().leftNode = n;
					q.add(n);
				}

				else {
					BTNode n = new BTNode(arr[i]);
					q.peek().rightNode = n;
					q.add(n);
				}

				if (q.peek().leftNode != null && q.peek().rightNode != null)
					q.remove();
			}

		}

		return root;
	}

	public List<String> deserialize(BTNode root) {
		Queue<BTNode> q = new LinkedList();
		q.add(root);

		List<String> ans = new ArrayList();
		ans.add(root.data + "");
		while (!q.isEmpty()) {
			BTNode n = q.poll();

			if (n.leftNode != null)
				ans.add(n.leftNode.data + "");
			else
				ans.add("null");

			if (n.rightNode != null)
				ans.add(n.rightNode.data + "");
			else
				ans.add("null");

			if (n.leftNode != null)
				q.add(n.leftNode);
			if (n.rightNode != null)
				q.add(n.rightNode);

		}

		StringBuilder str = new StringBuilder();
		for (String string : ans) {

			str.append(string);
		}

		System.out.println(str);
		return ans;

	}

	public static void main(String[] args) {

		Binarytree bt = new Binarytree();
		bt.intiaiseWithoutRecusion();
		BFS bfs = new BFS();
		bfs.bfs(bt.head);

		Deserialize de = new Deserialize();
		de.deserialize(bt.head);

	}
}
