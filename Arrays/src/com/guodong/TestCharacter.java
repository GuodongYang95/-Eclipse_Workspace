package com.guodong;

import java.util.Arrays;

public class TestCharacter {
	public static void main(String[] args) {
		Character[] person = new Character[4];
		person[0] = new Character("Jelly", 108, 98);
		person[1] = new Character("Ken", 110, 111);
		person[2] = new Character("Amy", 88, 80);
		person[3] = new Character("Jet", 108, 98);
		
		System.out.println("Unsorted");
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i]);
		}
		Arrays.sort(person);
		System.out.println("\nSorted");
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i]);
		}
	}
}
