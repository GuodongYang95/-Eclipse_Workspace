package Ex3;

import java.util.Scanner;

public class Users_days {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a year!");
		int year = s.nextInt();

		System.out.println("Please enter a month!");
		String month = s.next();

		Month_days.Method(year, month);
	}
}
