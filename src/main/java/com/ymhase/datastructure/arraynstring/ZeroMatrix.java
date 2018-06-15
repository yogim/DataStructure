package com.ymhase.datastructure.arraynstring;

import java.util.ArrayList;
import java.util.Scanner;

class postion {
    int i;
    int j;

    postion(int i, int j) {

	this.i = i;
	this.j = j;
    }
}

public class ZeroMatrix {
    int[][] matrix = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    ArrayList<postion> postions = new ArrayList<>();

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
		new postion(i, j);

		System.out.print(" " + matrix[i][j]);
	    }
	    System.out.println();
	}

    }

    public void checkZero() {

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		if (matrix[i][j] == 0) {
		    // locationMatrix[i][j] = 1;
		}
	    }
	}

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		/*
		 * if (locationMatrix[i][j] == 1) { setRowToZero(i); setColumnTozero(j); }
		 */
	    }
	}
    }

    public void zeroMat() {

	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <= 2; j++) {
		if (matrix[i][j] == 0) {
		    postions.add(new postion(i, j));
		    System.out.println(i + "--" + j);

		}
	    }
	}

	for (postion p : postions) {

	    setColumnTozero(p.j);
	    setRowToZero(p.i);
	}
	printMatrix(this.matrix);

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

	zm.zeroMat();

    }

}
