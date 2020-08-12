package com.guodong.Ex;

public class BankAccountTest {
	public static void main(String[] args) {
		Person personOne = new Person("Bill");
		BankAccount accountOne = new BankAccount(personOne);
		BankAccount accountTwo = new BankAccount(personOne);
		
//		BankAccount accountTwo = new BankAccount("Ken");
		
//		System.out.println(accountOne.toString());
//		System.out.println(accountTwo.toString());
		
		accountOne.setBalance(400);
		accountOne.depositFunds(100);
		System.out.println(accountOne);
		System.out.println(accountTwo);
		
		accountOne.transferFunds(300, accountTwo);
		System.out.println(accountOne);
		System.out.println(accountTwo);
		
		
		
		
		
	}
}
