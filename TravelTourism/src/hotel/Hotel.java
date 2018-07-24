package hotel;

import address.Address;

public class Hotel extends Address {

	private int hotelID;
	private String hotelName;
	private int hotelRating;
	
	
	
	public Hotel(int hotelID, String hotelName, int hotelRating, String postcode, int houseNo, 
			String streetName, String city, String county, String country) {
		
		super(postcode, houseNo, streetName, city, county, country);
		
			this.hotelID = hotelID;
			this.postcode = postcode;
			this.houseNo = houseNo;
			this.hotelName= hotelName;
			this.hotelRating = hotelRating;
			
	}
	
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	
	public int getHotelID() {
		return hotelID;
	}
	
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}
	
	public int getHotelRating() {
		return hotelRating;
	}
}
