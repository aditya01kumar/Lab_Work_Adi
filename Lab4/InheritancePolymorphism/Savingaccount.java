package com.capg.Lab4.InheritancePolymorphism;

public class Savingaccount extends Account {
	   
	public Savingaccount(long accnum, double balance, String accholder) {
		super(accnum, balance, accholder);

	}
	double minimumBalance=500;
	void withdraw(double c) {
		if(balance>minimumBalance) {
			balance=balance-c;
			System.out.println("allow withdraw");
		}
		else {
			System.out.println("withdraw not allow");
		}
	}
}
