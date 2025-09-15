package com.codegnan.oop_examples;

public class Runtime_demo {


	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("total memory of heap="+r.totalMemory()); 
		System.out.println("free memory of heap="+r.freeMemory());
for(int i=0;i<1000;i++) {
	Date d=new Date();
	d=null;
}
System.out.println(" free memory of heap="+r.freeMemory());
r.gc();
System.out.println("free memory of heap="+r.freeMemory());
	}

}
class Date{
	
	
}