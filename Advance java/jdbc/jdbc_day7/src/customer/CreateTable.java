package customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//		load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
//		establish the connection
		Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"), p.getProperty("password"));
		
//		create statement
		Statement s = c.createStatement();
		
//		execute statement
		s.execute("create table customer(id int primary key, name varchar(20), age int, address varchar(20), phno BigInt(10), email varchar(20))");
		
//		close the connection
		c.close();
		
		System.out.println("success");
	}
}
