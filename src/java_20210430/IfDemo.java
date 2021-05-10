package java_20210430;

public class IfDemo {

	public static void main(String[] args) {
		// run configurations>argument>program argument
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "겨울";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");

		int a = 125900;
		double d = 125234.789;
		String name = "이수연";
		// %10d는 10자리 맞춰서 써달라
		// %n은 줄바꿈
		System.out.printf("a는 %10d입니다.", a);
		System.out.printf("a는 %,d입니다.%n", a);
		System.out.printf("d는 %f입니다.%n", d);
		// %.2f소수점 2째자리까지 표시하고 셋째자리 반올림
		System.out.printf("d는 %,.2f입니다.%n", d);
		System.out.printf("저는 %s , %d , %f입니다.%n", name, a, d);

		int a1 = 100;
		String msg = "";
		if (a1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}
		System.out.println(msg);
		// 두식은 같은식
		msg = (a1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);

		
		
		
		
	}
}