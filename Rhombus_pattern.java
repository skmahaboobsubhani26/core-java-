package com.codegnan.patterns;

import java.util.*;

public class Rhombus_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int rows = sc.nextInt();
		// upper part of diamond
		for (int i = 1; i <= rows; i++) {// outer loop for rows(1 to 5)
			for (int j = 1; j <= rows - i; j++) {// inner loop 1 to print leading spaces
				System.out.print("  ");// two spaces
			}
			// inner loop 2 to print stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// lower part of diamond
		for (int i = rows - 1; i >= 1; i--) {
			// inner loop 1
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		sc.close();

	}

}
