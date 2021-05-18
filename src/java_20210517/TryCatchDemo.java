package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k+e;
		double avg = sum/2;
		return avg;
	}
	//javac TryCatchDemo.java=> compile
	//java TryCatchDemo 10 20 30 
	//Run Cinfigurations => arguments => program arguments
	//10 20은 에러 없음
	//a 20 -> java.lang.NumberFormatException / For input string: "a"
	//10-> java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
	//
	public static void main(String[] args) {
	try {
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		
		double average = getAvgs(korean, english);
		
		System.out.printf("국어와 영어의 평균 점수는 %.1f 입니다.", average);
		}catch(NumberFormatException e) {
			//catch블럭의 수향문을 만들때 2가지 형태로 코딩한다.
			//1.에러 메세지를 출력하는 방법(개발자)-개발단계	
			//2.에러메세지를 출력(사용자)-서비스단계
			//System.err.println(e.getMessage());//에러처리 프리는 err로 출력해야한다.
			System.out.println("문자말고 숫자를 넣어주세요");
		}catch(ArrayIndexOutOfBoundsException e) {
			/*에러가 발생한것을 프린트해라~~
			 * e.printStackTrace();*/
			//System.err.println(e.getMessage());//에러처리 프리는 err로 출력해야한다.
			System.err.println("인자를 2개를 필요해!");
		}finally {
			
			System.out.println("무조건 수행되는 블럭 -finally");
			
		}
	
}
}
