import java.sql.*;


public class Program {
	public static void main(String[] args) {
		//load the JDBC driver
		String IP = "jdbc:postgresql://localhost:5432/textdb";
		String Username = "postgres";
		String Password = "yyggdd1219";
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load class" + "org.postgresql.Driver");
			e.printStackTrace();
			return;
		}// try-catch exception
		//the driver is loaded...
		System.out.println("PostgreSQL JDBC Driver found!");
		//proceed with a database connection
		Connection connection = null;
		//connect to the yacata.dcs.gla.ac.uk:5432
		try {
			connection = DriverManager.getConnection(IP, Username, Password);
		} catch (SQLException e) {
			System.out.println("Connection Filed!");
			e.printStackTrace();
			return;
		}//try-catch exception
		//connection to the database is done!
		if (connection != null) {
			try {
				System.out.println("Controlling your database...");
				//do not forget to close the connection to the database!
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();			
				}//try-catch exception
		}else {
			System.out.println("Failed to establish connection!");
		}//if-else
		
		}//main

	}//class
	
