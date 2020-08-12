package com.guodong.Ex;

public class Test {
	public static void main(String[] args) {
		NewBankAccount personOneAccount = new NewBankAccount(new Person("Jelly"),0.3);
		
		personOneAccount.depositFunds(500);
		
		personOneAccount.addIntertest();
		
		System.out.println(personOneAccount);
		
		
//		System.out.println(PersonOne.getName());
//		
//		PersonOne.setName("Ken");
//		
//		System.out.println(PersonOne.getName());
//		
//		System.out.println(PersonOne);
	}
}
