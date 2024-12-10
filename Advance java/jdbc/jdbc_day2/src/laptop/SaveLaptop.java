package laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SaveLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		
		System.out.println("Enter the Name");
		String name = sc.next();
		
		System.out.println("Enter the Brand");
		String brand = sc.next();
		
		System.out.println("Enter the Price");
		double price = sc.nextInt();
		
		System.out.println("Enter the Color");
		String color = sc.next();
		
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb","root","Naveen@123");
		
//		create statement
		Statement s = c.createStatement();
		
//		execute statement
		s.execute("insert into laptop values("+id+",'"+name+"','"+brand+"',"+price+",'"+color+"')");
		
//		close the connection
		c.close();
		
		System.out.println("Successfully inserted data into table");

	}

}
