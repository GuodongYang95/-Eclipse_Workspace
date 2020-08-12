package com.guodong.Ex;

public class BankAccount {
	protected Person name;
	protected int accountNumber;
	private double balance;
	protected static int nextAccountNumber = 0;
//	private double amount;

	
	public BankAccount(Person name) {

		this.name = name;
		this.accountNumber = nextAccountNumber;
		nextAccountNumber ++;
		this.balance = 0.0;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}	
	
	public double getBalance() {
		return balance;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}


//	public double getAmount() {
//		return amount;
//	}
//
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	public double depositFunds(double amount) {
		return balance += amount;
	}
	public double withdrawFunds(double amount) {
		if (balance >= amount) {
			return balance -= amount;
		}else {
			System.out.println("Error! The withdrawals should not be taken with the balance below 0.0. ");
			return 0.0;
		}
		

	}
	
	public void transferFunds(double amount, BankAccount account) {
		withdrawFunds(amount);
		account.depositFunds(amount);
		
	}
	
//	public String transferFunds(double ammount, BankAccount account) {
//		double totalAmount = amount + balance;
//		String details = "Transfer amount " + amount + " to " + account + "in total: " + totalAmount;
//		return details;
//	}

	
}
