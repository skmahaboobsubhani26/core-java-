package com.codegnan.arrays;

public class Row_wise_sum_and_product {

	public static void main(String[] args) {
		 int[][] arr = {
		           {1, 2, 3},
		           {4, 5, 6},
		           {7, 8, 9}
		       };
		       for (int i = 0; i < arr.length; i++) {
		           int rowSum = 0;
		           int rowpro=1;
		           for (int j = 0; j < arr[i].length; j++) {
		               rowSum += arr[i][j];
		               rowpro*=arr[i][j];
		           }
		           System.out.println("Sum of row     " + (i + 1) + " = " + rowSum);
		           System.out.println("product of row " + (i + 1) + " = " + rowpro);
		       }


	}

}
