package movie;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;


public class FetchAll {

	public static void main(String[] args) throws SQLException, IOException {
		
//		load and register the driver
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
//		use FileInputStream to establish the connection
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
//		create statement
		Statement s = c.createStatement();
		
//		execute statement
//		s.execute("select * from movie where actor = allu arjun");
		ResultSet rs = s.executeQuery("select * from movie");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getDouble(6));
			System.out.println("----------------");
		}
		
//		close the connection
		c.close();
		
		System.out.println("successfuly data fetched from movie table");	
	}
}
