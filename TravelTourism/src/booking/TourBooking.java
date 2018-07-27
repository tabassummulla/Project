package booking;

import tour.Tour;

public class TourBooking extends Tour implements Booking {

	private String tourReservationID;
	private int noOfTickets;
	private String tourDate;
	
	public TourBooking(String tourReservationID, int noOfTickets, String tourDate, int tourID, String tourName, String description,
			String postcode, int houseNo, String streetName, String city, String county, String country) {
		super(tourID, tourName, houseNo, postcode, description, streetName, city, county, country);
		
		
		this.tourReservationID = tourReservationID;
		this.noOfTickets = noOfTickets;

	}

	
	
	public String getTourDate() {
		return tourDate;
	}



	public void setTourDate(String tourDate) {
		this.tourDate = tourDate;
	}



	public String getTourReservationID() {
		return tourReservationID;
	}

	public void setTourReservationID(String tourReservationID) {
		this.tourReservationID = tourReservationID;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}


	public void calculatePrice() {
	
		
	}


	public void makeBooking() {

		
	}

	
	public void makePayment() {
	
	}


	public void confirmBooking() {

		
	}

	
	
	
}
