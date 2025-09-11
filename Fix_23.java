package com.codegnan.arrays;

import java.util.Arrays;

public class Fix_23 {
	// access modifier return type method name(arguments)
	public static int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		}
		if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		return nums;
	}
	

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			if (i < arr.length - 1) {
				System.out.print(",");

			}
		}
		System.out.println("]");

	}

	public static void main(String[] args) {
		int[][] testcases = { { 1, 2, 3 }, { 2, 3, 0 }, { 1, 2, 2 }, { 1, 0, 3 }, { 3, 2, 3 }, { 2, 2, 0 },
				{ 3, 3, 2 }, };
		for (int i = 0; i < testcases.length; i++) {
			int[] result = fix23(testcases[i]);
			System.out.print("testcase: " + (i + 1) + " ");
			printArray(result);
		}

	}

}
