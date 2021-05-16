package speedmaster.gold;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class G11_08_CallableStatement {
    public static void main(String[] args) throws ClassNotFoundException {
    	//https://java-reference.com/java_db_procedure.html
    	//プロシージャを定義する
    	//String sql = "{call INSERT_TBL(?, ?, ?)}";
    	//TEST1
    	String sql = "{call TEST1}";
        try (
        		Connection con=UserDatabase.getConnect();
        		CallableStatement cs = con.prepareCall(sql)) {
            try {
            	con.setAutoCommit(false);  //オートコミットはオフ

                //実行するProcedureを指定してパラメータをセットする
            	//cs.setInt(1, 100);
            	//cs.setString(2, "A");
            	//cs.setString(3, "BBB");

                //Procedureを実行する
            	cs.executeUpdate();
            	//cs.executeQuery();

                //コミットする
                con.commit();

            } catch (Exception ex) {
                //例外発生時の処理
            	con.rollback();       //ロールバックする
                ex.printStackTrace();  //エラー内容をコンソールに出力する

            }
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