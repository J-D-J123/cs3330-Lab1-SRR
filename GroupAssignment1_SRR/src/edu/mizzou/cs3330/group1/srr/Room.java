package edu.mizzou.cs3330.group1.srr;

public class Room {
  private String roomName;
	private int capacity;
	
	public Room(String roomNum, int maxPeople) {
		if(maxPeople <= 0) {
			throw new IllegalArgumentException("Needs to be at least one person");
		}
		this.capacity = maxPeople;
		
		if(roomNum == null || roomNum.isBlank()) {
			throw new IllegalArgumentException("Needs to be a room number");
		}
		this.roomName = roomNum;
	}

	public String getRoomName() {
		return roomName;
	}

	public int getCapacity() {
		return capacity;
	}
	
	@Override
	public String toString() {
		return (roomName + " (cap " + capacity + ")");
	}
}

