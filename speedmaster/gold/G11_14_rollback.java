package speedmaster.gold;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * G11_1_
 */
public class G11_14_rollback {
    public static void main(String[] args) throws ClassNotFoundException {
        //String sql ="INSERT INTO GOLD"+"VALUES(2,'Java',80)";
        String sql1="INSERT INTO GOLD "+"VALUES(1,'James',99)";
        String sql2="INSERT INTO GOLD "+"VALUES(2,'Mustang',60)";

        try (Connection con=UserDatabase.getConnect()) {
            try (Statement stmt=con.createStatement()) {
                //stmt.executeQuery(sql);
                //con.commit();
                con.setAutoCommit(false);
                stmt.executeUpdate(sql1);
                stmt.executeUpdate(sql2);
                con.commit();
            } catch (SQLException e) {
                //TODO: handle exception
                if (con!=null) {
                    con.rollback();
                    System.out.println("rollback");
                    System.out.println(e.getMessage());
                }
            }

            UserDatabase.refer(con,"GOLD");

        } catch (SQLException e) {
            System.out.println("SQLException");
        }
    }
}
/*
rollback
ORA-00001: 一意制約(TEST.SYS_C0067942)に反しています

ColumnCount:	3

ID:	2
NAME:	Java
SCORE:	80


Visual Studio Code
java - Visual Studio Code、Java拡張、jarをクラスパスに追加する方法
https://cloud6.net/so/java/224639
*/