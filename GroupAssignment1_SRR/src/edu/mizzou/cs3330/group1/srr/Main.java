package edu.mizzou.cs3330.group1.srr;

public class Main {

	public static void main(String[] args) {

		// Create 2 rooms
		Room room101 = new Room("Room 101", 4);
		Room room202 = new Room("Room 202", 6);

		// Create the reservation manager with capacity for 10 reservations
		ReservationManager manager = new ReservationManager(10);

		// Create 5 reservations across different rooms and time slots
		int id1 = manager.createReservation(room101, "Alice Johnson", new TimeSlot(9));
		int id2 = manager.createReservation(room101, "Bob Smith", new TimeSlot(10));
		int id3 = manager.createReservation(room202, "Carol Davis", new TimeSlot(13));
		int id4 = manager.createReservation(room202, "Dan Lee", new TimeSlot(14));
		int id5 = manager.createReservation(room101, "Eve Martin", new TimeSlot(15));

		// Cancel reservation 2 (Bob Smith)
		manager.cancelReservation(id2);

		// Check in reservation 3 (Carol Davis)
		manager.checkInReservation(id3);

		// Print all reservations
		System.out.println("All Reservations");
		manager.printAllReservations();

		// Print reservations for Room 101 only
		System.out.println();
		System.out.println("Reservations for " + room101);
		manager.printReservationsForRoom(room101);
	}
}
