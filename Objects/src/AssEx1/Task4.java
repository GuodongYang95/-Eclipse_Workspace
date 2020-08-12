package AssEx1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer, an operator(\"+\" or \"-\") and another integer: ");
		int NumberOne = s.nextInt();
		s.nextLine();
		String operator = s.nextLine().trim();
		int NumberTwo = s.nextInt();
	
		int totalResult = 0;
		if (operator.equals("+")) {
			totalResult = NumberOne + NumberTwo;
		}
		else if (operator.equals("-")) {
			totalResult = NumberOne - NumberTwo;
		}else {
			System.out.println("Incorrect operater!");
		}
		
		String line = String.format("Calculation: %d %s %d = %04d ", NumberOne, operator, NumberTwo, totalResult);
		
		System.out.println(line);
		
		s.close();
	}

}
