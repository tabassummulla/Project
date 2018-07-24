package hotel;

public class Room extends RoomType {

	private String roomID;
	private int roomNo;
	
	
	
	public Room(String roomID, int roomNo, String roomTypeID, String roomType, String roomDescription) {
		super(roomTypeID, roomType, roomDescription);
		this.roomID = roomID;
		this.roomNo = roomNo;
	}



	public String getRoomID() {
		return roomID;
	}



	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}



	public int getRoomNo() {
		return roomNo;
	}



	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	
	
	
	
	
	
	
}
