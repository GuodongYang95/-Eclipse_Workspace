package com.guodong_game;

public class Test {
	public static void main(String[] args) {
		Desktop newDesktop = new Desktop(3, 3);
		Playerone playerOne = new Playerone(1);
		PlayerTwo playerTwo = new PlayerTwo(2);
	
	
		while (true) {
			
			playerOne.move(newDesktop);
			newDesktop.show();
			
			if (Player.win(newDesktop)) {
				System.out.println("YOU WIN!");
				break;
			}
			playerTwo.move(newDesktop);
			newDesktop.show();
			
			if (Player.win(newDesktop)) {
				System.out.println("YOU WIN!");
				break;
			}
		}
		
		
		
	}
}
