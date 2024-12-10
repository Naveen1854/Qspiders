package laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteLaptop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id to delete that row");
		int id = sc.nextInt();
		
		System.out.println("Enter name to delete");
		String name = sc.next();
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "Naveen@123");
		
//		create statement
		Statement s = c.createStatement();
		
//		execute the statement
//		s.execute("delete from laptop where id = "+id+" ");
		s.execute("delete from laptop where name = '"+name+"')");
		
//		close the connection
		c.close();
		
		System.out.println("Successfully deleted data from db");
	}
}
