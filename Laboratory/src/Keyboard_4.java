import java.util.Scanner;

public class Keyboard_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your name and your age :");
		
//		s.nextLine();
		
		String username = s.next();
		int userage = s.nextInt();
		
		System.out.println("Hello  " + username + "\n" + userage + "  is not too old.");
	}
}
