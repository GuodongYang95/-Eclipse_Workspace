package com.guodong_game;

public class Playerone extends Player {

	public Playerone(int id) {
		super(id);
	}
	
	public void move(Desktop newdsDesktop) {
		super.move(newdsDesktop, 'O');
	}
	
	
	
}	
