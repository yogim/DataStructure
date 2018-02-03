package com.ymhase.arraynstring;

import java.util.Scanner;

public class ZeroMatrix {
    int[][] matrix = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] locationMatrix = new int[3][3];

    public void acceptElementsForMatrix() {
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		System.out.println("Enter number for matrix.");
		matrix[i][j] = scan.nextInt();
	    }
	}
	scan.close();
    }

    public void printMatrix(int[][] matrix) {

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		System.out.print(" " + matrix[i][j]);
	    }
	    System.out.println();
	}

    }

    public void checkZero() {

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		if (matrix[i][j] == 0) {
		    locationMatrix[i][j] = 1;
		}
	    }
	}

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		if (locationMatrix[i][j] == 1) {
		    setRowToZero(i);
		    setColumnTozero(j);
		}
	    }
	}
    }

    private void setColumnTozero(int j) {
	for (int i = 0; i <= 2; i++) {
	    matrix[i][j] = 0;

	}

    }

    private void setRowToZero(int i) {
	for (int j = 0; j <= 2; j++) {
	    matrix[i][j] = 0;

	}

    }

    public static void main(String args[]) {

	ZeroMatrix zm = new ZeroMatrix();
	zm.printMatrix(zm.matrix);
	System.out.println("-----------------");
	zm.checkZero();

	zm.printMatrix(zm.locationMatrix);
	System.out.println("-----------------");
	zm.printMatrix(zm.matrix);

    }

}
