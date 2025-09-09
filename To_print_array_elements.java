package com.codegnan.arrays;

public class To_print_array_elements {
	public static void main(String[] args) {
		String[] a = { "apple", "banana", "guava", "tomato" };
		int[] x= {6,7,8,2,6,7,11};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int j = 0; j < x.length; j++) {
			System.out.print(x[j]+",");
		}
	}
}
