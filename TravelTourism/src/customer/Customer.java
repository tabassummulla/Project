	package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DatabaseConnection;

public class Customer {

				private String emailAddress;
				private String password;
				private String firstName;
				private String lastName;
				private String dateOfBirth;
				private String mobileNo;
		
				

				
	public Customer() {
	}			
				
				
	public Customer(String emailAddress, String password, String firstName, String lastName,
				String dateOfBirth,String mobileNo ) {
		
				this.emailAddress = emailAddress;
				this.password = password;
				this.firstName = firstName;
				this.lastName = lastName;
				this.dateOfBirth = dateOfBirth;	
				this.mobileNo = mobileNo;
		}	

	
	
	
	public void newCustomer() {
		
		Connection db = null ;
		PreparedStatement register = null;
		
		String create = "INSERT INTO customer" 
		 + "(email_address, passw, first_name, last_name, dateOfBirth, mobileNo) VALUES" 
		 + "(?, ?, ?, ?, ?, ?)";
						
		String emailCheck = "SELECT * FROM customer WHERE email_address = ?";
						
	try {	
		db = DatabaseConnection.Connect();
		
		PreparedStatement chk = db.prepareStatement(emailCheck);
			
		chk.setString(1, emailAddress);
		Result 
		
	
		register = db.prepareStatement(create);
		
		register.setString(1, emailAddress);
		register.setString(2, password);
		register.setString(3, firstName);
		register.setString(4, lastName);
		register.setString(5, dateOfBirth);
		register.setString(6, mobileNo);
		register.executeUpdate();
	
		
	} catch (SQLException e) {
		
		System.out.println(e.getMessage());
		
	}
		
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


