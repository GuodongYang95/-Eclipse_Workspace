import java.util.Scanner;

public class Days_method2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a year!");
		int year = s.nextInt();

		System.out.println("Please enter a month!");
		String month = s.next();

		boolean isLeap;
		isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
				|| month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			System.out.println(month + " has 31 days.");

		} else if (month.equals("Feb") && (isLeap == true)) {
			System.out.println(month + " has 29 days.");
		} else if (month.equals("Feb") && (isLeap == false)) {
			System.out.println(month + " has 28 days.");
		} else {
			System.out.println(month + " has 30 days.");
		}
	}
}
