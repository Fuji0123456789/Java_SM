package speedmaster.gold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * G11_01_Connection
 */
public class G11_01_Connection {
    public static void main(String[] args) {
        String dburl="DBURL";

        /*
        Connection con=null;
        Statement stmt=null;
        try {
            con=DriverManager.getConnection(dburl);
            stmt=con.createStatement();
        } catch (SQLException e) {
            //TODO: handle exception
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        */

        try (
            Connection con=DriverManager.getConnection(dburl);
            Statement stmt=con.createStatement();) {

        } catch (SQLException e) {
            //TODO: handle exception
        }
    }
}