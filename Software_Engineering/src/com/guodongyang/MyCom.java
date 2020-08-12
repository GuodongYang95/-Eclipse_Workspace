package com.guodongyang;

public class MyCom implements Command{
	
	String name;
	int i;
	
	public void set_name(String name) {
		this.name = name;
		execute(i);
		
	}
	
	@Override
	public void execute(int i) {
		
		System.out.println(name + i);
	}
}
