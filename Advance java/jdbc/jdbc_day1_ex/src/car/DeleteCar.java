package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCar {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","Naveen@123");
		
//		create statement
		Statement s = c.createStatement();
		
//		execute the statement
		s.execute("delete from car where carId=1");
		
		c.close();
		
		System.out.println("Car details was deleted successfully");
	}
}
