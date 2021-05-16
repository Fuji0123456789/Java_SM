package speedmaster.gold;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class G11_12_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql="INSERT INTO GOLD VALUES(?,?,?)";
        try (
    		   Connection con=UserDatabase.getConnect();
    		   PreparedStatement pstmt=con.prepareStatement(sql)){
                   pstmt.setInt(1, 101);
                   pstmt.setString(2, "Duke");
                   pstmt.setInt(3, 75);
                   int j=pstmt.executeUpdate();
                   pstmt.setInt(1, 102);
                   j=pstmt.executeUpdate();
                   System.out.println("INSERT Success");
                   System.out.println(j);

        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        }

        String sql1="SELECT * FROM GOLD";
        try(
        		Connection con=UserDatabase.getConnect();
        		Statement stmt=con.createStatement();
        		ResultSet rs=stmt.executeQuery(sql1)){
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
			System.out.println(e.getMessage());
		}


    }
}
/*

*/
