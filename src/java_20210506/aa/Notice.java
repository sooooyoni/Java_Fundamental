package java_20210506.aa;

public class Notice {
	public int number;
	protected String title;
	int hit;// 아무것도 없는게 default
	private String regdate;

	public static void main(String[] args) {
		//Notice클래스를 로딩 한것
		Notice n =new Notice();
	
		n.number=1;//public 접근가능
		n.title="공지사항 입니다.";//protect 접근 가능
		n.hit=0;//default접근가능
		n.regdate="2021-05-06";//private 접근 가능
		
	}
	
}
