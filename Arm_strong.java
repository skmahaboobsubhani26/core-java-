package com.codegnan.controlstatements;

import java.util.Scanner;

public class Arm_strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int a = num;
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		num=a;
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, count);
			temp /= 10;

		}

		if (a == sum) {
			System.out.println(a+" the given number is armstrong");
		} else {
			System.out.println(a+" the given number is not a armstrong number");
		}
		sc.close();

	}

}
