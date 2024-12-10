package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","Naveen@123");
		
//		create the statement
		Statement s = c.createStatement();
		
//		execute the statement
		s.execute("create table employee(id int primary key, name varchar(12), salary double, address varchar(12), phno BigInt(10))");
		
//		s.execute("drop table employee");
		
		
//		close the connection
		c.close();
		System.out.println("successfully table created in db");
	}

}

