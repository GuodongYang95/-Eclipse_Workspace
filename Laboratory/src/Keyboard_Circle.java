import java.util.Scanner;

public class Keyboard_Circle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius ");
		
		double radius = keyboard.nextDouble();
		
		double result = calArea (radius);
		
		System.out.println("The area of the circle is " + result);
		
		
	}
	
	public static double calArea (double r) {
		double pi = 3.1415;
		return pi*Math.pow(r, 2);
		
	}
}
