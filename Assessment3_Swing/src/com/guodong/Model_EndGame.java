package com.guodong;
//GuodongYang	2431298
public class Model_EndGame {
	/*
	 * Class to end the game by judging balance.
	 * When balance is less than 0, you lose.
	 * When balance is equal to or greater than 150, you win.
	 */
	
	//Declare attributes
	String endBoard;
	Model_Balance balance;
	
	//Constructor: a Model_Balance object is needed to get the balance.
	//Give a initial value to endBoard.
	public Model_EndGame(Model_Balance balance) {
		endBoard = "";
		this.balance = balance;
	}
	
	//The method of judging winner or loser.
	public void eBoard() {
		if (balance.getBalance() < 0) {
			endBoard = "You lose";
		} else if (balance.getBalance() >= 150) {
			endBoard = "You win";
		} 
	}
	
	//The method of resetting endBoard.
	public void endGameReset() {
		endBoard = "";
	}
	
}
