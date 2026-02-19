/**
 * File:		ReservationManager.java
 * Date:		02/18/2026
 * Desc:		This file creates the ReservationManager class
 * 				which creates, cancels, prints, and checks in reservations.
 * 				It should not own more than it needs to.
 */
package edu.mizzou.cs3330.group1.srr;

public class ReservationManager {

	private ReservationBook book;
	private int nextId;

	/**
	 * ReservationManager() constructs a ReservationManager with a ReservationBook of the given capacity.
	 * @param maxReservations the maximum amount of Reservation
	 */
	public ReservationManager(int maxReservations) {
		if (maxReservations <= 0) {
			throw new IllegalArgumentException("Max reservations must be positive");
		}
		book = new ReservationBook(maxReservations);
		nextId = 1;
	}

	/**
	 * createReservation(...) Creates a new reservation with an auto-generated ID and adds it to the book.
	 * @param room is the Room for that Reservation
	 * @param studentName is the student who made the Reservation
	 * @param slot is the time of the Reservation
	 * @return the id of the Reservation
	 */
	public int createReservation(Room room, String studentName, TimeSlot slot) {
		int id = nextId;
		nextId++;
		Reservation reservation = new Reservation(id, room, studentName, slot);
		book.add(reservation);
		return id;
	}

	/**
	 * cancelReservation(int id) cancels the reservation with the given ID.
	 * @param id is the Reservation id
	 */
	public boolean cancelReservation(int id) {
		Reservation reservation = book.findById(id);
		if (reservation == null) {
			throw new IllegalArgumentException("No reservation found with ID: " + id);
		}
		reservation.cancel();
		return true;
	}

	/**
	 * checkInReservation(int id) checks in the reservation with the given ID.
	 * @param id is the Reservation id
	 */
	public boolean checkInReservation(int id) {
		Reservation reservation = book.findById(id);
		if (reservation == null) {
			throw new IllegalArgumentException("No reservation found with ID: " + id);
		}
		reservation.checkIn();
		return true;
	}

	/**
	 * printAllReservations() prints all reservations stored in the book.
	 */
	public void printAllReservations() {
		book.printAll();
	}

	/**
	 * printReservationsForRoom(Room room) prints all reservations for a specific room
	 * @param room
	 */
	public void printReservationsForRoom(Room room) {
		book.printForRoom(room);
	}
}
