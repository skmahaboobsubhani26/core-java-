package com.codegnan.patterns;

import java.util.Scanner;

public class Butterfly_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter rows:");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {// upper part of the butterfly
			for (int j = 1; j <= i; j++) {// print stars for left wu=ing
				System.out.print("* ");
			}
			// print space bw left wings and right wings
			int spaces = 2 * (rows - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");

			}
			// print wings for right wing
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// lower part of the butterfly
		for (int i = rows; i >= 1; i--) {
			// print stars for left in bottom part
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			// inner loop to print spaces
			int spaces = 2 * (rows - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");

			}
			// inner loop to print stars to right wing
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
