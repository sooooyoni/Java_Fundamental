package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		//java.lang.NumberFormatExceotion=>에외처리를 해야함
		//aaaa1 => 예외처리를 해야함
		//12.34=>코드를 변경해야함
		int i =Integer.parseInt("1111");
		System.out.println(i);
		
		//java.lang.NumberFormatExceotion=>에외처리를 해야함
		double d = Double.parseDouble("12.34");//12.34a
		System.out.println(d);
		//java.lang.ArrayIndexOutOfBoundsException
		//Index 4 out of bounds for length 4
		//배열의 범위를 벗어나면 발생하는 예외
		//개발자의 코딩 잘못이므로 예외처리 하지 않는다
		//예외처리는 사용자로부터 입려받는 경우만
		int[] a= {1,2,3,4};
		System.out.println(a[3]);//a[4]
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);//auto-boxing
		//java.lang.IndexOutOfBoundsException
		//Index 1 out of bounds for length 1
		//Collection에서 범위를 벗어나면 발생
		System.out.println(list.get(0));//list.get(1)
		
		// java.lang.NullPointerException
		//Cannot invoke "String.length()" because "str" is null
		//객체를 생성하지 않고 메서드를 사용하면 발생하는 예외 
		String str = "hello";//null
		System.out.println(str.length());
		
		// java.lang.ArithmeticException: 
		// / by zero
		int b=10;
		int c=0;
		System.out.println(b/c);
	}
}
