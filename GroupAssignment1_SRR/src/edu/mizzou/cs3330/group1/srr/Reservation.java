package edu.mizzou.cs3330.group1.srr;

public class Reservation {
	
	private int id;
	private Room room;
	private String studentName;
	private TimeSlot timeSlot;
	private boolean canceled = false;
	private boolean checkedIn = false;
	
	/**
	 * Reservation(...) constructs a Reservation with a positive id, non-null room, non-blank student name, and non-null time slot
	 * @param id1 is the id of the Reservation 
	 * @param room1 is the room of the Reservation 
	 * @param studentName1 is the student's name of the Reservation 
	 * @param time is the time in integer format of the Reservation 
	 */
	public Reservation(int id1, Room room1, String studentName1, TimeSlot time) {
		
//		if(id1 <= 0) {
//			throw new IllegalArgumentException("Id must be greater than 0");
//		}
//		
//		if(room1 == null) {
//			throw new IllegalArgumentException("Need a room or I can't help you");
//		}
//		
//		if(studentName1 == null || studentName1.isBlank()) {
//			throw new IllegalArgumentException("There needs to be a name");
//		}
//		
//		if(time == null) {
//			throw new IllegalArgumentException("There needs to be a time slot");
//		}
		
		// simpler approach to make sure each value is there and required to make the Reservation object 
		if ((id1 > 0) && (room1 != null) && (studentName1 != null) && 
				(!studentName1.isBlank()) && (time != null)) {
			
			// now store the data
			studentName = studentName1;
			room = room1;
			id = id1;
			timeSlot = time;
			
		} else {
			
			throw new IllegalArgumentException("Err: Invalid reservation params");
		}
	}
	
	/**
	 * cancel() marks the reservation as canceled if it has not already been checked in or canceled
	 */
	public boolean cancel() {
		if(checkedIn == true) { //you can't cancel if you've already checked in
			throw new IllegalArgumentException("Cannot cancel after checking in");
		}
		if(canceled == true) {
			throw new IllegalArgumentException("It's already canceled");
		}
		canceled = true;
		return true;
	}
	
	/**
	 * checkIn() marks the reservation as checked in if it has not already been canceled or checked in
	 */
	public boolean checkIn() {
		if(canceled == true) { //you can't check in if your reservation is canceled
			throw new IllegalArgumentException("This reservation was canceled");
		}
		if(checkedIn == true) {
			throw new IllegalArgumentException("The reservation has already been checked in");
		}
		checkedIn = true;
		return true;
	}
	
	/**
	 * getStatus() returns the current status
	 * @return the status of the Reservation in a String: "Checked in", "Canceled", or "Pending Status"
	 */
	public String getStatus() {
		if(checkedIn == true) {
			return "Checked in";
		}
		else if (canceled == true) {
			return "Canceled";
		}
		return "Pending Status";
	}
	
	/**
	 * getById() grabs the id of the Reservation 
	 * @return the id of the Reservation 
	 */
	public int getById() {
		return id; 
	}
	
	/**
	 * getByRoom() returns the Room room
	 * @return room
	 */
	 public Room getByRoom() {
		return room; 
	}
	
	 /**
	  * toString() returns a readable summary of the reservation including id, student, room, time slot, and status
	  */
	@Override
	public String toString() {
		return ("ID: " + id + ", Student: " + studentName + ", Room: " + room.toString() + ", Time Slot: " + timeSlot.toString() + ", Status: " + getStatus());
	}
}

