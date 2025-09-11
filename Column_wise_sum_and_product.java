package com.codegnan.arrays;

public class Column_wise_sum_and_product {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } 
				};
		for (int j = 0; j < arr[0].length; j++) {
			int colSum = 0;
			int colpro = 1;
			for (int i = 0; i < arr.length; i++) {
				colSum += arr[i][j];
				colpro *= arr[i][j];
			}
			System.out.println("Sum of column    " + (j + 1) + " = " + colSum);
			System.out.println("product of column" + (j + 1) + " = " + colpro);
		}

	}

}
