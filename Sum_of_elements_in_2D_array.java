package com.codegnan.arrays;

public class Sum_of_elements_in_2D_array {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int[] row : arr) {
			for (int val : row) {
				sum += val;
			}
		}
		System.out.println("Sum of elements = " + sum);

	}

}
