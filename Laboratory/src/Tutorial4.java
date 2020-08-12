
public class Tutorial4 {
	public static void main(String[] args) {
		answer("Agnes");
		String str = validate();
		System.out.print(str);

	}
	public static String validate() {
		return " Request validated";
	}
	
	public static void answer(String name) {
		System.out.print("\n" + name + "has submitted a request:");
	
//		System.out.println(validate());
		
	}
}
	
