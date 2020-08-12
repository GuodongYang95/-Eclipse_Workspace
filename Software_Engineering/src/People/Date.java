package People;

import java.io.PrintStream;

public class Date implements Cloneable{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void print(PrintStream ps) {
		ps.print(String.format("%02d/%02d/%4d", day, month, year));
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public int diffInYears(Date date) {
		return this.year - date.year;
	}
	
	@Override
	protected  Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
