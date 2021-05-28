package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	//객체생성
	//호출
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		/*int num =12;
		String name = "김법수";
		String addr="서울";
		MemberDto dto= new MemberDto(num,name,addr);
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert성공");
		}else {
			System.out.println("insert실패");
		}*/
	
		/*int num =12;
		String name = "김법수1";
		String addr="서울1";
		MemberDto dto= new MemberDto(num,name,addr);//생성자가 있어서 한번에 초기화 가능!!!!
		boolean success = dao.update(dto);
		if(success) {
			System.out.println("update성공");
		}else {
			System.out.println("update실패");
		}*/
		
		/*int num =12;
		boolean success = dao.delete(num);
		if(success) {
			System.out.println("update성공");
		}else {
			System.out.println("update실패");
		}*/
		
		int start =0;
		int len = 10;
		ArrayList<MemberDto> list = dao.select(start, len);
		for(MemberDto dto : list) {
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.printf("%d, %s, %s %n",num,name,addr);
		}
}
}
