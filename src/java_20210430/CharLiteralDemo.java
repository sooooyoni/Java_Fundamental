package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '이';
		char c2 = '수';
		char c3 = '연';	
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//Alt방향키 줄이동
		//ctrl Alt 방향키아래 줄복사
		//ctrl f11 실행
		
    	char c4 = '\uc774';
		char c5 = '\uc218';
		char c6 = '\uc5f0';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.print(c6);
		
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		//문자중에 사용할 수 없는 문자는 ',\
		//사용하기 위해서는 \를 사용해야한다
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		

		//특수문자 \t \n
		
		System.out.println("안녕하세요. \n저는 이수연입니다. \n잘 부탁드립니다.");
	    System.out.println("아이디\t\t이름\t지역");
	    System.out.println("ohno3336\t이수연\t서울");
		
		
		
			
	}
}

