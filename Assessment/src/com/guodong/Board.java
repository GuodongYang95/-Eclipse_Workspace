package com.guodong;
//GuodongYang	2431298
public class Board {
	//Attributes
	int row;
	int column;
	Column[] columnArray;
	String [] numsColumnArray = null;
	int sybmolNums = 0;
	String [] sybmolArray = null;
	String [][] boardArray = null;
	
	//Constructor 
	public Board(int row, int column) {
		this.row = row;
		this.column = column;
		columnArray = new Column[column];
		for (int i = 0; i < columnArray.length; i++) {
			// Define how many rows in each column. 
			columnArray[i] = new Column(row); 
		}
		numsColumnArray = new String[column];
		sybmolNums += column*2;
		sybmolArray = new String[sybmolNums];
		boardArray = new String[row][column];
	}

	//Add the value into columnArray and check (update) the board,
	//calling addBoardArray method in order to add values into boardArray
	public boolean add(Counter p, int column) {
		if (columnArray[column].add(p)) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < this.column; j++) { 
					addBoardArray(i, j);
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	//Put the values into boardArray
	public void addBoardArray(int i, int j) {
			boardArray[i][j] = columnArray[j].displayRow(i);
	}
	
	
	@Override
	public String toString() {
		//Output the title of board.
		String output = "";
		for (int i = 0; i < column; i++) {
			if (i < column -1) {
				numsColumnArray[i] = "|" + i;
				output += numsColumnArray[i];
			}else {
				numsColumnArray[i] = "|" + i + "|";
				output += numsColumnArray[i];
			}
		}
		output += "\n";
		
		//Print "------------".
		String sybmolOutput = "";
		for (int i = 0; i < sybmolNums; i++) {
			sybmolArray[i] = "-";
			sybmolOutput += sybmolArray[i];
		}
		output += sybmolOutput + "\n" ;
			
		//Output the main board.
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (j < column -1) {
					output += "|" + boardArray[i][j];
				}
				if (j == column -1) {
					output += "|" + boardArray[i][j] + "|";
				}
			} output = output + "\n";
		}
		
		return output;	
	}
	
	public boolean isFull(){
			for (int i = 0; i <= column;) { 
				//Use i as an object of columnArray;
				//But the maximum of i is set to equal to column;
				//Because it is used to be an counter; 
				if (columnArray[i].isFull()) {
					i++;						
					if (i == column) {
						return true;
					}
				}else {
					return false;
				}
			}
			return false;
		}
	
	
	public static boolean win(Board board) {
			//Check the output in horizontal whether they are from the same player.
			for (int i = 0; i < board.row; i++) {
			for (int j = 0; j < board.column-3; j++) {
				if (
					board.columnArray[j].numRowsArray[i] != null 
					// In order to ensure it  has an  object and avoid NullPointer exception.
					&& board.columnArray[j+1].numRowsArray[i] != null
					&& board.columnArray[j+2].numRowsArray[i] != null
					&& board.columnArray[j+3].numRowsArray[i] != null
					&& board.columnArray[j].numRowsArray[i].equals(board.columnArray[j+1].numRowsArray[i])
					&& board.columnArray[j+1].numRowsArray[i].equals(board.columnArray[j+2].numRowsArray[i])
					&& board.columnArray[j+2].numRowsArray[i].equals(board.columnArray[j+3].numRowsArray[i])
					&& (!board.boardArray[i][j].equals(" "))) {
					System.out.println(board.columnArray[j].numRowsArray[i].getPlayer() 
										+ " '" + board.columnArray[j].numRowsArray[i] + "' "+ " WIN! "+ "\n");
					return true;
					}
				}
			}
			
			//Check the output in vertical whether they are from the same player.
			for (int i = 0; i < board.row-3; i++) {
			for (int j = 0; j < board.column; j++) {
				if (board.boardArray[i][j] != null
						&& board.boardArray[i+1][j] != null
						&& board.boardArray[i+2][j] != null
						&& board.boardArray[i+3][j] != null
						&& board.boardArray[i][j].equals(board.boardArray[i+1][j])
						&& board.boardArray[i+1][j].equals(board.boardArray[i+2][j]) 
						&& board.boardArray[i+2][j].equals(board.boardArray[i+3][j])
						&& (!board.boardArray[i][j].equals(" "))) {
					System.out.println(board.columnArray[j].numRowsArray[i].getPlayer() 
										+ " '" + board.columnArray[j].numRowsArray[i] + "' " + " WIN! " + "\n");
					return true;
				}
			} 
		}
			for (int i = 0; i < board.row-3; i++) {
				//Check the output in diagonal (\) whether they are from the same player.
			for (int j = 0; j < board.column-3; j++) {
				if (board.boardArray[i][j] != null
						&& board.boardArray[i+1][j+1] != null
						&& board.boardArray[i+2][j+2] != null
						&& board.boardArray[i+3][j+3] != null
						&& board.boardArray[i][j].equals(board.boardArray[i+1][j+1]) 
						&& board.boardArray[i+1][j+1].equals(board.boardArray[i+2][j+2]) 
						&& board.boardArray[i+2][j+2].equals(board.boardArray[i+3][j+3])
						&& (!board.boardArray[i][j].equals(" "))) {
					System.out.println(board.columnArray[j].numRowsArray[i].getPlayer() 
										+ " '" + board.columnArray[j].numRowsArray[i] + "' " + " WIN! "+ "\n");
					return true;
					}
			}
			//Check the output in diagonal (/) whether they are from the same player.
			for (int j = board.column-1; j >3; j--) {
				if (board.boardArray[i][j] != null
						&& board.boardArray[i+1][j-1] != null
						&& board.boardArray[i+2][j-2] != null
						&& board.boardArray[i+3][j-3] != null
						&& board.boardArray[i][j].equals(board.boardArray[i+1][j-1])
						&& board.boardArray[i+1][j-1].equals(board.boardArray[i+2][j-2]) 
						&& board.boardArray[i+2][j-2].equals(board.boardArray[i+3][j-3])
						&& (!board.boardArray[i][j].equals(" "))) {
					System.out.println(board.columnArray[j].numRowsArray[i].getPlayer() 
										+ " '" + board.columnArray[j].numRowsArray[i] + "' " + " WIN! "+ "\n");
					return true;
					}
			}
		}
		return false;
	}
	
	
	
	}
	
