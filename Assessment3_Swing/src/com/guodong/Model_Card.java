package com.guodong;
//GuodongYang	2431298
import java.util.Random;
/*
 * Class to hold methods used in card panel.
 * Whenever pressing the "spin" button, draw cards randomly by an array.
 * Based on the content of each card, return the corresponding scores to balance.
 * After pressing the "new game" button, reset three cards.
 */
public class Model_Card {
	/*
	 * Create an array to hold the content of cards and store it in a String type "card"
	 * Create two static counters to count the number of "joker" card and others. 
	 */
	String[] cardArray = {"King", "Queen", "Jack", "Joker", "Ace"};
	String card;
	static int jokerCount = 0;
	static String othersCount = "";
	
	//Constructor: pass the content of "card" to View_card.
	public Model_Card(String card) {
		this.card = card;
	}
	
	//Getter
	public String getCard() {
		return card;
	}
	
	//Setter
	public void setCard(String card) {
		this.card = card;
	}
	
	//The method of drawing cards
	public void drawCard() {
		Random r = new Random();
		int randomCard = r.nextInt(5);
		card = cardArray[randomCard];		
	}
	
	/*
	 * The method of getting scores.
	 * 1. No "Joker" among three cards (50/20/0)
	 * 2. Three jokers (-75)
	 * 3. Two jokers in three cards (-50)
	 * 4. One joker in three cards (-25)
	 */
	public static int cardScore(Model_Card leftCard, Model_Card midCard,
								Model_Card rightCard) {
		if ((!leftCard.card.equals("Joker")) && (!midCard.card.equals("Joker"))
				&&  (!rightCard.card.equals("Joker"))) {
			if (leftCard.card.equals(midCard.card) && midCard.card.equals(rightCard.card) ) {
				othersCount = "Three of a kind";
				jokerCount = 0;
				return 50;
			}else if (leftCard.card.equals(midCard.card) || midCard.card.equals(rightCard.card)
					|| leftCard.card.equals(rightCard.card)) {
				jokerCount = 0;
				othersCount = "Two of a kind";
				return 20;
			}else {
				jokerCount = 0;
				othersCount = "";
				return 0;
			}
		}else if ((leftCard.card.equals("Joker")) && (midCard.card.equals("Joker")) 
					&& (rightCard.card.equals("Joker"))) {
				jokerCount = 3;
				othersCount = "";
				return -75;
		}else if ((leftCard.card.equals("Joker") && midCard.card.equals("Joker"))
				|| (leftCard.card.equals("Joker") && rightCard.card.equals("Joker"))
				|| (midCard.card.equals("Joker") && rightCard.card.equals("Joker"))) {
				jokerCount = 2;
				othersCount = "";
				return -50;
		}else {
			jokerCount = 1;
			othersCount = "";
			return -25;
		}
		
	}
	
	//After pressing "new game", reset the cards' content.
	public void cardReset(String cardName) {
		card = cardName;
	}

	
	
	
}
