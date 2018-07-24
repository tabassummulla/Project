package Testing;

	import static org.junit.Assert.*;
	import org.junit.Test;

import tour.Tour;
	
	public class TestTour {

		Tour tour = new Tour(111, "MYX 506", 22, "City Tour Manchester", "insert tour description",
				"Salford Quays", "Manchester", "Lancashire", "United-Kingdom");	
	
@Test
	
 public void testSetTourID() {
			
		
	tour.setTourID(1234);	
		assertEquals(1234, tour.getTourID());
		}


@Test

public void testSetTourName() {
			
	
	tour.setTourName("City Highlights");	
		assertEquals("City Highlights", tour.getTourName());
		}
		
@Test
public void testSetTourDescription() {
	
	
	tour.setDescription("The tour begins with a canal boat ride across the river");	
	assertEquals("The tour begins with a canal boat ride across the river",tour.getDescription());
	}	


}

	
	
	
	
	