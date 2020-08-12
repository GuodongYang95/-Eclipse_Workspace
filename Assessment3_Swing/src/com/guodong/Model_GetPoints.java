package com.guodong;
//GuodongYang	2431298
public class Model_GetPoints {
	/*
	 * Class to describe game details.
	 * Call Model_Card method and counters.
	 * Show the details on the View of getPoints label.
	 */
	
	//Declare attributes
	//cardSoreOutcome is used for storing the return value of cardScore method from Model card.
	String scoreBoard;
	int cardScoreOutcome;
	
	//Constructor: pass game details "scoreBoard" to the View of getPoints.
	public Model_GetPoints(String scoreBoard) {
		this.scoreBoard = scoreBoard;
	}
	
	//The method of showing game details.
	public void board(Model_Card leftCard, Model_Card midCard,
			Model_Card rightCard) {
		cardScoreOutcome = Model_Card.cardScore(leftCard, midCard, rightCard);
		 if (Model_Card.jokerCount == 0) {
			if (cardScoreOutcome == 50 || cardScoreOutcome == 20) {
				scoreBoard = Model_Card.othersCount +" - you win " 
						+ cardScoreOutcome + " points";
			}else {
				scoreBoard = "Balance unchanged";
			}
		}else if (Model_Card.jokerCount == 1) {
			scoreBoard = Model_Card.jokerCount + " jokers: " + "you lose " 
				+ cardScoreOutcome + " points";
		}else if (Model_Card.jokerCount == 2) {
			scoreBoard = Model_Card.jokerCount + " jokers: " + "you lose " 
				+ cardScoreOutcome + " points";
		}else {
			scoreBoard = Model_Card.jokerCount + " jokers: " + "you lose " 
				+ cardScoreOutcome + " points";
		}
	}
	
	//The method of resetting game details to a initial view "welcome!"
	public void boardReset() {
		scoreBoard = "welcome!";
	}
	
	
	
	
}
