package com.guodong;
//GuodongYang	2431298
import java.awt.Font;

import javax.swing.JLabel;

//Class to show balance details in a label.
public class View_Balance extends JLabel{
	//Declare attributes
	Model_Balance balance;
	String balanceText;
	
	//Constructor: a Model_Balance object is needed to get the balance value.
	public View_Balance (Model_Balance balance) {
		this.balance = balance;
		balanceText = "balance is " + balance.getBalance();
		this.setText(balanceText);
		this.setFont(new Font(getName(), Font.ITALIC, 16));
	}
	
	//The method of updating the View of balance label.
	public void balanceUpdate() {
		balanceText = "balance is " + balance.getBalance();
		this.setText(balanceText);
			
		}
	
	
}
