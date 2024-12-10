package movie;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class UpdateMovie {

	public static void main(String[] args) throws SQLException, IOException {
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);

		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		
		p.load(fis);
		
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
		Statement s = c.createStatement();
		
//		s.execute("update movie set id = 5 where id = 4");
//		s.execute("update movie set actors = 'tamanna' where id = 2");
//		s.execute("update movie set actors = 'sreeleela' where id = 1");
		s.execute("update movie set actors = 'rashimika mandana' where id = 1");
		
		c.close();
		
		System.out.println("successfully updated the data in the movie table");
	}

}
