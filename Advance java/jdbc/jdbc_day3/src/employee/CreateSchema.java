package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchema {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection with db
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Naveen@123");

//		create the statement
		Statement s = c.createStatement();
		
//		execute the statement
		s.execute("create schema employeedb");
		
//		close the connection
		c.close();
		
		System.out.println("schema created Successfully in db");


	}

}
