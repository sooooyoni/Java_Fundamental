package java_20210512;


public class StringDemo {
	public static String reverse(String str) {
		return"";//string은 안바뀌기 떄문에 return으로 출력해줘야한다.
				
		}
	public static void m(int a, int[]b, String s) {
		a=20;
		b[3]=4000;
		s+=123;
	}
	public static void main(String[] args) {
		String str ="beautiful";
		System.out.println("원본 : "+ str);

		String reverse="";
		for (int i = str.length()-1; i>=0 ; i--) {
			reverse+= str.charAt(i);
			}
		
			System.out.println("역순 : "+ reverse);


		
		
		int a=10;
		int[]b= {1,2,3,4,};
		String s ="abc";
		System.out.println(a+","+b[3]+","+s);
		m(a,b,s);
		System.out.println(a+","+b[3]+","+s);
	}
	
	
	
	public static void main(String[] args) {
		String str1= new String("hello");
		String str2= new String("hello");
		//선언해버리면 상수화되서 남는다 재사용할것만 선언해라! new사용해야한다!!!!!
		String str3="test";
		String str4="test";
		//문자열 두개는 equals로
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		//각은 object참조하니까
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	}
	

	
	
}
