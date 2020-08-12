package com.guodong;
//GuodongYang	2431298
import java.awt.Font;

import javax.swing.JLabel;

public class View_GetPoints extends JLabel {
	//Class to show game details on a label
	
	//Declare the attribute
	Model_GetPoints pointsModel;
	
	//Constructor: a Model_GetPoints object is needed in order to get game details 
	public View_GetPoints ( Model_GetPoints pointsModel) {
		this.pointsModel = pointsModel;
		
		//set text from Model_GetPoints to this label
		this.setText(pointsModel.scoreBoard);
		
		//Set font
		this.setFont(new Font(getName(), Font.ITALIC, 16));
	}
	
	//The method of updating the view of game details
	public void pointsUpdate() {
		this.setText(pointsModel.scoreBoard);
	}
}
