package com.guodong;

public class IntArray {																				
	public static void main(String[] args) {
		int pos = -1; 
		boolean found = false;
		int[] myIntArray = {4, 3, 17, 8, 3, -6};
		for(int i = 0; i < myIntArray.length && found == false; i++) {
			
			if (myIntArray[i] == 3) {
				pos = i;
				found = true;
				System.out.println(pos);
			}
//			myIntArray[i] = 2*i;
//			String output = String.format("Element %d = %d", i, myIntArray[i]);
//			System.out.println(output);
		}
		if (found == false) {
			System.out.println(pos);
		}
		
	}
}
