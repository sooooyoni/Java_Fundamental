package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		//1드라이버로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2데이터베이스와 연결하는 Connection객체 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
		
			
			//3SQL읊 전송하는  PreparedStatement객체 생성
			StringBuilder sql= new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num=? ");
	
			//4바인딩변수 설정
			pstmt = con.prepareStatement(sql.toString());
			int index=1;
			pstmt.setInt(index, 11);
			//5SQL전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수 : "+resultCount);
			//6모든자원 반납
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(con!=null)con.close();
					if(pstmt!=null)pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
	}
}
