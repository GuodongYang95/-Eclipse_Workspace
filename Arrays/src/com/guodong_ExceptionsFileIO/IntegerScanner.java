package com.guodong_ExceptionsFileIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer!");
		
		boolean test = false;
		while (test == false) {
			try {								
				String line = s.nextLine();
				Scanner r = new Scanner(line);
				int input = r.nextInt();
				System.out.println(input);
				test = true;
			} catch (InputMismatchException e) {
				System.out.println("Error! Try again!");
				e.printStackTrace();
			}
			
		}
		
	
	}
}
