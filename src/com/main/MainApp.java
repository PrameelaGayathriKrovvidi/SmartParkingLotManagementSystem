package com.main;
import com.entities.*;

import java.util.Scanner;

import com.Service.ParkingService;
import com.customexceptions.InvalidVehicleException;
import com.customexceptions.ParkingFullException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of Slots: ");
		int totalSlots = sc.nextInt();
		ParkingService service = new ParkingService(totalSlots);
		
		while(true) {
			System.out.println("1. Park A Vehicle:");
			System.out.println("2. Unpark A Vehicle: ");
			System.out.println("3. Show Available slots: ");
			System.out.println("4. Show Parked vehicles:");
			System.out.println("5. Exit.");
			int choice = sc.nextInt();
		try {
			switch(choice) {
				case 1: System.out.println("Park A Vehicle: ");
					System.out.println("Enter vehicle No: ");
					int vehicleNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter vehical type: ");
					String type = sc.nextLine();
					
					service.parkAVehicle(new Vehicle(vehicleNo, type));
					
				break;
				case 2: 
					System.out.println("Unpark A vehicle: ");
					System.out.println("Enter vehicle number to unpark: ");
					int unparkVehicleNum = sc.nextInt();
					service.unparkAVehicle(unparkVehicleNum);
				break;
				case 3:
					System.out.println("Show Available Slots: ");
					service.showAvailableSlots();
				break;
				case 4:
					System.out.println("Show parked vehicles: ");
					service.showParkedVehicles();
				break;
				case 5:
					System.out.println("Closing the application: ");
					System.exit(0);
				break;
				default:
					System.out.println("Invalid Choice!");
			
			}
		} catch(ParkingFullException e) {
			System.out.println("Error: " + e.getMessage());
		} catch(InvalidVehicleException e) {
			System.out.println("Error: " + e.getMessage());
		} catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		 
	}

	}
}
