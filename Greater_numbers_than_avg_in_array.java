//Write a program to print all elements greater than the average of the array. First line (n) is the size (e.g., 5), followed by n lines (e.g.. 1, 2, 3, 4, 5) Calculate the average, then print elements exceeding it.

package com.codegnan.arrays;

import java.util.*;

public class Greater_numbers_than_avg_in_array 
{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.print("enter the number :");
int n=sc.nextInt();
int[] a=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
	System.out.print("enter values at index "+i+":");
	a[i]=sc.nextInt();
	sum+=a[i];
}
int avg=sum/n;
for(int i=0;i<n;i++){
if(a[i]>avg){
System.out.print(a[i]);
}
System.out.println();
}
sc.close();
}
}




