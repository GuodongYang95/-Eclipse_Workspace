package com.guodong;
//GuodongYang	2431298
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_Actions implements ActionListener{
	/* 
	 * The controller need the model and view information,
	 * so create the following attributes.
	 * Other view components are all from the whole view of Fruit Machine.
	 */
	View_FruitMachine fruitMachineView;
	Model_Balance bModel_Balance;
	Model_Card leftModel_Card;
	Model_Card midModel_Card;
	Model_Card rightModel_Card;
	Model_EndGame eModel_EndGame;
	Model_GetPoints gModel_GetPoints;
	
	//Constructor
	public Control_Actions(Model_EndGame eModel_EndGame, Model_Balance bModel_Balance, 
			Model_Card leftModel_Card, Model_Card midModel_Card, Model_Card rightModel_Card, Model_GetPoints gModel_GetPoints) {
		
		this.bModel_Balance = bModel_Balance;
		this.leftModel_Card = leftModel_Card;
		this.midModel_Card = midModel_Card;
		this.rightModel_Card = rightModel_Card;
		this.eModel_EndGame = eModel_EndGame;
		this.gModel_GetPoints = gModel_GetPoints;
		
	}
	
	/*
	 * The controller does not know who is the Action Performer.
	 * Thus, we need a method to pass the view (fruitMachine) to the controller.
	 */
	public void passView(View_FruitMachine fruitMachine) {
		this.fruitMachineView = fruitMachine;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == fruitMachineView.innerButtonPanel.spinButton) {
			/*
			 *User has pressed the "spin" button,
			 *then three card panels begin drawing card by using an array with random index.
			 *The view of three card labels, balance label, getPoints details label, endGame label are also need to be updated.
			 *When user lose or win, "spin" button will be disable and "new game" button will be enable.
			 */
			leftModel_Card.drawCard();
			midModel_Card.drawCard();
			rightModel_Card.drawCard();
			bModel_Balance.update(leftModel_Card, midModel_Card, rightModel_Card);
			gModel_GetPoints.board(leftModel_Card, midModel_Card, rightModel_Card);
			eModel_EndGame.eBoard();
			fruitMachineView.leftCard.cardUpdate();
			fruitMachineView.midCard.cardUpdate();
			fruitMachineView.rightCard.cardUpdate();
			fruitMachineView.balanceLabel.balanceUpdate();
			fruitMachineView.getPointsLabel.pointsUpdate();
			fruitMachineView.endGameLabel.endGameUpdate();
			if (eModel_EndGame.endBoard.equals("You lose") ||
					eModel_EndGame.endBoard.equals("You win" )) {
				fruitMachineView.innerButtonPanel.spinButton.setEnabled(false);
				fruitMachineView.innerButtonPanel.newGameButton.setEnabled(true);
			}
		}if (e.getSource() == fruitMachineView.innerButtonPanel.newGameButton) {
			/*
			 * User has pressed the "new game" button,
			 * all information on the fruit machine will be reseted.
			 * Also, all the view of components need to update their information.
			 */
			bModel_Balance.balanceReset();
			gModel_GetPoints.boardReset();
			eModel_EndGame.endGameReset();
			leftModel_Card.cardReset("King");
			midModel_Card.cardReset("Queen");
			rightModel_Card.cardReset("Jack");
			fruitMachineView.leftCard.cardUpdate();
			fruitMachineView.midCard.cardUpdate();
			fruitMachineView.rightCard.cardUpdate();
			fruitMachineView.balanceLabel.balanceUpdate();
			fruitMachineView.getPointsLabel.pointsUpdate();
			fruitMachineView.endGameLabel.endGameUpdate();
			fruitMachineView.innerButtonPanel.newGameButton.setEnabled(false);
			fruitMachineView.innerButtonPanel.spinButton.setEnabled(true);
		}
		
	}
	
}
