//package edu.mizzou.cs3330.group1.srr;

/**
 * File: 	main.java
 * Date:	02/19/2026
 * Desc:	Test the creation of Reservation and Room
 * 				Create at least 2 rooms 
 * 				Create at least 5 reservations across different rooms and time slots
 * 				Cancel at least 1 reservation
 * 				Check in at least 1 reservation
 * 				Print all reservations
 * 				Print reservations for one specific room
 */

public class Main {

	public static void main(String[] args) {
		
		

		// Create at least 2 rooms
		Room room101 = new Room("Room 101", 4);
		Room room202 = new Room("Room 202", 6);
		Room room303 = new Room("Room 303", 10); 
//		Room roomIllegal = new Room("Illegal 101", -400); // illegal Room params (works)

		// Create the reservation manager with capacity for 10 reservations
		ReservationManager manager = new ReservationManager(10);

		// Create 5 reservations across different rooms and time slots
		int id1 = manager.createReservation(room101, "Jack Belleville", new TimeSlot(9));
		int id2 = manager.createReservation(room101, "Joey Johnson", new TimeSlot(10));
		int id3 = manager.createReservation(room202, "Tucker Potts", new TimeSlot(13));
		int id4 = manager.createReservation(room202, "John Cena", new TimeSlot(14));
		int id5 = manager.createReservation(room101, "John Smith", new TimeSlot(15));
		int id6 = manager.createReservation(room303, "Abe Lincolin", new TimeSlot(12));
		
		// illegal test cases 
//		int id6 = manager.createReservation(room101, "", null); (also works)
//		int id7 = manager.createReservation(room101, "", new TimeSlot(-50)); (also works too)

		// Cancel reservation 2 (Bob Smith)
		manager.cancelReservation(id2);

		// Check in reservation 3 (Carol Davis)
		manager.checkInReservation(id3);
		
		// check in Abe Lincolin 
		manager.checkInReservation(id6);

		// Print all reservations
		System.out.println("All Reservations");
		manager.printAllReservations();

		// Print reservations for Room 101 only
		System.out.println();
		System.out.println("Reservations for " + room101);
		manager.printReservationsForRoom(room101);
	}
}
