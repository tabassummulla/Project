	package customer;
	import java.util.Date;
	
	
	public class Customer {

				private String emailAddress;
				private String password;
				private String firstName;
				private String lastName;
				private String dateOfBirth;
				private String mobileNo;
		
	public Customer(String emailAddress, String password, String firstName, String lastName,
				String dateOfBirth,String mobileNo ) {
		
				this.emailAddress = emailAddress;
				this.password = password;
				this.firstName = firstName;
				this.lastName = lastName;
				this.dateOfBirth = dateOfBirth;	
				this.mobileNo = mobileNo;
		}	

	public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
	}	
		
	public String getEmailAddress() {
		
			return emailAddress;
	}
		
	public void setPassword(String password) {
			this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		 this.lastName = lastName;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	}


