package java_20210510;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name="이수연";//Employee의 부모클래스인Customer의 모든 멤버변수 를 사용할 수 있음(name, phone1, phone2,phone3)
		e1.phone1="010";
		e1.phone2="011";
		e1.phone3="1234";
		e1.zipcode="12312";
		e1.adrr1="서울시 강남구";
		e1.adrr2="대치동";
		e1.id="abc";
		e1.pwd="1234";
	}
}
