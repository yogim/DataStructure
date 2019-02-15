package com.ymhase.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class UnDirectedAdjacencyList {
	int V;
	LinkedList<Integer> adjListArray[];

	public UnDirectedAdjacencyList(int vertex) {

		this.V = vertex;

		adjListArray = new LinkedList[V];

		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList();
		}

	}

	public void addEdge(int src, int dest) {

		this.adjListArray[src].add(dest);
		this.adjListArray[dest].add(src);
	}

	public void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();

		boolean visited[] = new boolean[this.V];

		q.add(start);
		visited[start] = true;
		while (!q.isEmpty()) {
			int poll = q.poll();

			List<Integer> l = adjListArray[poll];
			for (Integer integer : l) {
				if (visited[integer] != true) {

					visited[integer] = true;
					q.add(integer);

				}

			}
			System.out.print(poll);

		}

	}

	public void dfs(int start) {

		Stack<Integer> s = new Stack<>();
		boolean[] visited = new boolean[this.V];

		s.push(start);
		while (!s.isEmpty()) {

			int peek = s.peek();
			// System.out.println(s.pop());

			if (visited[peek] == false) {
				System.out.print(peek);
				visited[peek] = true;
			}

			List<Integer> l = adjListArray[peek];

			for (Integer i : l) {

				if (!visited[i]) {
					s.add(i);

				}
			}

		}

	}

	static void printGraph(UnDirectedAdjacencyList graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		UnDirectedAdjacencyList udl = new UnDirectedAdjacencyList(5);
		udl.addEdge(1, 2);
		udl.addEdge(2, 3);
		udl.addEdge(3, 1);
		udl.printGraph(udl);

		// udl.bfs(1);
		udl.dfs(1);
	}
}
