package speedmaster.gold;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class G11_07_EMP {
    public static void main(String[] args) throws ClassNotFoundException {
		//テーブル削除
		//String qry1="DROP TABLE T_G11_07_EMP";

		//テーブル作成
		String qry2="CREATE TABLE T_G11_07_EMP (ID NUMBER(3),NAME VARCHAR2(10))";

		//レコード削除
		String qry3="TRUNCATE TABLE T_G11_07_EMP";

		//レコード追加
		String qry4="INSERT INTO T_G11_07_EMP VALUES (101,'Tom')";
		String qry5="INSERT INTO T_G11_07_EMP VALUES (102,'Jerry')";
		String qry6="INSERT INTO T_G11_07_EMP VALUES (103,'Donald')";

        String sql="SELECT * FROM T_G11_07_EMP";

        try (
				Connection con=UserDatabase.getConnect();
				Statement stmt=con.createStatement()) {
        	con.setAutoCommit(false);
    		//stmt.executeUpdate(qry1);
        	stmt.executeUpdate(qry2);
        	stmt.executeUpdate(qry3);
        	stmt.executeUpdate(qry4);
        	stmt.executeUpdate(qry5);
        	stmt.executeUpdate(qry6);
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

				//出力
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