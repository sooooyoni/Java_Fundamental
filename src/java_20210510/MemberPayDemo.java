package java_20210510;

public class MemberPayDemo {
	public static void main(String[] args) {
		MemberPay m = new MemberPay();
		m.setSeq(1);
		m.setGroup(1);//정보를 은닉했기때문에 set을 통해 정보 변경
		m.setName("자바 일주일만에 완성하기");
		m.setPrice(500_000);
		m.setStatus("1");
		m.setValid(true);
		m.setSdate("2021-05-10");
		m.setEdate("2021-12-31");
		m.setRegdate("2021-05-10");
		
	   System.out.println(m.getSeq());
	   System.out.println(m.getGroup());
	   System.out.println(m.getName());	  
	   System.out.println(m.getPrice());
	   System.out.println(m.getStatus());
	   System.out.println(m.getEdate());
	   System.out.println(m.getSdate());
	   System.out.println(m.isvalid());
	   System.out.println(m.getRegdate());
	
	
}
}
