
public class Leap_yaer_method2 {
	public static void main(String[] args) {
		int thisYear = 2020;

		if ((thisYear % 4 == 0 && thisYear % 100 != 0) || thisYear % 400 == 0) {
			System.out.println(thisYear + " is a leap year.");
		} else {
			System.out.println(thisYear + " is not a leap year.");
		}
	}
}
