package com.guodong;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		double[] random = new double[10];
		Random r = new Random();
		
		for (int i = 0; i < random.length; i++) {
			double d = r.nextDouble(); // next.Double() means d is between 0.0 and 1.0;
			random[i] = d;
		}
//		for(int i =0; i<random.length; i++) {
//			System.out.println(random[i]);
//		}
		
		System.out.println(ComputeAverage(random));
		
//		System.out.println(d);
	
	}
	
	public static double ComputeAverage(double[] a){
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
	
		return sum / a.length;
	}
	
}
