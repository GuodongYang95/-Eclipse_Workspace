package com.guodong;

public class ExpandableArray {
	private int[] myArray = new int[10];
	private int pos = 0;
	public void add(int a) {
		if (pos >= myArray.length) {
			int currentLength = myArray.length;
			int newLength = currentLength + 10;
			int[] newArray = new int[newLength];
			
			for (int i = 0; i < currentLength; i++) {
				newArray[i] = myArray[i];
			}
			
			myArray = newArray;
		}
		
		myArray[pos] = a;
		pos++;
	}
	
	public String toString() {
		String line = "";
		for (int i = 0; i <= pos; i++) {
			line += i + ", ";
		}
		return line;
	}
	public int getLength() {
		return myArray.length;
	}
	
}
