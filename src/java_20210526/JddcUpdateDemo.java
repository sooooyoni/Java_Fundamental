package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JddcUpdateDemo {
	public static void main(String[] args) {
		//1.드라이브로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt =null;
		
		try {
			//2.데이터베이스와 연결할 수 있는Connection 객체를 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
		
			//3.sql문을 전송할 구 있는 PreparedStatement객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member "); //sql문은 끝에 space bar 한번씩 해줘야함!! 중요!! 
			sql.append("SET NAME = ?, addr=? ");
			sql.append("WHERE num=? ");
			
			pstmt= con.prepareStatement(sql.toString());
			
			//4.바인딩 변수를 설정
			int index = 1;
			pstmt.setString(index++,"박건후");//대입후 증가니까 1대입후 증가해서 밑으로
			pstmt.setString(index++,"수원");//2대입후 증가하여 밑으로
			pstmt.setInt(index, 11);//3

			
			//5.sql문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수  : "+resultCount);
		
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					//6.모든자원을 클로스
					if(con!=null) con.close();
					if(pstmt!=null) pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
		
	}
}
