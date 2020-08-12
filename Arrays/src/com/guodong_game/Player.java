package com.guodong_game;

import java.util.Scanner;

public class Player {
	protected int id;

	public Player(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void move(Desktop newdsDesktop, char a) {
		Scanner s = new Scanner(System.in);
		System.out.println(id + " please enter a postion: ");
		int row = s.nextInt();
		int column = s.nextInt();
	
	
		if (moveable(newdsDesktop, row, column)) {
			newdsDesktop.update(row, column, a);
		}else {
			
			System.out.println(" Worry input, please enter again! ");
				move(newdsDesktop, a);
		}
		
	}
	public boolean moveable(Desktop newdDesktop, int row, int column) {
		if (row > newdDesktop.desktop.length || column > newdDesktop.desktop.length || newdDesktop.desktop[row][column]!= '·') {
			return false;
		}else {
			return true;
		}
	}
	
public static boolean win(Desktop newdDesktop) {
		
		for (int i = 0; i < newdDesktop.desktop.length; i++) {
			
			for (int j = 0; j < newdDesktop.desktop.length-2; j++) {
				if (newdDesktop.desktop[i][j] == newdDesktop.desktop[i][j+1] && newdDesktop.desktop[i][j+1] == newdDesktop.desktop[i][j+2] && newdDesktop.desktop[i][j]!='·') {
					return true;
					}
			}
		}for (int i = 0; i < newdDesktop.desktop.length-2; i++) {
			for (int j = 0; j < newdDesktop.desktop.length; j++) {
				if (newdDesktop.desktop[i][j] == newdDesktop.desktop[i+1][j] && newdDesktop.desktop[i+1][j] == newdDesktop.desktop[i+2][j] && newdDesktop.desktop[i][j]!='·') {
					return true;
					}
			}
		}for (int i = 0; i < newdDesktop.desktop.length-2; i++) {
			for (int j = 0; j < newdDesktop.desktop.length-2; j++) {
				if (newdDesktop.desktop[i][j] == newdDesktop.desktop[i+1][j+1] && newdDesktop.desktop[i+1][j+1] == newdDesktop.desktop[i+2][j+2] && newdDesktop.desktop[i][j]!='·') {
					return true;
					}
			}
		}
		
		return false;
			
	}
	
	
	
	
	
}
