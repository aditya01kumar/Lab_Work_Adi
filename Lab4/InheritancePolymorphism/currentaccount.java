package com.capg.Lab4.InheritancePolymorphism;

public class currentaccount extends Account {
	public currentaccount(long accnum, double balance, String accholder) {
		super(accnum, balance, accholder);
		
	}
	int overdraftLimit=0;
	boolean withdraw() {
		if(overdraftLimit<2) {
			overdraftLimit++;
			return true;
		}
		return false;
	}
}
