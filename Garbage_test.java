package com.codegnan.oop_examples;

public class Garbage_test {
	  protected void finalize() {
	System.out.println("GC called Finilize method");

	}

	public static void main(String[] args) {
		Garbage_test obj =new Garbage_test();
		 obj=null;
		 System.out.println("Requesting garbage collection");
		 System.gc();
		 System.out.println("end of main");

	}

}
