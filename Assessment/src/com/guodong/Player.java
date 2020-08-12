package com.guodong;
// GuodongYang	2431298
public class Player {
	//Attributes
	private String name;
	private char counterSymbol;
	
	//Constructor
	public Player(String name, char counterSymbol) {
		
		this.name = name;
		this.counterSymbol = counterSymbol;
	}

	//Getter
	public String getName() {
		return name;
	}
	public char getCounterSymbol() {
		return counterSymbol;
	}
	

	@Override
	public String toString() {
		return name;
	}

	
	
	
}
