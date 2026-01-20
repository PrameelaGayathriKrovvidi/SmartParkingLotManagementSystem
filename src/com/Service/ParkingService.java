package com.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.customexceptions.InvalidVehicleException;
import com.customexceptions.ParkingFullException;
import com.entities.*;
public class ParkingService {
	
	
	
	private Map<Integer, Vehicle> vehicles = new HashMap<>();
	private List<ParkingSlot> slots = new ArrayList<>();
	
	public ParkingService(int totalSlots) {
		for(int i=1;i<=totalSlots;i++) {
			slots.add(new ParkingSlot(i));
		}
	}
	
	
	public void parkAVehicle(Vehicle vehicle) throws ParkingFullException {
		if(vehicles.containsKey(vehicle.getVehcileNumber())) {
			throw new IllegalArgumentException("Vehicle Already Parked!");
		}
		
		
		for(ParkingSlot slot:slots) {
			if(!slot.getOccupied()) {
				slot.setVehicle(vehicle);
				slot.setOccupied(true);
				vehicles.put(vehicle.getVehcileNumber(), vehicle);
				System.out.println("Vehicle parked at slot " + slot.getSlotNumber());
				return;
			} 
			
			
			}
		throw new ParkingFullException("Parking lot is full");

		
	}
	
	public void unparkAVehicle(int vehicleNo) throws InvalidVehicleException {
		
		if(!vehicles.containsKey(vehicleNo)) {
			throw new IllegalArgumentException("Vehicle not found");
		}
		
		Vehicle vehicle = vehicles.get(vehicleNo);
		for(ParkingSlot slot:slots) {
			if(slot.getOccupied() && slot.getVehicle().equals(vehicle)) {
				slot.setVehicle(null);
				slot.setOccupied(false);
				vehicles.remove(vehicleNo);
				System.out.println("Vehicle unparked from slot " + slot.getSlotNumber());
				return;
			}
		}
		
		throw new InvalidVehicleException("Invalid Vehicle");
	}
	
	public void showAvailableSlots() {
		for(ParkingSlot slot:slots) {
			if(!slot.getOccupied()) {
				System.out.println(slot);
			}
		}
	}
	
	
	public void showParkedVehicles() {
		
		for(ParkingSlot slot:slots) {
			if(slot.getOccupied()) {
				System.out.println("Slot " + slot.getSlotNumber() + " -> " + slot.getVehicle());
			} 	
		}
		
		
	}
	
	
	
	

}
