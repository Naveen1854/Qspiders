package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SavePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		establish the connection with Database
		 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","Naveen@123");
		 
//		 create the statement
		 Statement s = c.createStatement();
		 
//		 execute the statement
		 s.execute("insert into person values (1,'Naveen',23, 852299,'Hyderabad')");
		 s.execute("insert into person values (2,'Kiran',24, 961893,'Hanmakonda')");
		 s.execute("insert into person values (3,'Akshay',23, 123456,'Warangal')");
		 s.execute("insert into person values (4,'Charan',22, 654321,'Narsampet')");
		 s.execute("insert into person values (5,'Ganesh',21, 654908,'Chennai')");
		 			
				 
//		close the connection
		c.close();
		
		System.out.println("Person details inserted into databse successfully");
	}

}
