package com.codegnan.oop_examples;

public class perimeters {
public int rect(int a,int b) {
		return 2*(a+b);
	}
	public int squa(int a) {
	return 4*a;
	}
	public double cir(int r) {
		return 2*r*3.14;
	}
	public int parallel(int a,int b) {
		return 2*(a+b);
	}
	public int triangle(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[]args) {
		perimeters p=new perimeters();
		System.out.println("rectangle perimeter    :"+p.rect(10,20));
		System.out.println("square perimeter       :"+p.squa(20));
		System.out.println("circle perimeter       :"+p.cir(10));
		System.out.println("parallelogram perimeter:"+p.parallel(10,20));
		System.out.println("triangle perimeter     :"+p.triangle(10,20,30));
		
}
}

	