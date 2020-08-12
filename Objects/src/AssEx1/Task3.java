package AssEx1;

public class Task3 {
	public static void main(String[] args) {
		System.out.println(check(1));
		System.out.println(check(6));
		System.out.println(check(12));
	}
	public static boolean check (int m) {
		if (m > 5 && m < 10) {
			return true;
		}else {
			return false;
		}
		
	}
}
