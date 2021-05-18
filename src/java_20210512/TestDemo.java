package java_20210512;

public class TestDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 문자열 역순(거꾸로) reverse 출력 - for문 사용해 문자열 역순 출력 실시");

		//초기 string 문자열 선언 실시
		String data = "beautiful";
		System.out.println("원본 : "+data);
		
		/*[설 명]
		 * 1. 문자열 출력 번지는 0번지부터 시작합니다 (0번지-j / 1번지-a / 2번지-v / 3번지-a)
		 * 2. data.length() : 문자열 길이로 4값을 반환합니다
		 * 3. 로직 : - for문 data.length()-1 값 즉,3부터 시작해서 
		 *         - 0값이 될때까지 
		 *         - i-- 한개씩 감소시키며 
		 *         - charAt 메소드를 사용해 특정 위치 문자열을 reverse 변수에 대입시킵니다
		 */		
		String reverse = "";
		
		for(int i=data.length()-1; 0<=i; i--) {
			reverse += data.charAt(i); //reverse 변수에 대입(문자열결합)
		}
		System.out.println("역순 : "+reverse);
	}//메인 종료

}
