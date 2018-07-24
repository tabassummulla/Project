package Testing;

	
	import static org.junit.Assert.*;
	import org.junit.Test;
	
	import hotel.Hotel;

	public class TestHotel {
		
	Hotel hotel = new Hotel(386, "Marriot", 5, "ZXY HNX", 1,"Happy Street",
								"New York", "Manhattan", "United States Of America");
	@Test
	
	public void TestSetHotelID() {
		
	
		
		hotel.setHotelID(112);
		assertEquals(112,hotel.getHotelID());
		
	}
	
@Test
	
	public void TestSetHotelName() {
		
	
		
	hotel.setHotelName("JW Marriot");
		assertEquals("JW Marriot",hotel.getHotelName());
		
	}
	

@Test

public void TestSetHotelRating() {
	
	
	hotel.setHotelRating(4);
	assertEquals(4,hotel.getHotelRating());
	
}



	
	
}
