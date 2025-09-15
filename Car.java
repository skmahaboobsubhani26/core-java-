package com.codegnan.oop_examples;

public class Car {
	String brand;
	String model;
	int years;
	

	public Car(String brand, String model, int years) {
		super();
		this.brand = brand;
		this.model = model;
		this.years = years;
	}
	public Car(Car anothercar) {
		//this.brand = brand;
		//this.model = model;
		//this.years = years;
		
	}
	public Car() {
		
	}

public void displaycar() {
	
		System.out.println(" car brand :"+brand);
		System.out.println(" car model :"+model);
		System.out.println("car year   :"+   years);
		System.out.println("---------------------");
		
}
		public static void main(String[] args) {
		Car c=new Car();
		Car c2=new Car("ford","350",1919);
		c.displaycar();
		c2.displaycar();
		
	}

}
