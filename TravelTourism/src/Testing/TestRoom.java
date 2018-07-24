package Testing;

	
	import static org.junit.Assert.*;
	import org.junit.Test;
	import hotel.Room;
	
	public class TestRoom {
	
		
		Room room = new Room("Del1293", 191, "DXDB12", "Deluxe Room", "Double bed....");
		
	@Test
	
	public void testSetRoomID() {
		
		
		
		room.setRoomID("Pr091");
		assertEquals("Pr091", room.getRoomID());

	}
		
	@Test
	
	public void testSetRoomNo() {
		
		
		
		room.setRoomNo(20);
		assertEquals(20, room.getRoomNo());

	}	
		
		
}
