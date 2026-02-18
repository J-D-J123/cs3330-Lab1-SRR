package edu.mizzou.cs3330.group1.srr;


/**
 * File:		ReservationBook.java
 * Date:		02/18/2026
 * Desc:		This class stores reservations and OWNS them. 
 * 				It should NOT coordinate the whole application, it 
 * 				should manage reservation storage and basic queries.
 */

public class ReservationBook {

	private Reservation[] 	reservations; 
	private int 				count; 
	
	// Constructor creates an empty book with a fixed maximum capacity > 0 
	public ReservationBook(int maximumCapacity) {
		
		// if maxCapacity is <= 0 do not make 
		if(maximumCapacity <= 0) {
			
			// print err in system 
			System.err.println("Unable to create Reservation Book with size" + 
					maximumCapacity);
			
			return; 
		}
		
		// make the empty book aka empty array of reservations 
	}
	
	// add(Reservation r) adds if space exists otherwise throws an exception 
	public void add(Reservation r) {
		
		// add Reservation r to the reservations array
		// if not throw an error 
	}
	
	// findById(int id) returns the matching reservation or null if not found 
	public Reservation findById(int id) {
		
		// just searches for Reservation r with r.id
		
		
		return null; 
	}
	
	// printAll() prints all stored reservations (one per line) -> system.out.print
	
	// printForRoom(Room room) prints reservations for that room 
}
