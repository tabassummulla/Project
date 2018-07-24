package address;

public class Address {

	protected String postcode;
	protected int houseNo;
	protected String streetName;
	protected String city;
	protected String county;
	protected String country;
	
	public Address(String postcode, int houseNo, String streetName, String city, String county, String country) {
		
		this.postcode = postcode;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.county = county;
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	


}
