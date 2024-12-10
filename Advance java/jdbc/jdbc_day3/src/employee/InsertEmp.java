package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp id");
		int id = sc.nextInt();
		
		System.out.println("enter emp name");
		String name = sc.next();
		
		System.out.println("enter emp salary");
		double salary = sc.nextDouble();
		
		System.out.println("enter emp address");
		String address = sc.next();
		
		System.out.println("enter emp phno");
		long phno = sc.nextLong();
		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Naveen@123");
		
//		create prepared statement
		PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, salary);
		ps.setString(4, address);
		ps.setLong(5, phno);
		
//		execute the statement
		ps.execute();
		
//		close the connection
		c.close();
		System.out.println("Employee inserted successfully in to db");
	}

}
