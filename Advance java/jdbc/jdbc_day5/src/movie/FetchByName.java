package movie;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class FetchByName {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		
//		load and register the Driver
		
//		Driver d = new Driver();
//		DriverManager.registerDriver(d);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
//		create statement
		Statement s = c.createStatement();
		
//		execute the statement 
//		s.execute("select actor from where name = pushpa2");
		ResultSet rs = s.executeQuery("select actor from movie where name = 'pushpa2'");
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println("-------------");
		}
		
//		close the connection
		c.close();
		
		System.out.println("successfully data fetched based on name");
	}

}
