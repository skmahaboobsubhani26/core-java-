
/* input =5

output as shown below
0 1 2 3 4 
5 6 7 8 9 
0 1 2 3 4 
5 6 7 8 9 
0 1 2 3 4 
*/
package com.codegnan.patterns;

import java.util.*;

public class Num_1_9_rows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of rows :");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					System.out.print(j+" " );
				}
			} else {
				for (int j = 5; j <= 9; j++) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}