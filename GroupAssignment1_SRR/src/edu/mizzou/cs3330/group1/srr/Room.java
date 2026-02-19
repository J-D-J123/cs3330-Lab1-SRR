package edu.mizzou.cs3330.group1.srr;

public class Room {
	
	private String roomName;
	private int capacity;
	
	/**
	 * Room() constructs a Room with a name and positive capacity, throws exception if invalid
	 * @param roomNum a String to represent the number of the room
	 * @param maxPeople an integer that represents the maximum amount of people in that Room
	 */
	public Room(String roomNum, int maxPeople) {
		if(maxPeople <= 0) {
			throw new IllegalArgumentException("Needs to be at least one person");
		}

		if(roomNum == null || roomNum.isBlank()) {
			throw new IllegalArgumentException("Needs to be a room number");
		}
		
		this.capacity = maxPeople;
		this.roomName = roomNum;
	}

	/**
	 * getRoomName() returns the name of the room
	 * @return a String aka roomName; 
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * getCapacity() returns the capacity of the room
	 * @return an integer 
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * toString() returns a readable description of the room, e.g. "Room 101 (cap 4)
	 */
	@Override
	public String toString() {
		return (roomName + " (cap " + capacity + ")");
	}
}

