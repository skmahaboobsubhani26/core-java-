package com.codegnan.oop_examples;

class Coffee {
	String type;
	String size;
	boolean b;

	// boolean true;
	public Coffee(String type, String size) {
		super();
		this.type = type;
		this.size = size;
		this.b =true;
	}



	public void displayOrder() {
		System.out.println("Coffee type : " + type);
		System.out.println("size        :" + size);
		System.out.println("sugar       :" + b);
		System.out.println("========================");

	}
}

public class Coffeeshop {
	public static void main(String[] args) {
		Coffee c1 = new Coffee("latte", "small");
		Coffee c2 = new Coffee("cap", "big");
		Coffee c3 = new Coffee("latte", "medium");

		c1.displayOrder();
		c2.displayOrder();
		c3.displayOrder();
	}

}
