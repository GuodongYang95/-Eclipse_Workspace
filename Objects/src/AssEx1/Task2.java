package AssEx1;

public class Task2 {
	public static void main(String[] args) {
		int m = 7;
	    int max = 100;
	    multiples(m,max); 
	}  	
	public static void multiples(int m, int max) {
		for (int i = 1; i * m < max; i++) {
			System.out.println(i * m);
		}
	}
}
