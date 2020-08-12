package com.guodongyang;

public class Main {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		MyCom myCom = new MyCom();
		
		myCom.set_name("Gordon");
		invoker.register(myCom);
		invoker.run();
	}
}
