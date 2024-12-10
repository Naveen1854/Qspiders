package player;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeletPlayer {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//		load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
//		establish the connection
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
//		create the statement
		Statement s = c.createStatement();
		
		s.execute("delete from player where id=10");
		
		c.close();
		System.out.println("success");

	}

}
