package dbconnect;

import java.sql.*;

public class DatabaseConnection {
	
	public static void main(String[] args) {
	 
	
	DatabaseConnection.Connect();
	
	DatabaseConnection.insertInto();
	DatabaseConnection.read();
	
	
}


	
	

	static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static String DB_URL = "jdbc:mysql://localhost/travel";

	static String USER = "root";
	static String PASS = "password";
	
	static Connection conn = null;

	
	public DatabaseConnection(String JDBC_DRIVER, String DB_URL, String USER, String PASS) {
			
			this.JDBC_DRIVER = JDBC_DRIVER;
			this.DB_URL = DB_URL;
			this.USER = USER;
			this.PASS = PASS;
			
	}

	
	public static String getJDBC_DRIVER() {
		return JDBC_DRIVER;
	}


	public static void setJDBC_DRIVER(String JDBC_DRIVER) {
		JDBC_DRIVER = JDBC_DRIVER;
	}


	public static String getDB_URL() {
		return DB_URL;
	}


	public static void setDB_URL(String DB_URL) {
		DB_URL = DB_URL;
	}


	public static String getUSER() {
		return USER;
	}


	public static void setUSER(String USER) {
		USER = USER;
	}


	public static String getPASS() {
		return PASS;
	}


	public static void setPASS(String PASS) {
		PASS = PASS;
	}


	public static Connection getConn() {
		return conn;
	}


	public static void setConn(Connection conn) {
		DatabaseConnection.conn = conn;
	}


	private static void Connect() {
	
	   
	try { conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   if( conn != null) {
			   System.out.println("Connected to the database");
		   }
	   }
	   	catch(SQLException e){
	   		System.out.println("An error occured. Maybe username and password is invalid!");
	      e.printStackTrace();
	   }
		   }
	   



		
		
	public static void insertInto() {
	
		
		try {
			
			Statement insert = conn.createStatement();
			String sqli = "INSERT INTO `travel`.`customer`" + 
					"(`email_address`," + 
					"`passw`," + 
					"`first_name`," + 
					"`last_name`," + 
					"`dateOfBirth`," + 
					"`mobileNo`) VALUES" 
			+ "('test@gmail.com','password123','Test','Insert','1995-03-15', '07234568798')";
			
				System.out.println(sqli);
			insert.executeUpdate(sqli);
		
			
			if(insert != null) {
				System.out.println("Added record");
			}
			else {
				System.out.println("Record not added");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	}
	public static void read() {
		try {
		Statement read = conn.createStatement();
		String sqlr = "SELECT * FROM customer";
		ResultSet rs = read.executeQuery(sqlr) ;
		while(rs.next()) {
			String Email = rs.getString("email_address");
			String Name = rs.getString("first_name");
			String Surname = rs.getString("last_name");
			System.out.println("Email Address :" + Email + ", First Name :" + Name + ", Surname :" + Surname );
		}
		rs.close();
	}	
		catch (SQLException e){
			e.printStackTrace();
		}
		}
		
	
	
	
}


	
	
	
	   	


