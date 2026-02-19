package edu.mizzou.cs3330.group1.srr;

public class TimeSlot {
  private int hour;
	
	public TimeSlot(int time) {
		if(time < 0 || time > 23) {
			throw new IllegalArgumentException("Not acceptable time range");
		}
		hour = time;
	}

	public int getHour() {
		return hour;
	}
	
	public String toString() {
		return (hour + ":00"+ "-" + (hour + 1) + ":00");
	}
}

