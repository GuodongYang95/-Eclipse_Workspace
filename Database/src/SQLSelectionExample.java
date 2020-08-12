import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLSelectionExample {
	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/textdb", "postgres", "yyggdd1219");
			System.out.println("Opened database successfully");
			
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE;");
			while (rs.next()) {
				int SSN = rs.getInt("SSN");
				String LNAME = rs.getString("LNAME");
				int AGE = rs.getInt("AGE");
				String ADDRESS = rs.getString("ADDRESS");
				System.out.println("SSN = "+ SSN);
				System.out.println("LAST NAME = " + LNAME);
				System.out.println("AGE = " + AGE);
				System.out.println("ADDRESS = " + ADDRESS);
				System.out.println();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.exit(0);
		}
		System.out.println("Operation done successfully");
	}
}
