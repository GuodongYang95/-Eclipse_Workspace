package com.guodong;

public class Character implements Comparable{
	private String name;
	private int strength;
	private int gold;
	
	public Character(String n, int s, int g) {
		name = n;
		strength = s;
		gold = g;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public String toString() {
		return  name + ", " + strength + ", " + gold;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Character) {
			Character next = (Character)o;
			if (next.getGold() > this.getGold()) {
				return 1;
			}
			else if (next.getGold() < this.getGold()) {
				return -1;
			}else {
				if (next.getStrength() > this.getStrength()) {
					return 1;
				}else if (next.getStrength() < this.getStrength()) {
					return -1;
				}else {
					if (next.getName().compareTo(this.getName()) == 1) {
						return 1;
					}else if (next.getName().compareTo(this.getName()) == -1) {
						return -1;
					}else {
						return 0;
					}
				}
			}
		}
		return 0;
	}
	

	
}
