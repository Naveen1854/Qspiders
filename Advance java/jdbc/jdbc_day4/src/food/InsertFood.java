package food;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertFood {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb", "root", "Naveen@123");
		
//		create Callable Satement
		CallableStatement cs = c.prepareCall("call fooddb.insert_food(?,?,?,?,?)");
		
		cs.setInt(1, 3);
		cs.setString(2, "mutton");
		cs.setDouble(3, 550);
		cs.setString(4, "nonveg");
		cs.setString(5, "jumbo");
		
//		execute the statement
		cs.execute();
		
//		close the connection
		c.close();
		
		System.out.println("food inserted successfully");
	}

}
