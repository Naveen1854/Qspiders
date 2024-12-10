package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DelectePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","Naveen@123");
		
//		create the statement
		Statement s = c.createStatement();
		
//		execute the statement
		s.execute("delete from person where id = 1");
//		s.execute("delete from person where id = 2");
//		s.execute("delete from person where id = 3");
//		s.execute("delete from person where id = 4");
//		s.execute("delete from person where id = 5");
		System.out.println("successfully deleted data from database");
		
//		close the connection
		c.close();
	}

}
