package com.guodong.Ex;



public class NewBankAccount extends BankAccount {
	private double interestRate;

	public NewBankAccount(Person name, double interestRate) {
		super(name);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public void addIntertest () {
		double TotalBalance = (super.getBalance() * (interestRate * 0.1)) + super.getBalance();
		super.setBalance(TotalBalance);
		
	}
	
}	
