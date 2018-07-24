package booking;

import java.util.Date;

import hotel.Hotel;

public class HotelBooking extends Hotel implements Booking{

	private String hotelReservationID;
	private int noOfRooms;
	private int noOfAdults;
	private int noOfChild;
	private String checkIn;
	private String checkOut;
	
	
	public HotelBooking(String hotelReservationID, int noOfRooms, int noOfAdults, int noOfChild, String checkIn, 
			String checkOut,int hotelID, String hotelName, int hotelRating, String postcode, int houseNo, 
			String streetName, String city, String county, String country) {
			
		super(hotelID, hotelName, hotelRating,  postcode,  houseNo, streetName,  city,county, country);
	
			this.hotelReservationID = hotelReservationID;
			this.noOfRooms = noOfRooms;
			this.noOfAdults = noOfAdults;
			this.noOfChild = noOfChild;
			this.checkIn = checkIn;
			this.checkOut = checkOut;
		
		
	}

	public String getHotelReservationID() {
		return hotelReservationID;
	}


	public void setHotelReservationID(String hotelReservationID) {
		this.hotelReservationID = hotelReservationID;
	}

	

	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public int getNoOfAdults() {
		return noOfAdults;
	}


	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}


	public int getNoOfChild() {
		return noOfChild;
	}


	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}


	public String getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}


	public String getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	@Override
	public void calculatePrice() {
		
	}

	@Override
	public void makeBooking() {
		
		
	}

	@Override
	public void makePayment() {
		
		
	}

	@Override
	public void confirmBooking() {

	}
	

}
