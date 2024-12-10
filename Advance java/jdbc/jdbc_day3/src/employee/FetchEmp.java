package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Naveen@123");
		
//		create prepared statement
		PreparedStatement ps = c.prepareStatement("select * from employee where salary = ?");
		ps.setDouble(1, salary);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getLong(5));
			System.out.println("-------------------");
		}
		
//		close the connection
		c.close();
		System.out.println("successfully data fetched from db");
	}

}
