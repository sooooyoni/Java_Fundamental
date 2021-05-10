package java_20210429;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 컴파일 에러발생
		//byte b1 = 128;
		//정수형 리터럴(byte, short, int)은 2진수, 8진수, 10진수, 16진수가 있음
		int a1 = 128;//10진수
		int a2 = 076;//8진수
		int a3 = 0x123;//16진수
		int a4 = 0b111;//2진수
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long 리터럴은 숫자ㅣ뒤에ㅔ  l,L로 표기함
		long a5 = 2200000000l;
		
		//10진수를 표기할때 3자리 단위로 _를 사용할수 있음
		int a6 = 1_000_000;
		
		//flaot 리터럴은 숫자뒤에 f,F로 표기함
		float f1 = 123.43f;
		
		//double 리터럴은 소수전뒤애 d,D로 표기함(생략가능함)
		double d1 = 123.45;
		
		// boolean 리터럴은 true, false
		boolean isExited = false;
	
		System.out.println(a5);
		System.out.println(isExited);
		System.out.println(d1);
		System.out.println(a6);
		System.out.println(f1);
	
	}

}
