package Testing;

import customer.Customer;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	Customer customer = new Customer("example@hotmail.com","password", "John", 
									"Brown", "08/06/1997", "075601356271");
	

	
	
	@Test
	public void testSetEmail() {
		
		customer.setEmailAddress("example@yahoo.com");
		assertEquals("example@yahoo.com", customer.getEmailAddress());

	}
	
	
	@Test
	public void testSetPassword() {
		
		customer.setPassword("Qwerty123");
		assertEquals("Qwerty123", customer.getPassword());

	}

	
	@Test
	public void testSetFirstName() {
		
		customer.setFirstName("Tabassum");
		assertEquals("Tabassum", customer.getFirstName());

	}
	
	
	@Test
	public void testSetLastName() {
		
		customer.setLastName("Mulla");
		assertEquals("Mulla", customer.getLastName());

	}

	@Test
	public void testSetDateOfBirth() {
		
		customer.setDateOfBirth("12/12/1996");
		assertEquals("12/12/1996", customer.getDateOfBirth());

	}
	
	
	@Test
	public void testSetMobileNo() {
		
		customer.setMobileNo("07396549371");
		assertEquals("07396549371", customer.getMobileNo());

	}
}




