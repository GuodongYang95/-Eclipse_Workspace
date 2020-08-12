package seit_1;

import java.io.PrintStream;

public class Person { // code owner
	private String name;
	private int dob_d, dob_m, dob_y; //date of birth

	
	public Person(String n, int d, int m, int y) {
		name = n;
		dob_d = d;
		dob_m = m;
		dob_y = y;
		
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public void print(PrintStream ps) {
		ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob_d, dob_m, dob_y));
	}
	
	
}
