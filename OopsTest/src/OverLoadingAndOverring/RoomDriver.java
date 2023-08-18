package OverLoadingAndOverring;

import java.util.Date;

public class RoomDriver {
	
	public static void main(String[] args) {
		Room room;
		
		if(Room.isAvailable()) {
			room = new Room(111,2000);
			
			System.out.println(room);
			
			room.reservation();
			room.reservation(new Date(), new Date());
		}
		
		else
			System.out.println("hotel is full");
	}

}
