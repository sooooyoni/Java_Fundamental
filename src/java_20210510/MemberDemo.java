package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String adrr1 = m.getAdrr1();
		String adrr2 = m.getAdrr2();
		int age = m.getAge();
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);//두줄로 쓴거랑 위에랑 같음!!
		System.out.println(adrr1);
		System.out.println(adrr2);
		System.out.println(age);
		
	}
	
	/*public static void print(String name, String email, 
	 * String zipcode, String adrr1, 
	 * String adrr2, int age) {}
	 * 너무 길다 위의 Member m으로 해서*/
	
	public static void main(String[] args) {
	Member m= new Member();
	//m.name="이수연"
	m.setName("이수연");
	m.setEmail("abd@abc.com");
	m.setZipcode("09876");
	m.setAdrr1("서울시 강남구 대치동");
	m.setAdrr2("xxx");
	m.setAge(10);
	
	print(m);
	
	
	/*String name = m.getName();
	String email = m.getEmail();
	String zipcode = m.getZipcode();
	String adrr1 = m.getAdrr1();
	String adrr2 = m.getAdrr2();
	int age = m.getAge();
	 * 
	 * System.out.println(name);
	System.out.println(email);
	System.out.println(zipcode);//두줄로 쓴거랑 위에랑 같음!!
	System.out.println(adrr1);
	System.out.println(adrr2);
	System.out.println(age);*/
}

}
