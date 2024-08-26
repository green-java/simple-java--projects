package OnlineBilling;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnections {

	public static final String user="root";
	public static final String password="WY21@Kari";
	public static final String url="jdbc:mysql://localhost:3306/pizza";
	public static  Connection get_connection() throws SQLException
	{
		return DriverManager.getConnection(url, user, password);
	}
	
}
