package com.codegnan.controlstatements;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of terms");
		int a = sc.nextInt();
		int first=0,sec=1;
		for(int i=0;i<=a;i++) {
			System.out.println(first+" ");
			int next=first+sec;
			first=sec;
			sec=next;
		}
		

	}

}
