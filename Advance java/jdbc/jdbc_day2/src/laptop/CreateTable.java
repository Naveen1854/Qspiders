package laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb","root","Naveen@123");
		
//		create the statement
		Statement s = c.createStatement();
		
//		execute the statement
		s.execute("create table laptop(id int primary key, name varchar(12), brand varchar(12), price double(10), color varchar(12))");
		
//		close the connection
		c.close();
		System.out.println("successfully table created in db");
	}

}
