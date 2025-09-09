package com.codegnan.controlstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int num=a;
		int rev = 0;
		while (a != 0) {
			int digit = a%10;
			rev = rev * 10 + digit;
			
			a=a/10;
		
		}
		if (num == rev) {
			System.out.println(num + " palindrome");
		} else {
			System.out.println(num + " not a palindrome");
		}
		sc.close();

	}
	
	
	

}
