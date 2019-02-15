package com.ymhase.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Deserialize {

	public List<String> deserialize(BTNode root) {
		Queue<BTNode> q = new LinkedList<BTNode>();

		List<String> ans = new ArrayList<String>();

		q.add(root);
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

		BinaryTree bt = new BinaryTree();
		BFS bfs = new BFS();
		bfs.bfs(bt.root);

		Deserialize de = new Deserialize();
		de.deserialize(bt.root);

	}
}
