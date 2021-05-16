package speedmaster.gold;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class G11_10_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="INSERT INTO GOLD VALUES(?,?,?)";
        try (
    		   Connection con=UserDatabase.getConnect();
    		   PreparedStatement pstmt=con.prepareStatement(sql)){
                   pstmt.setInt(1, 3);
                   pstmt.setString(2, "GOLD");
                   int i=pstmt.executeUpdate();
                   System.out.println("INSERT");
                   System.out.println(i);
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
    }
}
/*
SQLException
INまたはOUTパラメータがありません - 索引:: 3

*/