package edu.mizzou.cs3330.group1.srr;

public class ReservationManager {

	private ReservationBook book;
	private int nextId;

	
//	Constructs a ReservationManager with a ReservationBook of the given capacity.
	public ReservationManager(int maxReservations) {
		if (maxReservations <= 0) {
			throw new IllegalArgumentException("Max reservations must be positive");
		}
		book = new ReservationBook(maxReservations);
		nextId = 1;
	}


//	Creates a new reservation with an auto-generated ID and adds it to the book.
	public int createReservation(Room room, String studentName, TimeSlot slot) {
		int id = nextId;
		nextId++;
		Reservation reservation = new Reservation(id, room, studentName, slot);
		book.add(reservation);
		return id;
	}

//	Cancels the reservation with the given ID.
	public void cancelReservation(int id) {
		Reservation reservation = book.findById(id);
		if (reservation == null) {
			throw new IllegalArgumentException("No reservation found with ID: " + id);
		}
		reservation.cancel();
	}

//	Checks in the reservation with the given ID.
	public void checkInReservation(int id) {
		Reservation reservation = book.findById(id);
		if (reservation == null) {
			throw new IllegalArgumentException("No reservation found with ID: " + id);
		}
		reservation.checkIn();
	}

	
//	Prints all reservations stored in the book.
	public void printAllReservations() {
		book.printAll();
	}

//	Prints all reservations for a specific room.
	public void printReservationsForRoom(Room room) {
		book.printForRoom(room);
	}
}
