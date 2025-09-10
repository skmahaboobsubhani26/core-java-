package com.codegnan.patterns;

//pascal triangle
import java.util.Scanner;

public class number_triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of rows
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			// Print spaces for formatting
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			int number = 1; // first element of every row is 1
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1); // formula for next element
			}
			System.out.println();
		}

		sc.close();

	}

}
