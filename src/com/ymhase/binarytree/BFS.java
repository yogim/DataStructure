package com.ymhase.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void bfs(BTNode head) {
		Queue<BTNode> q = new LinkedList<>();

		q.add(head);
		while (!q.isEmpty()) {

			if (q.peek().leftNode != null)
				q.add(q.peek().leftNode);

			if (q.peek().rightNode != null)
				q.add(q.peek().rightNode);
				
			System.out.println(q.poll().data);
			
			
		}
	}
	
	
}
