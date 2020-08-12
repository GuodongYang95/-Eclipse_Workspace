import java.util.Scanner;

public class Keyboardtese {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		int age = s.nextInt();
		System.out.println("Your age is " + age);
		
		System.out.println("Enter your name: ");

		s.nextLine();
		
		String name = s.nextLine();
		System.out.println("Your name is " + name + " How are you!");
		
		
		
		
	}
}
