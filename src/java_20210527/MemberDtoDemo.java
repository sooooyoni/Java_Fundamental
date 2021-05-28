package java_20210527;

public class MemberDtoDemo {
	public static void main(String[] args) {
		
	
	MemberDto dto1=new MemberDto();
	System.out.println(dto1.getNum());
	System.out.println(dto1.getName());
	System.out.println(dto1.getAddr());
	
	
	//디폴트생성자로 MemberDto인스턴스를 생성하면 인스턴스변수를 초기화 할 수 없기때문에 
	//아래와 같이 setXXX메서드를 일일이 호출해야함
	MemberDto dto2 = new MemberDto();
	dto2.setNum(10);
	dto2.setName("이수연");
	dto2.setAddr("대구");
	
	MemberDto dto3=new MemberDto(10,"이수연","대구");
	System.out.println(dto3.getNum());
	System.out.println(dto3.getName());
	System.out.println(dto3.getAddr());
	
	
}
	

}