package com.entities;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlot {

	private int slotNumber;
	private boolean isOccupied;
	private Vehicle vehicle;
	
	public ParkingSlot(int slotNumber) {
		this.slotNumber = slotNumber;
		this.isOccupied = false;
		this.vehicle = null;
	}
	
	public int getSlotNumber() {
		return slotNumber;
	}
	
	public boolean getOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied; 
	}


	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	
	@Override
	public String toString() {
		return "ParkingSlot [slotNumber=" + slotNumber + ", vehicle=" + vehicle + "]";
	}
	
	
}
