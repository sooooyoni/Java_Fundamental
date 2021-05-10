package java_20210430;

public class CallDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1.1년 1월 1일은 월요일 2.1년 365일 이고, 윤년은 366일 -2월 29일 3. 윤년은 4년마다 발생하고 그중에서
		 * 100배수 제외하고, 400배수는 제회하지 않는다 4.2021년 4월 30일은 무슨요일일까요? 힌트)2020년과 1-3월까지 총일수,
		 * 30을 더해서 7로 나눈 나머지가 1이면 웡요일,.....
		 */
		int year = 2021;
		int month = 4;
		int day = 30;

		// 2020년까지 총일수
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		//totalcount = totalcount + 31 + 28 + 31 + day;
		
		sum +=  31 + 28 + 31 + day;
		int a = sum % 7;
		String message = "";
		if (a == 1) {
			message = "월요일";
		} else if (a == 2) {
			message = "화요일";
		} else if (a == 3) {
			message = "수요일";
		} else if (a == 4) {
			message = "목요일";
		} else if (a == 5) {
			message = "금요일";
		} else if (a == 6) {
			message = "토요일";
		} else if (a == 0) {
			message = "일요일";
		}
	System.out.printf("%d년 %d월 %d일 %s입니다.", year, month, day, message);
	}
}