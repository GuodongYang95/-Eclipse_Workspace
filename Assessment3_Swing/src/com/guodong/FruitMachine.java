package com.guodong;
//GuodongYang	2431298
public class FruitMachine {
	public static void main(String[] args) {
		/*
		 * Create model objects and give them initial value.
		 */
		Model_Balance bModel_Balance = new Model_Balance();
		Model_Card leftModel_Card = new Model_Card("King");
		Model_Card midModel_Card = new Model_Card("Queen");
		Model_Card rightModel_Card = new Model_Card("Jack");
		Model_GetPoints gModel_GetPoints = new Model_GetPoints("welcome!");
		Model_EndGame eModel_EndGame = new Model_EndGame(bModel_Balance);
		
		/*
		 * The controller does not know who is the Action performer.
		 * So, we need to create the controller object first, and then pass a view object 
		 * by using a method.
		 */
		Control_Actions controller = new Control_Actions(eModel_EndGame, bModel_Balance, 
				leftModel_Card, midModel_Card, rightModel_Card, gModel_GetPoints);
		
		View_FruitMachine fruitMachine = new View_FruitMachine(eModel_EndGame, bModel_Balance, 
				leftModel_Card, midModel_Card, rightModel_Card, gModel_GetPoints, controller);
		
		//Call the method from the controller. 
		controller.passView(fruitMachine);
		
		//Set the view of fruit machine visible.
		fruitMachine.setVisible(true);
		
		
		
	}
}
