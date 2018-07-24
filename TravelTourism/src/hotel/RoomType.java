package hotel;

public class RoomType {

	protected String roomTypeID;
	protected String roomType;
	protected String roomDescription;

	
	public RoomType(String roomTypeID, String roomType, String roomDescription) {
			this.roomTypeID = roomTypeID;
			this.roomType = roomType;
			this.roomDescription = roomDescription;

	}
	
	public void setRoomTypeID(String roomTypeID) {
			this.roomTypeID = roomTypeID;
		
	}
	
	public String getRoomTypeID() {
		
			return roomTypeID;
	}
	
	public void setRoomType(String roomType) {
			this.roomType = roomType;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}
	
	public String getRoomDescription() {
		return roomDescription;
	}
}
