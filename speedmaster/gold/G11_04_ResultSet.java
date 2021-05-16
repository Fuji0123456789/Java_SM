package speedmaster.gold;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class G11_04_ResultSet {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="SELECT NAME,ID,SCORE FROM GOLD WHERE ID=1";
       try (
        	Connection con=UserDatabase.getConnect();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);) {
                while (rs.next()) {
                    System.out.println(rs.getString(2));
                }
        } catch (SQLException e) {
            System.out.println("SQLException");
        }
    }
}
/*
1

*/