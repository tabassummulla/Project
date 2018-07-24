package Testing;

	import static org.junit.Assert.*;
	import org.junit.Test;
	import hotel.RoomType;

	public class TestRoomType {
	
		RoomType roomType = new RoomType("Pres12dJ", "Presedential Suite", "About Presedential Suite..." );
		@Test
		
		public void testSetRoomTypeID() { 
			
		
			
			roomType.setRoomTypeID("Sin1209");
		assertEquals("Sin1209",  roomType.getRoomTypeID());
			
			
		}
		
		@Test
		
		public void testSetRoomType() { 
			

			
		 roomType.setRoomType("Single");
		assertEquals("Single",  roomType.getRoomType());
			
			
		}	
		
		
		@Test
		
		public void testSetRoomDescription() { 
			
	
			
			 roomType.setRoomDescription("Add more information here");
		assertEquals("Add more information here",  roomType.getRoomDescription());
			
			
		}	
		
		
}
