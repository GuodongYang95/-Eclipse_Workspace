package com.guodong_game;


public class Desktop {
	char[][] desktop;
	int row;
	int column;
	
	public void setup() {
		for (int i = 0; i < desktop.length; i++) {
			for (int j = 0; j < desktop.length; j++) {
				desktop[i][j] = '·';
			}
		}
	}

	public Desktop(int row, int column) {
		this.row = row;
		this.column = column;
		this.desktop = new char[row][column];
		setup();
	}
	
	public void show() {
		for (int i = 0; i < desktop.length; i++) {
			for (int j = 0; j < desktop.length; j++) {
				System.out.print(desktop[i][j] + " ");
			}System.out.println(" ");
		}
	}
	
	public void update(int row, int column,char a) {
		desktop[row][column] = a;
	}
}
