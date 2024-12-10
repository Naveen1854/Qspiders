package customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class UpdateCustomer {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//		load and register driver
		Driver d = new Driver();
		DriverManager.registerDriver(d);

		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);

//		establish the connection
		Connection c = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"),
				p.getProperty("password"));

//		create statement
		Statement s = c.createStatement();

		s.execute("update customer set  email='lmn@123' where id=10");

		c.close();
		System.out.println("success");
	}
}
