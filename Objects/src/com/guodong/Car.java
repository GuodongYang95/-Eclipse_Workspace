package com.guodong;

public class Car {
	private String brand;
	private String customerName;
	private int cost;
	
	public Car(String brand, String customerName, int cost) {
		this.brand = brand;
		this.customerName = customerName;
		this.cost = cost;
	}
	
	public void list() {
		System.out.println(customerName + " spent " + cost + " on buying a " + brand + " car.");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
//	public void setBrand(String brand) {
//		this.brand = brand;
//	
//	}
//	
//	public String getBrand() {
//		
//		return brand;
//		
//	}
	
	
	
}
