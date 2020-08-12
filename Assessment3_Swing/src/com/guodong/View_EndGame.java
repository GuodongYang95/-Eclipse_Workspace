package com.guodong;
//GuodongYang	2431298
import java.awt.Font;

import javax.swing.JLabel;

public class View_EndGame extends JLabel {
	//Class to show the view of end game 
	
	//Declare attributes
	Model_EndGame endModel;
	String endText;
	
	//Constructor: a Model_EenGame object is needed to get the end game content.
	public View_EndGame(Model_EndGame endModel) {
		this.endModel = endModel;
		endText = endModel.endBoard;
		
		//Set text to this label
		this.setText(endText);
		
		//Set font
		this.setFont(new Font(getName(), Font.ITALIC, 16));
	}
	
	//The method of updating the view of end game
	public void endGameUpdate() {
		endText = endModel.endBoard;
		this.setText(endText);
	}
}
