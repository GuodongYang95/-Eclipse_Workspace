package com.guodong;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please PlayerOne enter a row and a column: ");
		int playerOneRow = input.nextInt();
		int playerOneColumn = input.nextInt();
		
	char[][] desktop = new char [3][3];
		
		for (int i = 0; i < desktop.length; i++) {
			for (int j = 0; j < desktop.length; j++) {
				desktop[i][j]= '·';
			}	
		}
		desktop[playerOneRow][playerOneColumn] = 'O';
		Show(desktop);
		
		while (true) {
			System.out.println("Please playerTwo enter a row and a column: ");
			int playerTwoRow = input.nextInt();
			int playerTwoColumn = input.nextInt();
			desktop[playerTwoRow][playerTwoColumn] = 'X';
			Show(desktop);
			
			System.out.println("Please playerOne enter a row and a column: ");
			int playerOneRow2 = input.nextInt();
			int playerOneColumn2 = input.nextInt();
			desktop[playerOneRow2][playerOneColumn2] = 'O';
			Show(desktop);
			

		}		
		
	}
	
	public static void Show(char desktop[][]) {
		
		for (int i = 0; i < desktop.length; i++) {
			for (int j = 0; j < desktop.length; j++) {
				System.out.print(desktop[i][j]+"  ");
			}System.out.println(" ");
		}
	
	
		
	}
}
