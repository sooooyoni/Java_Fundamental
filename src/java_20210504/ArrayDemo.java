package java_20210504;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언, 생성
		int[] a1 = new int[4];

		// 배열할당
		a1[0] = 100;
		a1[1] = 200;
		a1[2] = 300;
		a1[3] = 400;

		// 배열출력
		for (int i = 0; i < 4; i++) {
			int temp = a1[i];
			System.out.println(temp);

		}
		// 배열 선언, 생성, 할당
		int[] b = { 100, 200, 300, 400 };

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
		int[] monthArray1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 9월15일까지 일수를 구하세요
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += monthArray1[i];

		}
		sum += 15;

		System.out.println("총일수의 합은" + sum);
		
		
		int year = 2021;
		int month = 4;
		int day = 30;
		
		// 2020년까지 총일수
		int totalCount = (year - 1) * 365
											+ (year - 1)/4
											- (year - 1)/100
											+ (year - 1)/400;
		// totalcount = totalcount + 31 + 28 + 31 + day;

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean isLeafYear =  year%4==0 && year%100 !=0 || year%400==0;
		
		
		
		if(isLeafYear)
		{
			monthArray[1] = 29;
		}for(int i = 0;i<month-1;i++)
		{
			totalCount += monthArray[i];
		}
		
		totalCount+=day;
		int a = totalCount % 7;
		String message = "";if(a==1)
		{
			message = "월요일";
		}else if(a==2)
		{
			message = "화요일";
		}else if(a==3)
		{
			message = "수요일";
		}else if(a==4)
		{
			message = "목요일";
		}else if(a==5)
		{
			message = "금요일";
		}else if(a==6)
		{
			message = "토요일";
		}else if(a==0)
		{
			message = "일요일";
		}System.out.printf("%d년 %d월 %d일 %s입니다.",year,month,day,message);

	
}}
