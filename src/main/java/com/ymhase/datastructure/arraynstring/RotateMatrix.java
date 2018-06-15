package com.ymhase.datastructure.arraynstring;

public class RotateMatrix {
    private int[][] matrix = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    private int[][] rotateMatrix = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    public void rotate() {
	for (int i = 0; i <= 2; i++) {

	    for (int j = 0; j <= 2; j++) {

		rotateMatrix[i][j] = matrix[2 - j][i];

	    }
	}

    }

    public void printMatrix(int[][] matrix) {

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		new postion(i, j);

		System.out.print(" " + matrix[i][j]);
	    }
	    System.out.println();
	}

    }

    public static void main(String[] args) {
	RotateMatrix rm = new RotateMatrix();

	rm.rotate();
	rm.printMatrix(rm.matrix);

	rm.printMatrix(rm.rotateMatrix);
    }

}
