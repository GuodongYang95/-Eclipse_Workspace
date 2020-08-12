package com.guodongyang;

import javax.swing.JOptionPane;

public class Invoker {
	Command c;
	
	public void register(Command command) {
		this.c = command;
	}
	
	public void run() {
		while(true) {
		String input = JOptionPane.showInputDialog("Please input a number");
		char firstChar = input.charAt(0);
		if (firstChar == 'q') {
			break;
		}
			Command c = new Command() {
				@Override
				public void execute(int i) {
					System.out.println(i);
				}
			};
			c.execute(firstChar);
		}
	}
}
