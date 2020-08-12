package com.guodong;

public class pass_parameter {

	public static void main(String[] args) {
		double raduis = 4;
		System.out.println(circleArea(raduis));

	}

	public static double circleArea(double r) {
		double pi = 3.1415;

		return times(pi, r, r);

	}
	public static double times(double a, double b, double c) {

		return a * b * c;
	}

	
}
