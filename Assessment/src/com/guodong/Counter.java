package com.guodong;
// GuodongYang	2431298
public class Counter {
	//Attribute
	private Player player;
	
	//Constructor
	public Counter(Player player) {
		this.player = player;
	}
	
	//Getter
	public Player getPlayer() {
		return player;
	}


	@Override
	public String toString() {
		//Use "" and a char type in order to return a String type.
		return "" + player.getCounterSymbol();
	}
	
	//Overwrite the Class equals method for distinguishing this player and other player.
	public boolean equals(Counter other){
		
		if (this.player == other.player) {
			return true;
		}else {
			return false;
			
		}
	}
	
	


}
