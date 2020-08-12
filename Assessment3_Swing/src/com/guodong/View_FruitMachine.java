package com.guodong;
//GuodongYang 2431298
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class View_FruitMachine extends JFrame{
	/*
	 * This View_FruitMachine contains all the components.
	 * Declare the attributes from other views and the length of unit.
	 */
	View_Buttons innerButtonPanel;
	View_Balance balanceLabel;
	View_Card leftCard;
	View_Card midCard;
	View_Card rightCard;
	View_EndGame endGameLabel;
	View_GetPoints getPointsLabel;
	final static int UNIT = 20;
	
	public View_FruitMachine (Model_EndGame endGame, Model_Balance balance, 
			Model_Card leftcardModel, Model_Card midcardModel, Model_Card rightcardModel, Model_GetPoints getPointsModel,
			ActionListener parent) {
		/*
		 * Create the following View components,
		 * which need the information from the corresponding Model.
		 */
		innerButtonPanel = new View_Buttons(parent);
		balanceLabel = new View_Balance(balance);
		leftCard = new View_Card(leftcardModel);
		midCard = new View_Card(midcardModel);
		rightCard = new View_Card(rightcardModel);
		endGameLabel = new View_EndGame(endGame);
		getPointsLabel = new View_GetPoints(getPointsModel);
		
		//Set JFrame exit, title and size.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("FruitMachine Gui");
		this.setSize(30*UNIT,20*UNIT);
		
		//Create a main panel and an emptyBorder inside.
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		Border emptyBorder = BorderFactory.createEmptyBorder(UNIT, UNIT, UNIT, UNIT);
		mainPanel.setBorder(emptyBorder);
		
		//Add a inner panel inside of the emptyBorder.
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(2,1));
		mainPanel.add(innerPanel);
		
		//Split the innerPanel into two panels, topInnerPanel and bottomInnerPanel.
		JPanel topInnerPanel = new JPanel();
		innerPanel.add(topInnerPanel);
		topInnerPanel.setLayout(new GridLayout(3,1));
		
		JPanel bottomInnerPanel = new JPanel();
		innerPanel.add(bottomInnerPanel);
		bottomInnerPanel.setLayout(new GridLayout(1,2));
		
		//On the left hand of bootomInnerPanel, add a cardPanel of which three card panels inside.
		JPanel cardPanel = new JPanel();
		bottomInnerPanel.add(cardPanel);
		cardPanel.setLayout(new GridLayout(1,3, UNIT, UNIT));
		
		/*
		 * On the right hand of bottomInnerPanel,
		 * add a bottonPanel in BorderLayout with an emptyBorder2 inside.
		 */
		JPanel buttonPanel = new JPanel();
		bottomInnerPanel.add(buttonPanel);
		buttonPanel.setLayout(new BorderLayout());
		Border emptyBorder2 = BorderFactory.createEmptyBorder(UNIT, UNIT, UNIT, UNIT);
		buttonPanel.setBorder(emptyBorder2);
		
		/*
		 * Add the following components into the corresponding part.
		 */
		topInnerPanel.add(balanceLabel);
		topInnerPanel.add(getPointsLabel);
		topInnerPanel.add(endGameLabel);
		cardPanel.add(leftCard);
		cardPanel.add(midCard);
		cardPanel.add(rightCard);
		buttonPanel.add(innerButtonPanel);
		
	}
	
	
	
	
	
}
