package com.guodong;

import java.util.Arrays;

public class Occurance {
	public static void main(String[] args) {
		int[] myArray = {4, 3, 17, 3, 8, 3, -6, 5, 3, 10, 9, 8, 3, 12, 3};
		
		System.out.println(Arrays.toString(FoundIndex(myArray, 3)));
	}
	public static int[] FoundIndex(int[] foundArray, int number){
		int[] newArray = new int [foundArray.length];
		int pos = 0;
		for (int j = 0; j < newArray.length; j++) {
			newArray[j] = -1;
		}
			for (int i = 0; i < foundArray.length; i++) {
				if (foundArray[i] == number) {
					newArray[pos] = i;
					pos++;	
				} 
			}
			int[] judgeArray = new int [pos];
			for (int i = 0; i < pos; i++) {
				judgeArray[i] = newArray[i];
			}
			return judgeArray;
}
}