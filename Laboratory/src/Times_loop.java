
public class Times_loop {
	public static void main(String[] args) {
		int n = 1;
		int m = 1;

		int result;
		String times;
		do {
			m = n;
			do {
				result = n * m;
				times = n + "x" + m + "=" + result + " ";
				System.out.print(times);
				m++;
			} while (m <= 9);
			n++;
			System.out.println();
		} while (n <= 9);

	}

}
