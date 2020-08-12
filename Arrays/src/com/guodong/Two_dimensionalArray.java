package com.guodong;

public class Two_dimensionalArray {
	public static void main(String[] args) {
		int [][] table = new int [6][6];
		int pos = 1;

		for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table.length; j++) {
					table[i][j]=0;
					}
			
				}
		for (int i = 0; i < table.length; i++) {
			for (int j = i; j < table.length; j++) {
				table[i][j]=pos;
				pos++;
			}pos = 1;
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j]+ "  ");
			}System.out.println(" ");
		}
		}
	}

