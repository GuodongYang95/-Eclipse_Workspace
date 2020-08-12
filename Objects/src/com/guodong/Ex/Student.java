package com.guodong.Ex;

public class Student extends Person {

	private double GPA;
	
	public Student(String name, double GPA) {
		super(name);
		this.GPA = GPA;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	@Override
	public String toString() {
		return "Student" + name +"[GPA=" + GPA + "]";
	}
	
	
}
