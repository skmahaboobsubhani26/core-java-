package com.codegnan.oop_examples;
import java.util.Scanner;

class Employee_demo{
	public int getEmployid() {
		return employid;
	}
	public void setEmployid(int employid) {
		this.employid = employid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("Salary must be positive");
		}else {
			this.salary = salary;
		}
	}
	private  int employid;
	private String name;
	private double salary;
	public Employee_demo(int employid, String name, double salary) {
		super();
		this.employid = employid;
		this.name = name;
		this.salary = salary;
	}
	public void displayEmployeeInfo() {
		System.out.println("employee id      :"+employid);
		System.out.println("employee name    :"+name);
		System.out.println("employee salary  :"+ salary);
	}
}

	public class Employeee {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Employee_demo a=new Employee_demo(1555,"tabs",50000);
		a.displayEmployeeInfo();
		
		}

}
