package food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb", "root", "Naveen@123");
		
//		create statement
		Statement s = c.createStatement();
		
//		execute statement
		s.execute("create table food(id int, name varchar(20), price double, type varchar(20), quantity varchar(20))");
		
//		close connection
		c.close();
		System.out.println("Table created successfully");
	}

}
