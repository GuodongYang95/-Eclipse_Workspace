package com.guodong_ExceptionsFileIO;

public class BankAccountTest {
	public static void main(String[] args) {
		Person personOne = new Person("Bill");
		BankAccount accountOne = new BankAccount(personOne);
		BankAccount accountTwo = new BankAccount(personOne);
		
//		BankAccount accountTwo = new BankAccount("Ken");
		
//		System.out.println(accountOne.toString());
//		System.out.println(accountTwo.toString());
		
		accountOne.setBalance(300);
		accountOne.depositFunds(0);
		accountTwo.setBalance(50);
		System.out.println(accountOne);
		System.out.println(accountTwo);
		
		try {
			accountOne.withdrawFunds(0);
		} catch (WithdrawException e) {
			System.out.println(" Your balance is not enough!");
		}
		
		try {
			accountOne.transferFunds(600, accountTwo);
		} catch (WithdrawException e) {
			
			System.out.println(" Your balance is not enough!");
			e.printStackTrace();
		}
		System.out.println(accountOne);
		System.out.println(accountTwo);
		
	}
}
