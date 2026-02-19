package edu.mizzou.cs3330.group1.srr;

public class TimeSlot {
	
	private int hour;
	
	// Constructs a TimeSlot with an hour between 0 and 23, throws exception if invalid
	public TimeSlot(int time) {
		if((time < 0) || (time > 23)) {
			throw new IllegalArgumentException("Not acceptable time range");
		}
		hour = time;
	}

	// Returns the hour of this time slot
	public int getHour() {
		return hour;
	}
	
	// Returns a string showing the one-hour time slot, e.g. "13:00-14:00"
	public String toString() {
		return (hour + ":00"+ "-" + (hour + 1) + ":00");
	}
}

