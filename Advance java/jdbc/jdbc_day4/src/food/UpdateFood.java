package food;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateFood {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb","root","Naveen@123");
		
//		create callable statement
		CallableStatement cs = c.prepareCall("call fooddb.update_food(?,?)");
		
		cs.setInt(1, 1);
		cs.setString(2, "prawns");
		
//		execute the statement
		cs.execute();
		
//		close the connection
		c.close();
		
		System.out.println("Successfully updated food");
	}

}
