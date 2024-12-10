package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String fqcn = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/persondb";
		String un = "root";
		String pwd = "Naveen@123";
		
		String sql = "update person set id=7 where id=1";
		
//		Load and register the Driver
		Class.forName(fqcn);
		
//		Get connection with DB
		Connection c  = DriverManager.getConnection(url,un,pwd);
		
//		Create Statement
		Statement s = c.createStatement();
		
//		execute the statement
		s.execute(sql);
		
//		close the connection
		s.close();
		
		System.out.println("successfully update the data in database");
	}
}
