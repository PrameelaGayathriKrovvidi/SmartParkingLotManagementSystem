package com.entities;

public class Vehicle {
	private int vehicleNumber;
	private String type;
	
	
	
	public Vehicle(int vehicleNumber) {
		super();
		this.vehicleNumber = vehicleNumber;
	}

	public Vehicle(int vehicleNumber, String type) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
	}
	
	public int getVehcileNumber() {
		return vehicleNumber;
	}
	
	public String getType() {
		return type;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle Number: " + vehicleNumber + ", Type: " + type; 
	}

}
