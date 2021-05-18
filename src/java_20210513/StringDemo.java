package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		char[] c= {'h','e','l','l','o'};
		String str = new String(c);
		System.out.println(str);
		//문자열중에 특정문자 하나만 반환하는 메서드
		//index는 0부터시작
		char c1 = str.charAt(1);
		System.out.println(c1);
		//문자열 연결하는 메서드
		str=str.concat("123");
		System.out.println(str);
		
		
		str =new String("abc.zip");
		//.endsWith(String msg) => msg문자열의 끝이 같으면 true 다르면 false
		if (str.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		}else if(str.endsWith("doc")) {
			System.out.println("워드문서입니다.");
		
		}else{
			System.out.println("파일입니다.");		}
	
		//.startsWith(String msg) => msg문자열의 시작이 같으면 true 다르면 false
		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		if(path.startsWith("/news")) {
			System.out.println("뉴스페이지입니다.");
		}else if(path.startsWith("/sport")) {
			System.out.println("스포츠페이지입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equals()=>문자열비교
		String m1=new String("hello");
		String m2=new String("hello");
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
	
		//equalsIgnoreCase()=>대소문자구분하지 않고 비교
		//같지 않은 이유는 블랭크때문
		String m3=new String("hello ");
		String m4=new String("hello");
		if(m3.equalsIgnoreCase(m4)) {
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
		
		//getBytes()=>문자열을 바이트 배열로 변환하는 메서드
		String m5=new String("안녕하세요");
		byte[] b= m5.getBytes();
		System.out.println(b.length);
		for(byte temp:b) {
			System.out.println(temp);
		}
		
		String m6=new String("111111-1111111");
		int index=m6.indexOf("-");
		System.out.println(index);
		String m7 =new String("ab.c.zip");
		int lastIndexOf=m7.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
		System.out.println(m6.substring(0,m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1));
		//lastIndexOf를 더 많이 쓴다
		System.out.println(m7.substring(0,m7.lastIndexOf(".")));
		System.out.println(m7.substring(m7.lastIndexOf(".")+1));
		
		String m8= new String ("010-0000-1111");
		System.out.println(m8.substring(0,m8.indexOf("-")));
		System.out.println(m8.substring(m8.indexOf("-")+1,m8.lastIndexOf("-")));
		System.out.println(m8.substring(m8.lastIndexOf("-")+1));
		
		int a1= Integer.parseInt(m6.substring(0,1));
		String m9 = 123+"";
		//문자열로 바꾸는것
		String m10= String.valueOf(123);
		String m11=m8.replaceAll("-","_");
		System.out.println(m11);
		
		String m12 = new String("hello");
		String m13 = m12.toUpperCase();
		System.out.println(m13);
		String m14= m13.toLowerCase();
		System.out.println(m14);
		
		String[] temp = m8.split("-");
		for(String value : temp) {
			System.out.println(value);
		}
		double d=12345.345;
		String m15=String.format("%,.2f", d);
		System.out.println(m15);
		System.out.format("%s%n",m15);
}
}

