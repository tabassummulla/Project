package Testing;





import static org.junit.Assert.*;

import org.junit.Test;

import db.DatabaseConnection;

public class TestDatabaseConnection {

	
	@Test 
	public void testConnection() {
		
		DatabaseConnection testConn = new DatabaseConnection();
	
		assertNotNull("Connected to the database",testConn);
	
	}


	}

	
