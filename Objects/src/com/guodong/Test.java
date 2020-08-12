package com.guodong;

public class Test {
	public static void main(String[] args) {
		Person personOne = new Person("Gordon", 37, "male");
		Car customerOne = new Car("BMW", "Ken", 50000);
		
		personOne.eating();
		
		customerOne.list();
		
		System.out.println(personOne.name);
		
		customerOne.setBrand("Audi");
		customerOne.list();
		

		System.out.println(customerOne.getBrand());
		
	
		System.out.println(MyMath.adding(3,4));
	}
}
