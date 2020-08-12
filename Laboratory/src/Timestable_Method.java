import java.util.Scanner;

public class Timestable_Method {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int input = s.nextInt();
		System.out.println("Please enter a number of the max of this times table: ");
		int max = s.nextInt();
		times(input, max);
	}
	public static void times(int n, int m) {

		for (int i = 1; i <= m; i++) {
			int result = n * i;
			String timesTable = n + "x" + i + "=" + result;
			System.out.println(timesTable);
		}
	}

}
