package speedmaster.gold;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class G11_09_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="SELECT * FROM GOLD WHERE ID=?";
        try (
    		   Connection con=UserDatabase.getConnect();
    		   PreparedStatement pstmt=con.prepareStatement(sql)){
                   pstmt.setInt(1, 2);
                   try (ResultSet rs=pstmt.executeQuery()) {
                       while (rs.next()) {
                           System.out.println(rs.getString(2)+" : "+rs.getString(3));
                       }
                   } catch (Exception e) {
                       //TODO: handle exception
                   }
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
    }
}
/*
Java : 80

*/