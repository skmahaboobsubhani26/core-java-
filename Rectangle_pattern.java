package com.codegnan.patterns;
import java.util.Scanner;
public class Rectangle_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the height:");
		int a = sc.nextInt();// a=height
		System.out.print("enter height:");
		int b = sc.nextInt();// b=width
        for(int i=0;i<a;i++) {
        	for(int j=0;j<a-1;j++) {
        		System.out.print(" ");
        	}
        	for(int j=0;j<b;j++) {
        		 if (i==0 || i==a-1 || j==0 || j==b-1) {
        		System.out.print("*");
        		 } else {
                     System.out.print(" ");
                 }
        	}
        	System.out.println();
        }
        sc.close();

		

	}

}
