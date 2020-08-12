
public class Lab2Ex6 {
	public static void main(String[] args) {
		double r = 5.6;
		double area = compArea(r);
		double Cir = compCircumference(r);
		
		System.out.println(area);
		System.out.println(Cir);
		
		r = 1.2;
		area = compArea(r);
		Cir = compCircumference(r);
		
		System.out.println(area);
		System.out.println(Cir);

	}
	
	public static double compArea(double r) {
		
		double pi = 3.1415;
		double area = pi *r*r;
		
		return area;
	}
	
	public static double compCircumference(double r) {
		double pi = 3.1415;
		return 2*pi*r; 
	}
	
	
}
