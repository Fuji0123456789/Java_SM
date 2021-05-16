package speedmaster.gold;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class G11_07_ResultSet {
    public static void main(String[] args) throws ClassNotFoundException {
        try (
           Connection con=UserDatabase.getConnect();
           Statement stmt=con.createStatement(
               ResultSet.TYPE_SCROLL_INSENSITIVE,
               ResultSet.CONCUR_UPDATABLE
           );) {
               String sql="SELECT * FROM T_G11_07_EMP";
    		   ResultSet rs=stmt.executeQuery(sql);
               while (rs.next()) {
                   if (rs.getInt(1)==102) {
                       //rs.updateString(2, "Duke");
                       //rs.updateRow();
                   }
                }
                rs.absolute(2);
                System.out.println(rs.getInt(1)+" : "+rs.getString(2));
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
    }
}
/*
SQLException
読取り専用の結果セットに対する操作が無効です。: updateString

*/