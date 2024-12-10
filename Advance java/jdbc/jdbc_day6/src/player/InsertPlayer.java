package player;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertPlayer {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//		load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		FileInputStream fis = new FileInputStream("configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
//		establish the connection
		Connection c = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"),p.getProperty("password"));
		
//		create statement
		Statement s = c.createStatement();
		
//		using addBatch method insert data at one short to increase the efficiency of database
		s.addBatch("insert into player values(1, 'vk', 18, 'batsman', 'india')");
		s.addBatch("insert into player values(2, 'dk', 33, 'batsman', 'india')");
		s.addBatch("insert into player values(3, 'msd', 7, 'wicketkeper', 'india')");
		s.addBatch("insert into player values(4, 'rs', 49 , 'batsman', 'india')");
		s.addBatch("insert into player values(5, 'hp', 20, 'allround', 'india')");
		s.addBatch("insert into player values(6, 'jd', 19, 'allround', 'india')");
		s.addBatch("insert into player values(7, 'as', 12, 'spinner', 'india')");
		s.addBatch("insert into player values(8, 'br', 11, 'bowler', 'india')");
		s.addBatch("insert into player values(9, 'sh', 10, 'bowler', 'india')");
		s.addBatch("insert into player values(10, 'sr', 24, 'bowler', 'india')");
		
		s.executeBatch();
		
//		close the connection
		c.close();
		
		System.out.println("success");
	}

}
