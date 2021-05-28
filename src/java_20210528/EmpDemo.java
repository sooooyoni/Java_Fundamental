package java_20210528;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		/*
		EmpDto dto =new EmpDto(9003,"KIM1", "MANAGER1",7839,null,60000.0,50000.0,30);
		boolean success=dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		*/
		/*
		boolean success = dao.update(dto);
		if(success) {
			System.out.println("update 성공");
		}else {
			System.out.println("update 성공");
		}
		*/
		/*
		boolean success = dao.delete(9003);
		if(success) {
			System.out.println("delete 성공");
		}else {
			System.out.println("delete 실패");
		}
		*/
		ArrayList<EmpDto> list = dao.select(0,10);
		for(EmpDto dto : list) {
			System.out.printf("%d, %S, %S, %d, %s, %.1f, %.1f, %d %n", 
					dto.getNo(), dto.getName(), dto.getJob(), dto.getMgr(), 
					dto.getHiredate(), dto.getSal(),dto.getComm(), dto.getDeptNo());
		}
	}
}
