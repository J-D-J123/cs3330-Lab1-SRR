package edu.mizzou.cs3330.group1.srr;

public class Reservation {
  private int id;
	private Room room;
	private String studentName;
	private TimeSlot timeSlot;
	private boolean canceled = false;
	private boolean checkedIn = false;
	
	public Reservation(int id1, Room room1, String studentName1, TimeSlot time) {
		if(id1 <= 0) {
			throw new IllegalArgumentException("Id must be greater than 0");
		}
		id = id1;
		
		if(room1 == null) {
			throw new IllegalArgumentException("Need a room or I can't help you");
		}
		room = room1;
		
		if(studentName1 == null || studentName1.isBlank()) {
			throw new IllegalArgumentException("There needs to be a name");
		}
		studentName = studentName1;
		
		if(time == null) {
			throw new IllegalArgumentException("There needs to be a time slot");
		}
		timeSlot = time;
	}
	
	public void cancel() {
		if(checkedIn == true) { //you can't cancel if you've already checked in
			throw new IllegalArgumentException("Cannot cancel after checking in");
		}
		if(canceled == true) {
			throw new IllegalArgumentException("It's already canceled");
		}
		canceled = true;
	}
	
	public void checkIn() {
		if(canceled == true) { //you can't check in if your reservation is canceled
			throw new IllegalArgumentException("This reservation was canceled");
		}
		if(checkedIn == true) {
			throw new IllegalArgumentException("The reservation has already been checked in");
		}
		checkedIn = true;
	}
	
	public String getStatus() { //this is just to help with the output for the toString
		if(checkedIn == true) {
			return "Checked in";
		}
		else if (canceled == true) {
			return "Canceled";
		}
		return "Pending Status";
	}
	
	@Override
	public String toString() {
		return ("ID: " + id + ", Student: " + studentName + ", Room: " + room.toString() + ", Time Slot: " + timeSlot.toString() + ", Status: " + getStatus());
	}
}

