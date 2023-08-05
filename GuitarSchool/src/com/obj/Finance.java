package com.obj;

public class Finance {
	
	double balance;
	
	public void payClass(double payment) {
		balance = balance + payment;
				
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
