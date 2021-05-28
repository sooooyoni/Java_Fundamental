package java_20210527;
	//1. member table을 객체화
	//용도 : 1.매개변수 줄일 목적 2. 테이블의 한개의 row 정보를 객체화 하기 위한 목적

public class MemberDto {

	//1.멤버테이블의 칼럼을 멤버변수로 설정한다.
	private int num; 
	private String name;
	private String addr;

	//2.디폴트 생성자 
	public MemberDto() {//default constructor = 매개변수 없는 생성자 초기화 못함!
						//매개변수 생성자를 만들기 위해서는 무조건 디폴트 생성자 생성해줘야!!!!
		super();
	}
	
	//3. 매개변수 3개짜리 생성자 
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name; 
		this.addr = addr;
	}
	
	//4.매개변수 3개의 setter/getter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
