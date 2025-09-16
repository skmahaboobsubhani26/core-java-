package com.codegnan.arrays;

import java.util.Arrays;
public class Print_second_highest_and_lowest {

	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int[] a= {5,89,8,9,7,2,68};
	Arrays.sort(a);
	System.out.print("sorted array :");
	int x=a.length;
	for(int num:a) {
		
	
	System.out.print(num+" ");
	
	
	}
	System.out.println();
	System.out.println("second smallest :"+a[1]);
	System.out.println("second smallest :"+a[x-2]);

	}

}
