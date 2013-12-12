package com.google;

public class Matrix {

	public static int[][] changeMatrix(int m, int n, int x, int y) {
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i==x || j==y) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 1;
				}
			}
		}

		return matrix;

	}
	
	public static void main(String[] args) {
		int [][] matrix = changeMatrix(1,1,0,0);
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print(matrix[i][j]+",");
			}
			System.out.println("");
		}

	}
}
