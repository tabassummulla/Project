package db;

import java.sql.*;

public class DatabaseConnection {
	
	public static void main(String[] args) {
	 
	
	DatabaseQueries query = new DatabaseQueries();
		
	DatabaseConnection.Connect();
	
//	query.insertInto();
	
	query.Read("SELECT * FROM customer");
	
//	query.update();
	
//	query.delete();
}

	final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	final static String DB_URL = "jdbc:mysql://localhost/travel";

 	private final static String USER = "root";
	private final static String PASS = "password";
	
	public static Connection conn = null;


	public static Connection Connect() {
	
	   
	try { conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   if( conn != null) {
			   System.out.println("Connected to the database");
		   }
	   }
	   	catch(SQLException e){
	   		System.out.println("An error occured. Maybe username and password is invalid!");
	      e.printStackTrace();
	   }
	return conn;
		   }
	
}


	
	
	

	   	


