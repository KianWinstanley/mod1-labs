package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) {
		new MSSQLExample().read();
	}
}

class MSSQLExample {
	public void read() {
		String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qastore1;encrypt=true;trustServerCertificate=true;user=mike;password=Password123";
		
		try (Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement()) {
			String query = "SELECT * FROM sale";
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + "," + rs.getString("description"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
