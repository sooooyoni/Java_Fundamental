package java_20210510.aa;
import java_20210510.Admin;//admin클래스에 public없애면 사용 못함
public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("aa11","123","abc@aacd.com",20); //admin클래스내 생성자admin에 public없애면 사용못함!!
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		//위 아래 같은것 생산자 공부하면 훨씬 편하다
		Admin a1=new Admin();
		a1.setId("aa11");
		a1.setPwd("123");
		a1.setEmail("abc@aabc.com");
		a1.setLevel(20);
	}
}
