package db;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseQueries {

	
	public void insertInto() {

		
		try {
			
			Statement insert = DatabaseConnection.conn.createStatement();
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
											} catch (SQLException e) {
												
												e.printStackTrace();
											} 
		
										}
	
	public String Read(String sqlr) {
		
		String rt = null;

		try {
			
		Statement read = DatabaseConnection.conn.createStatement();
	
		ResultSet rs = read.executeQuery(sqlr) ;
		
			while(rs.next()) {
			String Email = rs.getString("email_address");
			String Name = rs.getString("first_name");
			String Surname = rs.getString("last_name");
			Date DOB = rs.getDate("dateOfBirth");
			String Mobile = rs.getString("mobileNo");
			
				 rt= "Email Address : " + Email + ", First Name : " + Name + ", Surname : " + Surname 
						 + ", Date Of Birth: " + DOB + " , Mobile Number : " + Mobile;
				
			}
			
				rs.close();
					}	
						catch (SQLException e){
									e.printStackTrace();
				}
		System.out.println(rt);
		
		return rt;
	}
		
	public void update() {
		
			try {
				Statement update = DatabaseConnection.conn.createStatement();

				String sqlu = "UPDATE customer " + "SET first_name = 'Tabassum' " + "WHERE email_address = 'test@gmail.com'";
				update.executeUpdate(sqlu);
							} catch (SQLException e) {
										e.printStackTrace();
									}
		
		
	}	
	
	public void delete() {
		
		try {
			Statement delete = DatabaseConnection.conn.createStatement();
		
			String sqld = "DELETE FROM customer " + "WHERE email_address = 'test@gmail.com'";
						delete.executeUpdate(sqld);
						System.out.println("Record Deleted");
					} catch(SQLException e) {
							e.printStackTrace();
	}
	}
	
	
	}
	
