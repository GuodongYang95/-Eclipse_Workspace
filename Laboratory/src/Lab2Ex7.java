
public class Lab2Ex7 {
	public static void main(String[] args) {
		double a = 3.0;
		double b = 4.0;
		double c = sideLength(a,b);
		
		System.out.println(c);
		
//		a = 6;
//		b = 8;
//		c = sideLength(a,b);
		System.out.println(sideLength(6, 8));
	}
	
	public static double sideLength(double a,double b) {
		
		double sl = Math.pow(a,2) + Math.pow(b,2);
		
		return Math.sqrt(sl);
	
	}
	
	
}
