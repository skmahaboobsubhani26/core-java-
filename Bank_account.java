package com.codegnan.oop_examples;


public class Bank_account {
	double balance;
	
	public Bank_account(double balance) {
		super();
		this.balance = balance;
	}

	public double deposit(double a) {
		balance+=a;
		return balance;
	}
public  String deposit(double a,String id) {
	balance+=a;
	return balance+",   id   :"+id;	
	}
public double deposit(double a,String id,String name) {
	balance+=a;
return balance;	
}
	

	public static void main(String[] args) {
		Bank_account x=new Bank_account(5000);
		System.out.println("current balance: "+x.deposit(23000));
		System.out.println("balance after deposited: "+x.deposit(1000,"Sbiy38980"));
		System.out.println("balance after deposited: "+x.deposit(23000,"cvbnmiuytd","sbi"));

	}

}
