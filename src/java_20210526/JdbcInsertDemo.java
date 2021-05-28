package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
	
		//1.드라이버 로드한다
		
		try {//드라이버패키지에 있는것을 올리는 코딩 Class.forName("");
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println(
					"드라이버로드 실패 : "+e.getMessage());
		}
		//디비 연결
		Connection con = null;
		//PreparedStatement 호출
		PreparedStatement pstmt=null;
		try {
			//2.데이터베이스와 연결하는 Connection객체생성
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",//url
					"kpc12",//user
					"kpc1212");//password
			System.out.println("데이터베이스 연결 성공");
			
			//3.sql문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num,NAME,addr)");
			sql.append("VALUES(?,?,?)");
			//Stringbuilder을 String clas로 바꾸는 것 .toString
			//String으로 들어가야해서 스트링 클래스로 변경해줘라!
			pstmt = con.prepareStatement(sql.toString());
			//4.바인딩 변수 세팅하기
			pstmt.setInt(1, 11);
			pstmt.setString(2, "박건후");
			pstmt.setString(3, "수원");
			//5.sql문을 전송한다.
			int resultCount= pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
				try {
					if( con!=null) con.close();
					if( pstmt!=null) pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
