package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Naveen@123");
		
//		create prepared statement
		PreparedStatement ps = c.prepareStatement("update employee set name=? where id = 5");
		ps.setString(1, name);
		
		
//		execute the statement
		ps.execute();
		
//		close the connection 
		c.close();
		
		System.out.println("data updatd successfully in db");

	}

}
