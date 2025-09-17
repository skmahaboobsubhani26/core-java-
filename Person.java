package com.codegnan.oop_examples;

class Employee {
	String name;
	double basicsalary;

	public void setDetails(String n, double salary) {
		name = n;
		basicsalary = salary;

	}

	public double calculateHRA() {
		return 0.20 * basicsalary;
	}
	public double calculateDA() {
		return 0.10* basicsalary;
	}
	public double grosssalary() {
		return basicsalary+calculateHRA()+calculateDA();
	}
}

public class Person{
	String name;
	double basicsalary;
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setDetails("ravi",15554.0);
		
		
		double grosssalary=e.grosssalary();
		System.out.println("Name of the employee :"+e.name);
		System.out.println("Basic salary         :"+e.basicsalary);
		System.out.println("House rent allowance :"+e.calculateHRA());
		System.out.println("Daily allowance      :"+e.calculateDA());
		System.out.println("gross salary         :"+grosssalary);
	}
}

