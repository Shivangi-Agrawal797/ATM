package OverLoadingAndOverring;

import java.util.Date;

public class Room {

	private int roomnumber;
	private static int capacity = 0;
	private int pricePerNight;
	
	
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	
	
	public static int getCapacity() {
		return capacity;
	}
	public static void setCapacity(int capacity) {
		Room.capacity = capacity;
	}
	
	
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	public String toString() {
		return "roomnumber = " + roomnumber + "pricePerNight" + pricePerNight + "";
	}
	
	public Room(int roomnumber, int pricePerNight) {
		super();
		this.roomnumber = roomnumber;
		capacity = 1;
		this.pricePerNight = pricePerNight;
	}
	
	public void reservation() {
		System.out.println("room is booked without checkin and checkout dates");
	}
	
	public void reservation(Date checkIn , Date checkOut) {
		System.out.println("your room is done with checkin and checkout dates");
	}
	
	public static boolean isAvailable() {
		if(capacity>0)
			return true;
		else 
			return false;
	}
}
