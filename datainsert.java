package OnlineBilling;
import java.sql.*;
import java.util.*;
public class datainsert
{   
	public void Packupp(int SNO,int Normal_pizza,int Dulex_pizza,String Packup) throws SQLException
	{
	

	   SNO++;
		Connection con=dbconnections.get_connection();
		String query="insert into orders values(?,?,?,?)";
    	PreparedStatement pst=con.prepareStatement(query);
    	pst.setInt(1,SNO+=1);
    	pst.setInt(2,Normal_pizza);
    	pst.setInt(3,Dulex_pizza);
    	pst.setString(4,Packup);
    	pst.executeUpdate();
    	con.close();
	}
}
