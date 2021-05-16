package speedmaster.gold;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class G11_14_GOLD {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="SELECT * FROM GOLD";

		//テーブル削除
		String qry5="DROP TABLE GOLD";

		//テーブル作成
		String qry1="CREATE TABLE GOLD (ID NUMBER(1) PRIMARY KEY,NAME VARCHAR2(10),SCORE NUMBER(4))";

		//レコード削除
		String qry4="TRUNCATE TABLE GOLD";

		//レコード追加
		//String qry2="INSERT INTO GOLD VALUES (1,'Duke',100)";
		String qry3="INSERT INTO GOLD VALUES (2,'Java',80)";

        try (
        		Connection con=UserDatabase.getConnect();
				Statement stmt=con.createStatement()) {
        	con.setAutoCommit(false);
    		stmt.executeUpdate(qry5);
        	stmt.executeUpdate(qry1);
        	stmt.executeUpdate(qry4);
        	//stmt.executeUpdate(qry2);
        	stmt.executeUpdate(qry3);
            con.commit();

            try(ResultSet rs=stmt.executeQuery(sql)){
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
				// TODO: handle exception
				//
			}

        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }
    }
}
/*
Visual Studio Code　jarをクラスパスに追加する方法
https://cloud6.net/so/java/224639
*/