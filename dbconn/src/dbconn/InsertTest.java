package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* executeUpdate : insert, update, delete (DML) => int (row count) 몇개 
 * 					DDL (create alter drop) => 0
 * cf select : DQL
*/

public class InsertTest {
	public static void main(String[] args) {
		
		String className = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String pwd = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(className);
			conn = DriverManager.getConnection(url, user, pwd);
			// String, StringBuffer StringBuilder
			StringBuilder sb = new StringBuilder();
			String title = "안녕하세요";
			
			sb.append(" insert into board ( bno, title, content, writer, readno) ");
			sb.append(" values(?,?,?,?,0) ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, 20);
			pstmt.setString(2, title);
			pstmt.setString(3, "조금만 있으면 퇴근입니다.");
			pstmt.setString(4, "홍길동");
			int result = pstmt.executeUpdate();
			System.out.println("입력성공!!!" + result);
			
			
		} catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		} finally {
			if(pstmt!=null) try { pstmt.close();} catch(SQLException e) {}
			if(conn!=null) try { conn.close();} catch(SQLException e) {}
		}
	}
}
