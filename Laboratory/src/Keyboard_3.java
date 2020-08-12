import java.util.Scanner;

public class Keyboard_3 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter your name, followed by the return key.");
		
		String userEntry = Keyboard.nextLine();
		
		System.out.println("Hello  " + userEntry);
		
		System.out.println("Please enter your age: ");
		int userage = Keyboard.nextInt();
		
		Keyboard.nextLine();
		System.out.println("Your are " + userage + " years old");
		

	}

}
