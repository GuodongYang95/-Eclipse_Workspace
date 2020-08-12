
public class Loop1 {
	public static void main(String[] args) {
		makeTable();
	}
	public static void makeTable() {
		int i = 1;
		int j = 3;
		int max = 5;
		do {
			int result = j * i;
			String output = j + "x" + i + "=" + result;
			System.out.println(output);
			i++;
		} while (i <= max);
		
	}
}
 