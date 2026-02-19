package edu.mizzou.cs3330.group1.srr;

/**
 * File:		ReservationBook.java
 * Date:		02/18/2026
 * Desc:		This class stores reservations and OWNS them. 
 * 				It should NOT coordinate the whole application, it 
 * 				should manage reservation storage and basic queries.
 */
public class ReservationBook {

	private Reservation[] 		reservations; 
	private int 				count; 
	
	// Constructor creates an empty book with a fixed maximum capacity > 0 
	/**
	 * ReservationBook constructor creates an empty ReservationBook with a fixed 
	 * maximum capacity that is greater than 0 at all times 
	 * @param maximumCapacity the maximum amount of Reservation in reservations 
	 */
	public ReservationBook(int maximumCapacity) {
		
		// if maxCapacity is > 0 make the reservations array
		if(maximumCapacity > 0) {
			
			reservations = new Reservation[maximumCapacity]; 
			count        = 0; 
			
		} else {
			
			// throw illegal argument exception 
			throw new IllegalArgumentException("err: ReservationBook: maximumCapacity must be positive");
		}
	}
	
	// add(Reservation r) adds if space exists otherwise throws an exception 
	/**
	 * Adds a Reservation to the Reservations array 
	 * will not add r if it is null 
	 * @param r is the Reservation that will be added to the Reservations
	 */
	public void add(Reservation r) {

		if(r == null) {
			
			throw new IllegalArgumentException("err: add: @param r must not be null");
		}
		
		// add reservation to the Reservations array & incurment count
		reservations[count] = r; 
		count++; 
	}
	
	// findById(int id) returns the matching reservation or null if not found 
	/** 
	 * 
	 * @param id is Reservation id
	 * @return
	 */
	public Reservation findById(int id) {
		
		// just searches for Reservation r with r.id
		for(int i = 0; i < count; i++) {
			
			if(Reservations[i].getId)
		}
		
		
		return null; 
	}
	
	// printAll() prints all stored reservations (one per line) -> system.out.print
	
	// printForRoom(Room room) prints reservations for that room 
}
