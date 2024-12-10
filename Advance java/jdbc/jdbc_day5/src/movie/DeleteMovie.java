package movie;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DeleteMovie {

	public static void main(String[] args) throws SQLException, IOException {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
		Statement s = c.createStatement();
		
		s.execute("Delete from movie where id = 5");
		
		c.close();
		
		System.out.println("Successfully data deleted from movie table");
	}
}
