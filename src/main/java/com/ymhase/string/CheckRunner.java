package com.ymhase.string;

import java.util.List;

public class CheckRunner {

	public int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot) {

		int dist = removeObstacle(0, 0, numRows, numColumns, lot, 0);
		return dist;
	}

	private int removeObstacle(int i, int j, int numRows, int numColumns, List<List<Integer>> lot, int dist) {
		if (i < 0 && i >= numRows && j < 0 && j >= numColumns && lot.get(i).get(j) == 0) {
			return 0;
		}
		if (lot.get(i).get(j) == 9) {
			return dist;
		}
		dist = removeObstacle(i + 1, j, numRows, numColumns, lot, dist);
		dist = removeObstacle(i - 1, j, numRows, numColumns, lot, dist);
		dist = removeObstacle(i, j + 1, numRows, numColumns, lot, dist);
		dist = removeObstacle(i, j - 1, numRows, numColumns, lot, dist);

		return dist + 1;
	}

	public static void main(String[] args) {

	}
}
