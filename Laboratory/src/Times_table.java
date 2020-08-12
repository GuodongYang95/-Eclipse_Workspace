import java.util.Scanner;

public class Times_table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int input = s.nextInt();

		for (int i = 1; i <= 9; i++) {

			int result = input * i;
			String timesTable = input + "x" + i + "=" + result;
			System.out.println(timesTable);

		}

	}

}
