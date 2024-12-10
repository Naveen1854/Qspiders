package laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter id to update");
//		int id = sc.nextInt();
		
//		System.out.println("Enter name to update");
//		String name = sc.next();
		
		System.out.println("Enter a brand to update");
		String brand = sc.next();
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establish the connection with db
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "Naveen@123");

//		create statement
		Statement s = c.createStatement();
		
//		execute the statement
//		s.execute("update laptop set id=("+id+") where id=4");
//		s.execute("update laptop set name=('"+name+"') where id = 3");
		s.execute("update laptop set brand=('"+brand+"') where id = 3");
		
//		close the connection
		c.close();
		
		System.out.println("Successfully updated data into table");
	}

}
