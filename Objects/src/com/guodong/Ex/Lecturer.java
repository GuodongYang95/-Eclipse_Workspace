package com.guodong.Ex;

public class Lecturer extends Person{
	private double salary;

	public Lecturer(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
