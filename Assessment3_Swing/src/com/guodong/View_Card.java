package com.guodong;
//GuoongYang	2431298
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View_Card extends JPanel{
	//Class to show the card panel
	
	//Declare attributes
	JLabel cardLabel;
	Model_Card cardModel;
	
	//Constructor: a Model_Card object is needed in order to get the card content.
	public View_Card(Model_Card cardModel) {
		this.cardModel = cardModel;
		
		//Create a label storing the card content
		cardLabel = new JLabel(cardModel.card, JLabel.CENTER);
		
		//Set font
		cardLabel.setFont(new Font("Serif", Font.BOLD, 20));
		
		//Set layout
		this.setLayout(new BorderLayout());
		
		//Add the card label to this panel
		this.add(cardLabel);
		
		//Set border
		this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		
		//Set background
		this.setBackground(Color.YELLOW);
		
	}
	
	//The method of updating the view
	public void cardUpdate() {
		cardLabel.setText(cardModel.card);
	}
}
