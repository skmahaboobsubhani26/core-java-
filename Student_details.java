package com.codegnan.oop_examples;

public class Student_details {
String name;
int[] marks;
// method for setdetails
public void setdetails(String n,int[] m) {
	name =n;
	marks=m;
}
public int calculatetotal() {
	int total=0;
	for(int mark:marks) {
		total+=mark;
	}
	return total;
}
public double calculateaverage() {
return calculatetotal()	/marks.length;
}
public void displaydetails() {
	System.out.println("name           :"+name);
	System.out.println("total marks    :"+calculatetotal());
	System.out.println("average        :"+calculateaverage());
}
public static void main(String[]args) {
	Student_details s1=new Student_details();
	s1.setdetails("subhani", new int[] {50,50,50,50});
	s1.calculatetotal();
	s1.calculateaverage();
	s1.displaydetails();
	
}
}
