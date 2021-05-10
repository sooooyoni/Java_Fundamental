package java_20210506.bb;
//import해줘야만 다른 패키지내 클래스를 쓸 수 있다.
import java_20210506.aa.Notice;
						//extends Notice 상속받기 위함.
public class NoticeDemo2 extends Notice {
	public static void main(String[] args) {
		//서로 다른 패키지의 클래스를 사용하기 위해서는
		//import 구분을 사용해야한다.
		//package=>import=>class순으로 코딩해야한다.
		Notice n1 = new Notice();
		
		n1.number=1;//public은 서로 다른 패키지에서 접근가능
		//n1.title="";//protect은 서로 다른 패키지에서 접근하려면 상속 받은 경우만
		//n1.hit=;//public은 서로 같은 패키지에서 접근가능
		//n1.regdate="";//private은 서로 같은 클래스에서만 접근가능
		
		NoticeDemo2 n2= new NoticeDemo2();
		n2.number=2;
		n2.title="";//상속받은것
		//n2.hit =10 ;
		//n2.regdate=";
		
		
		
	}
	
	
}
