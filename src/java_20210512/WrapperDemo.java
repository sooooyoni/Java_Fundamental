package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {
public static void main(String[] args) {
	//ctrl+shift+o=>auto import
	//자바 1.4이전 버전에서는 primitive data type을 Collection에 저장할 수 없기 때문에 
	//primitive data type을 객체화 할 수 있는 Wrapper Class 으로 변환하여 저장해야한다. 
	//아래와 같이 1를 저장할 수 없음.
	ArrayList list = new ArrayList();
	list.add(new Integer(1));
	
	//1.primitive data type = > Wrappwer Class (생성자 이용)
	Integer i1= Integer.valueOf(10);
	Integer i2= Integer.valueOf("20");
	
	//2.Wrapper => primitive wrapper에서 연산안됨 ( intValue() )
	int i3 =i1.intValue();
	int i4 =i2.intValue();
	
	int i5= i3+ i4;
	
	//3.숫자로 구성된 String => primitive data type
	//Integer.parseInt("10");
	String s1 = "12345";
	int i6 = Integer.parseInt(s1);
	
	//4.auto-boxing : primitive data type ->wrapper class 
	Integer i7 = 10; //primitive를 refer로 넣을 수 없다
	Integer i8 = 200;
	//4.auto-boxing : wrapper class ->primitive data type 
	int i9= i7+i8;//.intValue 생략된것 

}
}
