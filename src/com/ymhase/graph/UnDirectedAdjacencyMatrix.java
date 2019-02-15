package com.ymhase.graph;

public class UnDirectedAdjacencyMatrix {
	
	int vertix;
	int[][] matrix;
	
	public UnDirectedAdjacencyMatrix(int vertix) {

		this.vertix = vertix;
		matrix = new int[vertix][vertix];
	}
	
	
	public void addEdge(int row, int col) {
		this.matrix[row][col] = 1;
		this.matrix[col][row] = 1;
		
	}
	
	
	public void removeEdge(int row, int col) {
		this.matrix[row][col] = 0;
		this.matrix[col][row] = 0;
		
	}
	
	
	
	public void print() {
		
		for(int i = 0; i< this.vertix ; i++) {
			for(int j =0 ;j<this.vertix;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < vertix; i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 0; j <vertix ; j++) {
                if(matrix[i][j]==1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
		
	}
	
	public static void main(String[] args) {
		
		UnDirectedAdjacencyMatrix m = new UnDirectedAdjacencyMatrix(5);
		m.addEdge(1, 2);

		m.addEdge(2, 3);
		m.addEdge(1, 3);
		m.addEdge(3, 3);
		
		m.print();
	}

}
