package player;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class CreateSchema {

	public static void main(String[] args) throws SQLException, IOException {
//		load and register the Driver
		Driver d = new Driver();
		DriverManager.registerDriver(d);

		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
//		establish the connection
		Connection c = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
		
//		create statement
		Statement s = c.createStatement();
		
		s.execute("create schema playerdb");
		
//		close the connection
		c.close();
		
		System.out.println("Success");
		
		
	}

}
