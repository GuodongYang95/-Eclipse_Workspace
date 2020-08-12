package com.guodong;
// GuodongYang	2431298
public class Column {
	//Attributes
	public int numRows;
	Counter [] numRowsArray;
	int pos = 0;
	
	//Constructor
	public Column(int numRows) {
		this.numRows = numRows;
		numRowsArray= new Counter[numRows];
		pos += numRows -1;
	}
	
	//Estimate numRowsArray whether is full or not.
	public boolean isFull(){
		if (numRowsArray[0] != null) {
			return true;
		}else {
			return false;
		}
	}
	
	//Add values into numRowsArray if it is not full.
	public boolean add(Counter p) {
		if (isFull() == false) {
			numRowsArray[pos] = p;
			pos--;
			return true;
		}else {
			return false;
		}
	}
	
	
	public String displayRow(int rowNumber) {
		/*Ensure the row number is in an acceptable range.
		 *And there is a counter at that position.
		 */
		if (rowNumber >= 0 && rowNumber <numRows && numRowsArray[rowNumber] != null) { 
			return "" + numRowsArray[rowNumber];  
		}else {
			return " ";
		}
	}
	
	//For task 3, displaying the board.
	public void dispaly() {
			for (int i = 0; i < numRowsArray.length; i++) {	
				System.out.println(numRowsArray[i]);
			}
	}
}
