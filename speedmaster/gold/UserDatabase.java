package speedmaster.gold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * UserDatabase
 */
class UserDatabase {
    static Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(HOST=localhost)(PORT=1521)(PROTOCOL=tcp))(CONNECT_DATA=(SERVICE_NAME=orcl)))";
        String user = "TEST";
        //Oracle11gより、パスワードの大文字/小文字の区別が可能である
        String pass = "pass";
        Connection con=DriverManager.getConnection(url,user,pass);
        return con;
    }

    //UserDatabase.refer(con,"GOLD");
    static void refer(Connection con,String tableName) {
    	String sql="SELECT * FROM "+tableName;
        try (
        		Statement stmt=con.createStatement();
        		ResultSet rs=stmt.executeQuery(sql)) {
        	//列名を把握したい。
        	//https://dev.to/programmingmonky/jdbcjava-53id
			List<String> columns = new ArrayList<String>();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnum=rsmd.getColumnCount();
            System.out.println("ColumnCount:	" +cnum+"\n");
			//リストcolumnsの要素として、列名を登録する。
            for (int i = 1; i <= cnum; i++) {
                columns.add(rsmd.getColumnName(i));
            }

			while (rs.next()) {
				//System.out.println(rs.getString("NAME")+"\n");
				//System.out.println(rs.getString(2)+"\n");
				//（一行の中の）列ごと
				columns.stream().forEach((i)->{
					try {
						System.out.println(i + ":	" + rs.getString(i));
					} catch (SQLException e) {
						e.printStackTrace();
					}
				});
				System.out.println("");
			}
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
	}
}