//package edu.mizzou.cs3330.group1.srr;

public class TimeSlot {
	
	private int hour;
	
	/**
	 * Constructs a TimeSlot with an hour between 0 and 23, throws exception if invalid
	 * @param time an int between 0 and 23 
	 */
	public TimeSlot(int time) {
		if((time < 0) || (time > 23)) {
			throw new IllegalArgumentException("Not acceptable time range");
		}
		hour = time;
	}

	/**
	 * getHour() returns the hour of this time slot
	 * @return the integer hour
	 */
	public int getHour() {
		return hour;
	}
	

	/**
	 * toString() returns a String showing the one-hour time slot, e.g. "13:00-14:00"
	 */
	public String toString() {
		return (hour + ":00"+ "-" + (hour + 1) + ":00");
	}
}

