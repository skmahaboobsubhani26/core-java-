package com.codegnan.arrays;

import java.util.Scanner;

public class Average_of_array_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int a = sc.nextInt();

		int[] x = new int[a];
		System.out.println("enter array elements");
		int sum = 0;
		for (int i = 0; i < a; i++) {
			System.out.println("element at index" + i);
			x[i] = sc.nextInt();

			sum = sum + x[i];

		}
		double result = sum / a;
		System.out.printf("%.2f", result);

	}

}
