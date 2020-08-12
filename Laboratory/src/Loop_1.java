import java.util.Scanner;

public class Loop_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pleas enter a number and the final number of this table: ");
		
		int numEntry = s.nextInt();
		
		int max = s.nextInt();
		
//		String result = table (numEntry, max);
		
//		System.out.println(result);
		table(numEntry, max);
			
		
}

	public static void table (int n , int max) {
		
//		String totaloutput = "";
		int startNumber = 1;
		do {
			
			int result = n * startNumber;
			String output = n + "x" + startNumber + "=" +result + "\n";
//			totaloutput += output;
			
		 startNumber++;
		 System.out.print(output);
	
		} while (startNumber <= max);
		
//	return totaloutput;
		
	}
}

