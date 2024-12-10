package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any id");
		int id = sc.nextInt();
		
		
//		load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Naveen@123");
		
//		create prepared statement
		PreparedStatement ps = c.prepareStatement("Delete from employee where id= ?");
		ps.setInt(1, id);
		
//		execute the statement
		ps.execute();
		
//		close the connection
		c.close();
		System.out.println("Employee data deleted successfully in to db");
	}

}
