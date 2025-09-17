package com.codegnan.oop_examples;

public class Areas {

	public static int rect(int a,int b) {
		return (a*b);
	}
	public int squa(int a) {
	return a*a;
	}
	public double cir(int r) {
		return r*r*3.14;
	}
	public int parallel(int a,int b) {
		return a*b;
	}
	public double triangle(int a,int b) {
		return a*b*0.5;
	}
	
	public static void main(String[]args) {
		Areas p=new Areas();
		System.out.println("rectangle area    :"+rect(10,20));
		System.out.println("square area       :"+p.squa(20));
		System.out.println("circle area       :"+p.cir(10));
		System.out.println("parallelogram area:"+p.parallel(10,20));
		System.out.println("triangle area     :"+p.triangle(10,20));
		
}}
