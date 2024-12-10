package player;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class UpdatePlayer {

	public static void main(String[] args) throws SQLException, IOException {
//		load and register driver
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
//		establish the connection
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
//		create statement
		Statement s = c.createStatement();
		
//		s.addBatch();
//		s.execute("update player set name = 'nkr'where id=6");
		s.execute("update player set  jersyno=33 where id=6");
		
		c.close();
		System.out.println("success");
	}

}
