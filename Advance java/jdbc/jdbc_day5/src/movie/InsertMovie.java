package movie;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class InsertMovie {

	public static void main(String[] args) throws SQLException, IOException {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		
		p.load(fis);
		
		Connection c = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
		
		
		Statement s = c.createStatement();
		
//		s.execute("insert into movie values(2, 'bahubali', 'prabhas', 'anushks', 'rajamouli', 4000000000)");
		
		s.execute("insert into movie values(4, 'devara', 'ntr', 'jhanvi kapoor', 'koratala siva', 6000000000)");
		
		c.close();
		
		System.out.println("successfully data import from the file using FileInputStream");
	}
}
