package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
	try {
		//1.드라이버 로드한다.
		Class.forName("org.mariadb.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Connection con =null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	//2.데이터베이스와 연결할수 있는 Connection객체 생성
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
		//3.SQL문을 전송할 수 이쓴 PreparedStatement 객체 생성
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT num, NAME, addr ");
		sql.append("FROM member ");
		sql.append("ORDER BY num DESC ");
		sql.append("LIMIT ?,? ");
		
		pstmt=con.prepareStatement(sql.toString());
		//4.바인딩 변수 설정
		int index =1;
		pstmt.setInt(index++,0);
		pstmt.setInt(index,2);
		
		//5.SQl문을 전송(executeQurey())하여 ResultSet체를 생성.
		rs= pstmt.executeQuery();
		
		
		//6.ResultSet에서 데이터를 추출한다.->getXXX(index)
	while(rs.next()) {
		int num = rs.getInt(1);//또는 re.getInt("칼럼명")
		String name= rs.getString(2);//rs.getString("name")
		String addr=rs.getString(3);//rs.getString("addr")
		System.out.printf("%d, %s, %s, %n", num,name,addr);
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		//7.모든자원을 반납
		
			try {
				if(con!=null)con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
}
