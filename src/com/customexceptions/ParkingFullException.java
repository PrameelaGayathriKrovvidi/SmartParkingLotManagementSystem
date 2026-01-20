package com.customexceptions;

public class ParkingFullException extends Exception{
	public ParkingFullException(String message) {
		super(message);
	}

}
