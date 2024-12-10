package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchCar {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		load & register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "Naveen@123");
		
//		create the statement
		Statement s = c.createStatement();
		
//		execute statement
		ResultSet rs = s.executeQuery("select * from car");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getLong(4));
			System.out.println(rs.getInt(5));
			System.out.println("------------------");
		}
		
//		close the connection
		c.close();
		
		System.out.println("car data fetched successfully");
	}
}
