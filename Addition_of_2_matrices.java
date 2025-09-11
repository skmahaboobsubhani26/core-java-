package com.codegnan.arrays;

public class Addition_of_2_matrices {

	public static void main(String[] args) {
		int[][] A = { 
				    { 1, 2, 3 },
				    { 4, 5, 6 } 
				    };
		int[][] B = {
				    { 7, 8, 9 },
				    { 10,11,12}
				    };
		int[][] C = new int[A.length][A[0].length];
		// Addition
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("Result of Matrix Addition:");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				System.out.print(C[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
