package com.guodong;
//GuodongYang	2431298
/*
 * Class to hold methods used in balance label.
 * Whenever three cards are drawn by Model_Card methods, update the balance value.
 * After pressing the "new game" button, reset the balance.
 */
public class Model_Balance {
	
	private int balance;
	
	//Constructor: give the balance a initial value.
	public Model_Balance() {
		this.balance = 100;	
	}

	//Getter
	public int getBalance() {
		return balance;
	}
	//Setter
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//The method of updating balance's value by calling Model_Card method.
	public void update(Model_Card leftCard, Model_Card midCard,
						Model_Card rightCard) {
		 balance += Model_Card.cardScore(leftCard, midCard, rightCard);
	}
	
	//The method of reseting balance's value.
	public void balanceReset() {
		balance = 100;
	}
}
