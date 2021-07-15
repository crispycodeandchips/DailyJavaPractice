package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * DriverManager 연결방식
 * 
 * DBCP(database connection pool) 연결방식
*/

public class DBConnTest {
	public static void main(String[] args) {

		String className = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String pwd = "hr";

		Connection conn = null;
		try {
			Class.forName(className);
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("데이터베이스 연결" + conn);

		} catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		} 
		finally {
			if (conn != null) try { conn.close();} catch (SQLException e) {}
		}
	}
}
