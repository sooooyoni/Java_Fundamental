package java_20210506.aa;

public class NoticeDemo {
public static void main(String[] args) {
	//Notice클래스를 로딩 한것
	Notice n =new Notice();
	//public,protect,default 같은 패키지에서 접근가능 private 패키지내 불가능
	n.number=1;//public 서로 다른 패키지에서 접근가능
	n.title="공지사항 입니다.";//protect 사로다른 패키지이면서 상속받은 경우만 접근 가능
	n.hit=0;//같은 패키지내에서 default접근가능
	//n.regdate="2021-05-06";//private 같은 클래스내에서 접근 가능 현재 다른 클래스라서 접근 불가능

	
}

}
