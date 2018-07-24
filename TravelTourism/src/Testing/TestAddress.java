package Testing;

import address.Address;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddress {

	Address address= new Address("BD7 1QG", 135, "Swan Lane", "Bradford", "West Yorkshire", "United Kingdom");
	
 @Test
 
 
 public void testSetPostcode() {
	 	
	 address.setPostcode("BD7 1SA");
	 assertEquals("BD7 1SA",address.getPostcode());
	
 }
 
 @Test
 
 
 public void testSetHouseNo() {
	 	
	 address.setHouseNo(8);
	 assertEquals(8,address.getHouseNo());
	
 }
 
 @Test
 
 
 public void testSetStreetName() {
	 	
	 address.setStreetName("Longside Lane");
	 assertEquals("Longside Lane",address.getStreetName());
	
 }
 
 @Test
 
 
 public void testSetCity() {
	 	
	 address.setCity("Manchester");
	 assertEquals("Manchester",address.getCity());
	
 }
 @Test
 
 
 public void testSetCounty() {
	 	
	 address.setCounty("Greater Manchester");
	 assertEquals("Greater Manchester",address.getCounty());
	
 }
 
 
 
 @Test
 
 
 public void testSetCountry() {
	 	
	 address.setCountry("UK");
	 assertEquals("UK",address.getCountry());
	
 }
 
}
