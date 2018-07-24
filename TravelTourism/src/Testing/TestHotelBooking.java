package Testing;


	import static org.junit.Assert.*;

import org.junit.Test;

import booking.HotelBooking;
	
	public class TestHotelBooking {

	
		HotelBooking hotelBooking = new HotelBooking("VGSDFY83", 2, 4, 1, "9/12/2018", "15/09/2018", 1354, 
				"Holiday Inn",4, "LHZ 241", 5, "Waterloo Road","London", "East Ham", "United Kingdom");
	@Test
	
	public void testSetHotelReservationID() {
		
	
		hotelBooking.setHotelReservationID("GYDFHIOW");
		assertEquals("GYDFHIOW", hotelBooking.getHotelReservationID());

	}
		
		
	@Test
	
	public void testSetNoOfRooms() {
		
	
		hotelBooking.setNoOfRooms(3);
		assertEquals(3, hotelBooking.getNoOfRooms());

	}
	
	@Test
	
	public void testSetNoOfAdults() {
		
	
		hotelBooking.setNoOfAdults(3);
		assertEquals(3, hotelBooking.getNoOfAdults());

	}
			
		
	@Test
	
	public void testSetNoOChild() {
		
	
		hotelBooking.setNoOfChild(0);
		assertEquals(0, hotelBooking.getNoOfChild());

	}
	
@Test
	
	public void testSetCheckIn() {
	
	
		hotelBooking.setCheckIn("1/06/2018");
		assertEquals("1/06/2018", hotelBooking.getCheckIn());

	}


	@Test
	
	public void testSetCheckOut() {
		
	hotelBooking.setCheckOut("8/06/2018");
		assertEquals("8/06/2018", hotelBooking.getCheckOut());
	
	}

	
	
	@Test 
	public void testCalculatePrice() {
		
		hotelBooking.calculatePrice();

	
	}

	
	@Test
	public void testMakeBooking() {
		
		hotelBooking.makeBooking();
		
		
	}

	@Test
	public void testMakePayment() {
		
		hotelBooking.makePayment();
		
	}

	@Test
	public void testConfirmBooking() {

	
		hotelBooking.confirmBooking();
	
	
	}
	}
		
		
		


