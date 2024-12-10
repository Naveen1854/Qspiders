package food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchema {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		establish connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Naveen@123");

//		create statement
		Statement s = c.createStatement();

//		execute statement
		s.execute("create schema fooddb");

//		close the connection
		c.close();

		System.out.println("schema create successfully");
	}
}
