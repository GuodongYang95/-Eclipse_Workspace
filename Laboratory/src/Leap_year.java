
public class Leap_year {
	public static void main(String[] args) {
		int thisYear = 2019;
		if (leap(thisYear)) {
			System.out.println(thisYear + " is a leap year!");
		} else {
			System.out.println(thisYear + " is not a leap year!");
		}
	}

	public static boolean leap(int ty) {
		if ((ty % 4 == 0 && ty % 100 != 0) || ty % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
