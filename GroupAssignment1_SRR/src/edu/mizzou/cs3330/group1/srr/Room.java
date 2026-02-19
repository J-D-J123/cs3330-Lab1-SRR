package edu.mizzou.cs3330.group1.srr;

public class Room {
	
	private String roomName;
	private int capacity;
	
	// Constructs a Room with a name and positive capacity, throws exception if invalid
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

	// Returns the name of the room
	public String getRoomName() {
		return roomName;
	}

	// Returns the capacity of the room
	public int getCapacity() {
		return capacity;
	}
	
	// Returns a readable description of the room, e.g. "Room 101 (cap 4)"
	@Override
	public String toString() {
		return (roomName + " (cap " + capacity + ")");
	}
}

