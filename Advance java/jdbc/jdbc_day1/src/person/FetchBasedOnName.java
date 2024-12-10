package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchBasedOnName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		establish the connection with DB
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "Naveen@123");

//		create statement
		Statement s = c.createStatement();

//		  execute the statement
		ResultSet rs = s.executeQuery("select * from person where name='Naveen'");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//			System.out.println(rs.getLong(4));
			System.out.println(rs.getString(5));
			System.out.println("-----------------");
		}
		
//		close the the connection
		c.close();
		System.out.println("successfully data fetched from db");
	}

}
