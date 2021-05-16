package speedmaster.gold;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class G11_05_ResultSet {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="SELECT * FROM GOLD WHERE ID=3";
		try (
    		   Connection con=UserDatabase.getConnect();
    		   Statement stmt=con.createStatement();
    		   ResultSet rs=stmt.executeQuery(sql);) {
    	   if (rs!=null) {
    		   boolean n=true;
    		   while (n=rs.next()) {
                   System.out.println("Found");
               }
    		   //System.out.println(rs.next());
    		   System.out.println(n);
    	   } else {
    		   System.out.println("None");
    	   }
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
    }
}
/*
false

*/