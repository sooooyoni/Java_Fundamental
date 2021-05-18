package java_20210511;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	//overriding
	//작성규칙
	//1.반환형,메서드이름,매게변수 일치
	//2.접근한정자는 부모보다 잣이 상위이거나 같으면 된다.부모가 public이로 public
	public void play(String starcraft) {
		//super.play("badook"); 부모의 기능을 쓰고 플러스로 재정의
		System.out.println("Sub play(~) 호출");
	}
	public String toString() {
	return "서브클래스입니다.";
	}
}
