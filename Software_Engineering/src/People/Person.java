package People;

import java.io.PrintStream;

public class Person implements Cloneable{ 
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
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	@Override
	protected  Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		Date d = ((Person)object).getDateOfBirth();
//		((Person)object).setDateOfBirth(d);
		return object;
	}



}
