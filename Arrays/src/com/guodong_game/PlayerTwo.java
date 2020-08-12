package com.guodong_game;

public class PlayerTwo extends Player{

	public PlayerTwo(int id) {
		super(id);
	}
	
	public void move(Desktop newdesDesktop) {
		super.move(newdesDesktop, 'X');
	}

}
