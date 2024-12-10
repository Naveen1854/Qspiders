package laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name to fetch");
//		String name = sc.next();
//		
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "Naveen@123");
		
//		create the statement
		Statement s = c.createStatement();
		
//		execute the statement
//		s.execute("select * from laptop where name = ('"+ name +"') ");
		ResultSet rs = s.executeQuery("select * from laptop");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getLong(4));
			System.out.println(rs.getString(5));
			System.out.println("------------------");
		}
		
//		close the connection
		c.close();
		
		System.out.println("Data fetched successfully from db");
	}

}
