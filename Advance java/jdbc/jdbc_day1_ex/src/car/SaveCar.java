package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveCar {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//	load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//	Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","Naveen@123");

//	create statement
		Statement s = c.createStatement();

//	execute the statement
		s.execute("insert into car values(1,'RollsRoyce','red',1000000,12345)");
		s.execute("insert into car values(6,'Benz','red',7500000,12345)");
		s.execute("insert into car values(7,'Audi','red',8500000,12345)");
		s.execute("insert into car values(8,'Toyota','red',6000000,12345)");
		s.execute("insert into car values(9,'BMW','red',9000000,12345)");

		c.close();
		
		System.out.println("successfully car details saved in DB");
	}
}
