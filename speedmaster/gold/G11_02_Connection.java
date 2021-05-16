package speedmaster.gold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class G11_02_Connection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(HOST=localhost)(PORT=1521)(PROTOCOL=tcp))(CONNECT_DATA=(SERVICE_NAME=orcl)))";
        String user = "TEST";
        //Oracle11gより、パスワードの大文字/小文字の区別が可能である
        String pass = "pass123";
        //String sql="SELECT SYSDATE,TABLE_NAME FROM USER_TABLES ORDER BY TABLE_NAME";
        String sql="SELECT * FROM GOLD";

        //sys		sqlplus sys/password as sysdba
		//データベース起動
		//startup
		//データベース停止
		//shutdown immediate

		//system	sqlplus system/password

		//表領域作成

		//表領域削除

		//ユーザー作成
		//String qry10="CREATE USER TEST1 IDENTIFIED BY password";
		//statement.executeUpdate(qry10);
		//test		sqlplus test/password
		//test1		sqlplus test1/password

		//ユーザー削除
		//String qry12="DROP USER TEST1";
		//String qry12="DROP USER TEST1 CASCADE";
		//statement.executeUpdate(qry12);

		//ユーザーアカウントロック
		//ORA-28000: アカウントがロックされています。
		//ALTER USER TEST ACCOUNT UNLOCK;
		//String qry13="ALTER USER TEST1 ACCOUNT LOCK";
		//statement.executeUpdate(qry13);

		//ユーザーアカウントロック解除
		//String qry14="ALTER USER TEST1 ACCOUNT UNLOCK";
		//statement.executeUpdate(qry14);

		//ユーザーパスワード変更
		//String qry15="ALTER USER TEST1 IDENTIFIED BY password1";
		//statement.executeUpdate(qry15);

		//ユーザーへの権限付与
		//String qry11="GRANT CREATE SESSION TO TEST1";
		//String qry11="GRANT RESOURCE TO TEST1";
			//GRANT CREATE SEQUENCE TO TEST1;
			//GRANT CREATE TABLE TO TEST1;
		//String qry11="GRANT UNLIMITED TABLESPACE TO TEST1";
		//【Oracle】VIEW作成時にORA-01031権限が不足しています【対処法】
		//https://souiunogaii.hatenablog.com/entry/Oracle-CreateView
		//String qry11="GRANT CREATE VIEW TO TEST";
		//GRANT ... TO TEST1 WITH ADMIN OPTION;
		//String qry11="GRANT SELECT ON TEST.EMP TO TEST1";
		//GRANT ... TO TEST1 ON ... WITH GRANT OPTION;
		//statement.executeUpdate(qry11);

		//ユーザーからの権限取消し
		//String qry16="REVOKE CREATE SESSION FROM TEST1";
		//String qry16="REVOKE RESOURCE FROM TEST1";
			//revoke cREATE SEQUENCE FROM TEST1;
			//revoke cREATE TABLE FROM TEST1;
		//String qry16="REVOKE UNLIMITED TABLESPACE FROM TEST1";
		//String qry11="REVOKE SELECT ON TEST.EMP FROM TEST1";
		//statement.executeUpdate(qry16);

		//ロール作成
		//CREATE ROLE ROLE_AS_TEST_USER;

		//ロール削除
		//DROP ROLE ROLE_AS_TEST_USER;

		//ロールへのシステム権限付与
		//GRANT CREATE SESSION TO ROLE_AS_TEST_USER;
		//GRANT RESOURCE TO ROLE_AS_TEST_USER;
			//GRANT CREATE SEQUENCE TO ROLE_AS_TEST_USER;
			//GRANT CREATE TABLE TO ROLE_AS_TEST_USER;
		//GRANT CREATE VIEW TO ROLE_AS_TEST_USER;
		//GRANT SELECT ON TEST.EMP TO ROLE_AS_TEST_USER;

		//ロールからのシステム権限取消し
		//REVOKE CREATE SESSION FROM ROLE_AS_TEST_USER;
		//REVOKE RESOURCE FROM ROLE_AS_TEST_USER;
			//REVOKE CREATE SEQUENCE FROM ROLE_AS_TEST_USER;
			//REVOKE CREATE TABLE FROM ROLE_AS_TEST_USER;
		//REVOKE CREATE VIEW FROM ROLE_AS_TEST_USER;
		//REVOKE SELECT ON TEST.EMP FROM ROLE_AS_TEST_USER;

		//ユーザーへのロールの割当て
		//GRANT ROLE_AS_TEST_USER TO TEST1;

		//ユーザーへのロールの割当て解除
		//REVOKE ROLE_AS_TEST_USER FROM TEST1;

		//特殊ロールPUBLIC
		//GRANT CREATE SESSION TO PUBLIC;

		//シーケンス作成
		//String qry1="CREATE SEQUENCE TEKITO_SEQ";
		//statement.executeUpdate(qry1);
		//TEKITO_SEQ
		//CODEID
		//FEID
		//TOPICID
		//VEHICLEID

		//シーケンス削除

		//テーブル作成
		//String qry2="CREATE TABLE MEMBER (ID CHAR(4),NAME VARCHAR2(16),SALARY NUMBER(10))";
		//String qry2="CREATE TABLE EMP (EMPNO NUMBER(4),ENAME VARCHAR2(4 CHAR),JOB VARCHAR2(2 CHAR),SAL NUMBER(6),AGE NUMBER(3),DEPTNO NUMBER(4))";
		//String qry2="CREATE TABLE DEPT (DEPTNO NUMBER(4),DNAME VARCHAR2(3 CHAR),TELNO VARCHAR2(10))";
		//String qry2="CREATE TABLE TEAM (TNO NUMBER(4) PRIMARY KEY,TNAME VARCHAR2(10 CHAR),LOC VARCHAR2(10 CHAR))";
		//String qry2="CREATE TABLE PLAYER (PNO NUMBER(4) PRIMARY KEY,PNAME VARCHAR2(10 CHAR),TNO NUMBER(4) REFERENCES TEAM(TNO))";
		//String qry2="CREATE TABLE ORACLE_USERS (UNO NUMBER(4) PRIMARY KEY,UNAME VARCHAR2(10 CHAR),PASSWORD VARCHAR2(10 CHAR))";
		//String qry2="CREATE TABLE MEMBER (ISBN CHAR(13),NAME VARCHAR2(16),SALARY NUMBER(10))";
		//表領域指定
		//statement.executeUpdate(qry2);

		//テーブル削除
		//String qry8="DROP TABLE MEMBER";
		//statement.executeUpdate(qry8);

		//レコード追加
		//String qry3="INSERT INTO ACCOUNT VALUES ('ジャクソン',4000)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'ジャクソン',200000)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'ジョナサン',300000)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'アレックス',NULL)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'ジェーン',NULL)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'ジョージ',NULL)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'ディクソン',200000)";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'','')";
		//String qry3="INSERT INTO MEMBER VALUES (TEKITO_SEQ.NEXTVAL,'未使用',0)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'本山三郎','営業',720,34,2)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'中村次郎','総務',720,29,2)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'山田花子','総務',600,31,1)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'三田海子','技術',720,58,3)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'山本太郎','技術',900,36,1)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'山田一太','総務',510,22,1)";
		//String qry3="INSERT INTO EMP VALUES (TEKITO_SEQ.NEXTVAL,'藤原頼朝','社長',2000,52,NULL)";
		//String qry3="INSERT INTO DEPT VALUES (2,'流通部','0312345678')";
		//String qry3="INSERT INTO DEPT VALUES (1,'金融部','0312345679')";
		//String qry3="INSERT INTO DEPT VALUES (3,'公共部','0312345670')";
		//String qry3="INSERT INTO DEPT VALUES (4,'特別部','0312345677')";
		//String qry3="INSERT INTO TEAM VALUES (TEKITO_SEQ.NEXTVAL,'S-PULSE','TOKYO')";
		//String qry3="INSERT INTO TEAM VALUES (TEKITO_SEQ.NEXTVAL,'REDS','DALLAS')";
		//String qry3="INSERT INTO TEAM VALUES (TEKITO_SEQ.NEXTVAL,'GAMBA','CHICAGO')";
		//String qry3="INSERT INTO TEAM VALUES (TEKITO_SEQ.NEXTVAL,'TIGERS','BOSTON')";
		//String qry3="INSERT INTO PLAYER VALUES (TEKITO_SEQ.NEXTVAL,'TOM',39)";
		//String qry3="INSERT INTO PLAYER VALUES (TEKITO_SEQ.NEXTVAL,'JONES',40)";
		//String qry3="INSERT INTO PLAYER VALUES (TEKITO_SEQ.NEXTVAL,'MARY',41)";
		//String qry3="INSERT INTO PLAYER VALUES (TEKITO_SEQ.NEXTVAL,'MICHEL',42)";
		//String qry3="INSERT INTO ORACLE_USERS VALUES (TEKITO_SEQ.NEXTVAL,'SYS','PASSWORD')";
		//String qry3="INSERT INTO ORACLE_USERS VALUES (TEKITO_SEQ.NEXTVAL,'SYSTEM','PASSWORD')";
		//String qry3="INSERT INTO ORACLE_USERS VALUES (TEKITO_SEQ.NEXTVAL,'TEST','PASSWORD')";
		//statement.executeUpdate(qry3);

		//レコード更新
		/*
        UPDATE ORACLE_USERS SET PASSWORD='pass' WHERE UNAME='SYSTEM';
        UPDATE ORACLE_USERS SET PASSWORDDT=(SELECT SYSDATE FROM DUAL) WHERE UNAME='SYSTEM';
        COMMIT;
		SELECT * FROM ORACLE_USERS;
		*/
		//String qry4="UPDATE ACCOUNT SET MONEY=5000 WHERE NAME='ジャクソン'";
		//String qry4="UPDATE MEMBER SET SALARY=400000 WHERE NAME='アレックス'";
		//String qry4="UPDATE MEMBER SET NAME='エミリア',SALARY=500000 WHERE ID=23";
		//String qry4="UPDATE MEMBER SET NAME='エミリー',SALARY=NULL WHERE ID=24";
		//statement.executeUpdate(qry4);

		//レコード削除
		//String qry5="DELETE FROM ACCOUNT WHERE NAME='ジャクソン'";
		//String qry5="TRUNCATE TABLE MEMBER";
		//String qry5="DELETE FROM ORACLE_USERS WHERE UNAME NOT IN (SELECT USERNAME FROM ALL_USERS)";
		//statement.executeUpdate(qry5);

		//インデックス作成
		//String qry6="CREATE INDEX TEKITO_INDEX ON MEMBER(ID,SALARY)";
		//statement.executeUpdate(qry6);

		//ビュー作成
		//String qry7="CREATE VIEW EMP_V AS SELECT EMPNO,ENAME,DNAME FROM EMP JOIN DEPT ON EMP.DEPTNO=DEPT.DEPTNO";
		//statement.executeUpdate(qry7);

		//ロールバック
		//String qry9="ROLLBACK";
		//statement.executeUpdate(qry9);

		//データ取得・出力
		//SELECT DEFAULT_TABLESPACE FROM DBA_USERS WHERE USERNAME='TEST';
		//SELECT * FROM DBA_PROFILES WHERE RESOURCE_NAME = 'PASSWORD_LIFE_TIME';
		//String sql="SELECT * FROM USER_ROLE_PRIVS";
		//String sql="SELECT * FROM SESSION_ROLES";
		//String sql="SELECT * FROM DBA_ROLE_PRIVS";
		//String sql="SELECT * FROM DBA_TABLESPACES";
		//String sql="SELECT * FROM USER_TABLESPACES";
		//String sql="SELECT * FROM USER_USERS";
		//String sql="SELECT * FROM DBA_USERS";	//すべてのユーザーの情報を確認するにはDBA_USERSに問い合わせますが、このビューにアクセスするにはSELECT ANY TABLE権限が必要です。この権限は、デフォルトでDBAロールに割り当てられます。
		//String sql="SELECT USERNAME FROM ALL_USERS WHERE USERNAME NOT IN('ANONYMOUS','APPQOSSYS','AUDSYS','CTXSYS','DBSFWUSER','DBSNMP','DIP','DVF','DVSYS','GGSYS','GSMADMIN_INTERNAL','GSMCATUSER','GSMUSER','HR','LBACSYS','MDDATA','MDSYS','ODMRSYS','OJVMSYS','OLAPSYS','ORACLE_OCM','ORDDATA','ORDPLUGINS','ORDSYS','OUTLN','REMOTE_SCHEDULER_AGENT','SI_INFORMTN_SCHEMA','SYS$UMF','SYSBACKUP','SYSDG','SYSKM','SYSRAC','WMSYS','XDB','XS$NULL')";
		//String sql="SELECT * FROM ORACLE_USERS WHERE UNAME IN (SELECT USERNAME FROM ALL_USERS)";	//自作のテーブル。Oracleの各ユーザーのパスワードを自力で登録している。
		//String sql="SELECT TABLE_NAME FROM USER_TABLES ORDER BY TABLE_NAME";
		//String sql="SELECT VIEW_NAME FROM USER_VIEWS ORDER BY VIEW_NAME";
		//String sql="SELECT TEXT FROM USER_VIEWS WHERE VIEW_NAME='POKEMON_V_HOME_CAPTURED'";

		//String sql="SELECT * FROM ACCOUNT";
		//String sql="SELECT * FROM CODEMASTER";
		//String sql="SELECT * FROM FE";
		//String sql="SELECT * FROM EMP ORDER BY EMPNO";
		//String sql="SELECT * FROM DEPT ORDER BY DEPTNO";
		//String sql="SELECT * FROM MEMBER ORDER BY ID";
		//String sql="SELECT * FROM MEMBER ORDER BY ID ASC";
		//String sql="SELECT * FROM MEMBER ORDER BY ID DESC";
		//String sql="SELECT * FROM MEMBER ORDER BY ID,SALARY DESC";
		//String sql="SELECT * FROM MEMBER WHERE NAME='ジャクソン' ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE NAME!='ジャクソン' ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY>200000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY>=200000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY<300000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY<=300000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY<400000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY>400000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE NAME LIKE 'ジ%' ORDER BY ID";	//前方一致のあいまい検索
		//String sql="SELECT * FROM MEMBER WHERE NAME LIKE '%ジ' ORDER BY ID";	//後方一致のあいまい検索
		//String sql="SELECT * FROM MEMBER WHERE NAME LIKE 'ジ___ン' ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE NAME LIKE 'ジ%ン' ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE NAME NOT LIKE 'ジ%ン' ORDER BY ID";
		/*
		STRING SQL="SELECT * FROM MEMBER "
				+ "WHERE SALARY<400000 "
				+ "OR NAME LIKE 'ジ%ン' ORDER BY ID";
		*/
		//String sql="SELECT * FROM MEMBER WHERE NAME IN ('ジャクソン','アレックス','ジョージ') ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE NAME NOT IN ('ジャクソン','アレックス','ジョージ') ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY BETWEEN 250000 AND 350000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY NOT BETWEEN 250000 AND 350000 ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY IS NULL ORDER BY ID";
		//String sql="SELECT * FROM MEMBER WHERE SALARY IS NOT NULL ORDER BY ID";
		/*
		STRING SQL="SELECT * FROM MEMBER WHERE "
				+ "NAME IN ('ジャクソン','アレックス','ジョージ') "
				+ "AND SALARY IS NOT NULL ORDER BY ID";
		*/
		//String sql="SELECT DNAME||'：'||REPLACE(TELNO,'031234','03-1234-') TEL FROM DEPT ORDER BY DEPTNO";
		//String sql="SELECT NAME||'：'||SUBSTR(NAME,1,2) FROM MEMBER WHERE SALARY IS NOT NULL ORDER BY ID";
		//String sql="SELECT COUNT(*),COUNT(NAME),COUNT(SALARY),SUM(SALARY),AVG(SALARY),MAX(SALARY),MIN(SALARY) FROM MEMBER";
		//String sql="SELECT SALARY,COUNT(*) FROM MEMBER GROUP BY SALARY ORDER BY SALARY DESC";
		//String sql="SELECT SALARY,COUNT(*) FROM MEMBER GROUP BY SALARY HAVING COUNT(*)!=1 ORDER BY SALARY DESC";
		//String sql="SELECT SALARY,COUNT(*) FROM MEMBER WHERE SALARY>200000 GROUP BY SALARY HAVING COUNT(*)=1 ORDER BY SALARY DESC";
		//String sql="SELECT * FROM MEMBER WHERE SALARY>(SELECT AVG(SALARY) FROM MEMBER) ORDER BY ID";
		//String sql="SELECT * FROM TEST.MEMBER WHERE SALARY>(SELECT AVG(SALARY) FROM TEST.MEMBER) ORDER BY ID";
		//String sql="SELECT * FROM M_CODE";
		//String sql="SELECT * FROM TOPIC";
		//String sql="SELECT * FROM VEHICLE";
		//String sql="SELECT * FROM ALL_SEQUENCES";
		//String sql="SELECT NULL||'ABC' FROM DUAL";
		//String sql="SELECT NULL||NULL FROM DUAL";
		//String sql="SELECT SYSDATE FROM DUAL";
		//String sql="SELECT EMPNO,ENAME,DNAME FROM EMP JOIN DEPT ON EMP.DEPTNO=DEPT.DEPTNO";	//内部結合
		//String sql="SELECT EMPNO,ENAME,DNAME FROM EMP LEFT OUTER JOIN DEPT ON EMP.DEPTNO=DEPT.DEPTNO";	//左外部結合
		//String sql="SELECT EMPNO,ENAME,DNAME FROM EMP RIGHT OUTER JOIN DEPT ON EMP.DEPTNO=DEPT.DEPTNO";	//右外部結合
		//String sql="SELECT * FROM DEPT ORDER BY DEPTNO";
		//String sql="SELECT * FROM EMP_V";
		//String sql="SHOW PARAMETER NLS_DATE_FORMAT";
		//String sql="SELECT * FROM TEAM ORDER BY TNO";
		//String sql="SELECT * FROM PLAYER ORDER BY PNO";
		//String sql="SELECT PNO,PNAME,PLAYER.TNO,TNAME FROM PLAYER JOIN TEAM ON PLAYER.TNO=TEAM.TNO ORDER BY PNO";

        //String sql="SELECT * FROM POKEMON_V_HOME_CAPTURED";

        try (
            Connection con=DriverManager.getConnection(url,user,pass);
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
Visual Studio Code　jarをクラスパスに追加する方法
https://cloud6.net/so/java/224639
*/