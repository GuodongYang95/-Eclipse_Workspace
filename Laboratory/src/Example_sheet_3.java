import java.util.Scanner;

public class Example_sheet_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String Method = fortuneTeller(s);
		System.out.println(Method);
	}
	public static String fortuneTeller(Scanner myScanner) {
		System.out.println("Pick a number!");
		int n = myScanner.nextInt();
		myScanner.nextLine(); 
		if (n % 5 == 0) {
			System.out.println("Pick one of the colours: red, blue, green, yellow");
			String colour = myScanner.nextLine().trim();
			if (colour.equals("red"))
				return "You will be very rich!";
			if (colour.equals("blue"))
				return "You will have eternal happiness!";
			if (colour.equals("green"))
				return "Your children will be strong!";
			if (colour.equals("yellow"))
				return "Your childern will be wise!";
			return "You made a mistake!";
		} else {
			System.out.println("Pick one of the colours: pink, purple, black, white");
			String colour = myScanner.nextLine().trim();
			if (colour.equals("pink"))
				return "You will have a big house!";
			if (colour.equals("purple"))
				return "You will live to be very old!";
			if (colour.equals("black"))
				return "You will never be lonely!";
			if (colour.equals("white"))
				return "You will never be hungry!";
			return "You made a mistake!";

		}

	}

}
