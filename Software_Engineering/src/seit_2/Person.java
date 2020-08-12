package seit_2;

import java.io.PrintStream;

public class Person{
	private String name;
	private Date dateOfBirth;

	
	public Person(String n, Date b) {
		this.dateOfBirth = b;
		this.name = n;
	}
	
	public void print(PrintStream ps) {
		ps.print(String.format("%s: born on %02d/%02d/%4d", name, dateOfBirth.getDay(), dateOfBirth.getMonth(), dateOfBirth.getYear()));
	}
	
	public String getName() {
		return name;
	}
		
	public int getAge(Date currentDate) {
		
		return currentDate.diffInYears(dateOfBirth);
	}
}
