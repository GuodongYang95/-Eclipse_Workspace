package com.guodong;
//GuodongYang	2431298
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class View_Buttons extends JPanel{
	//Class to show two buttons in a panel and listen the corresponding action.
	
	//Declare attributes
	JButton spinButton;
	JButton newGameButton;
	
	//Constructor: listen the corresponding action
	public View_Buttons(ActionListener parent) {
		//Create two buttons and to be the Action listener
		spinButton = new JButton("spin");
		spinButton.addActionListener(parent);
		newGameButton = new JButton("new game");
		newGameButton.addActionListener(parent);
		
		//Set font
		newGameButton.setFont(new Font(getName(), Font.PLAIN, 20));
		spinButton.setFont(new Font(getName(), Font.PLAIN, 20));
		
		//Set layout
		this.setLayout(new GridLayout(2,1));
		
		//Add two buttons in this panel
		this.add(spinButton);
		this.add(newGameButton);
		
		//Set the initial state of two buttons 
		spinButton.setEnabled(true);
		newGameButton.setEnabled(false);
		
	}
	
	
}	
