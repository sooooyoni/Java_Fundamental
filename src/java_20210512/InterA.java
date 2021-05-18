package java_20210512;
							//interface는 다중상속 가능
public interface InterA extends InterB, InterC {
	//인터페이스의 변수는 public ststic final이 생략되어 있음
	public static final double PI =3.14;
	//인터페이스의 접근 한정자를 붙이지 않으면 public이 생략되어 있음
	//abstract 생략가능
	public abstract void mA();
	
}
