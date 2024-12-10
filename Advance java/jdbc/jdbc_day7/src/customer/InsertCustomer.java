package customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertCustomer {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//			load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileInputStream fis = new FileInputStream("configuration.properties");
			Properties p = new Properties();
			p.load(fis);
			
//			establish the connection
			Connection c = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"), p.getProperty("password"));
			
//			create statement
			Statement s = c.createStatement();
			
//			s.addBatch("insert into customer values(1,'abc',21,'nspt',852299,'abc@123')");
//			s.addBatch("insert into customer values(2,'def',22,'chpt',12345,'def@123')");
//			s.addBatch("insert into customer values(3,'xyz',23,'hyderabad',34562,'xyz@123')");
//			s.addBatch("insert into customer values(4,'lmn',24,'bngloure',1324647,'lmn@123')");
//			s.addBatch("insert into customer values(5,'opq',25,'chennai',678945,'opq@123')");
//			s.addBatch("insert into customer values(6,'rst',26,'wgl',126789,'rst@123')");
			
//			s.addBatch("insert into customer values(7,'ghi',27,'delhi',8524535,'ghi@123')");
//			s.addBatch("insert into customer values(9,'jkl',19,'chennai',8524456,'jkl@123')");
//			s.addBatch("insert into customer values(4,'mno',18,'hyderabad',8343535,'mno@123')");
//			execute statement
			s.executeBatch();
			
//			close the connection 
			c.close();
			
			System.out.println("success");
	}

}
