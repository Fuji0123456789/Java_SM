package speedmaster.gold;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * G11_1_
 */
public class G11_06_ResultSet {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="SELECT NO FROM GOLD WHERE NAME='Java'";
        try (
    		   Connection con=UserDatabase.getConnect();
    		   Statement stmt=con.createStatement();
    		   ResultSet rs=stmt.executeQuery(sql);) {
    	   while (rs.next()) {
               System.out.println(rs.getString(3));
           }
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
    }
}
/*
SQLException
ORA-00904: "NO": 無効な識別子です。

*/