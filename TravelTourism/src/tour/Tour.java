package tour;

import address.Address;

public class Tour extends Address{

		private int tourID;					
		private String tourName;
		private String description;

		
		

	public Tour(int tourID, String postcode, int houseNo, String tourName,
				String description, String streetName, String city, String county, String country) {
		
		super(postcode, houseNo, streetName, city, county, country);
	
		this.tourID = tourID;
		this.tourName = tourName;
		this.description = description;

	}		
	
	public void setTourID(int tourID) {
		this.tourID = tourID;
		
	}
	
	public int getTourID() {
		return tourID;
	}
	
	
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	
	public String getTourName() {
		return tourName;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	} 
	
	
	
	
	
}
	
	
	
	
