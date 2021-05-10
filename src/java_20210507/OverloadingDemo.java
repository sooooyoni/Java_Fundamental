package java_20210507;

public class OverloadingDemo {
//OverloadingDemo 클래스에서는 printf()매세드를 4가지로 오버로딩
//Overloading의 작성규칙은
// 같은 클래스 내에서
//메서드 이름은 같아야한다.
//매게변소 갯수가 같으면 서로 다른 자료형으로 구현
	//4.매개변수 객수가 달라야한다.
	//5.접근한정자의 반환형은 같거나 달라도 무방한다.
	
	public void print(String str) {
		System.out.print(str);
	}
		public void print(int i) {
			System.out.print(i);
		}
		public void print(double b) {
			System.out.print(b);
		}
		public void print(boolean d) {
			System.out.print(d);
		}
		public static void main(String[] args) {
			OverloadingDemo demo = new OverloadingDemo();
			demo.print("이수연");
			demo.print(10);
			demo.print(true);
			demo.print(42.34);
		}
		}