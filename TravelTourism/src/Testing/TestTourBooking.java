package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import booking.TourBooking;

public class TestTourBooking {
	
	TourBooking tourBooking = new TourBooking("TDLSFOA", 2 , "2/09/2018", 133, "Lankhavi Tour", "Tour description here", 
			"MYA", 3, "Main Rd", "Kuala Lumpur", "Selangor","Malaysia");
	
	
	
	@Test
	
		public void testSetTourReservationID() {
			
		tourBooking.setTourReservationID("TMKL018");
		assertEquals("TMKL018", tourBooking.getTourReservationID());
	
		}
		
	@Test
	
		public void testSetNoOfTickets() {
		
		tourBooking.setNoOfTickets(4);
		assertEquals(4, tourBooking.getNoOfTickets());
	
	}


	@Test
	
	public void testSetTourDate() {
	
	tourBooking.setTourDate("15/08/2018");
	assertEquals("15/08/2018", tourBooking.getTourDate());
	
	}
}
