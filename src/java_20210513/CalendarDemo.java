package java_20210513;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(0, 0);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day= cal.get(Calendar.DATE);
									//HOUR은 0~12 HOUR_OF_DAY는 0~24
		int hour= cal.get(Calendar.HOUR_OF_DAY);
		int minute= cal.get(Calendar.MINUTE);
		int second= cal.get(Calendar.SECOND);

		//month는 0부터 시작-왜인지몰라... 
		System.out.printf("%d년 %d월 %d일 %n", year,month+1,day);
		System.out.printf("%d:%d:%d%n", hour, minute,second);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		StringBuffer message = new StringBuffer();
	
		if(dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if(dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if(dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if(dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if(dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if(dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if(dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다. %n", year,month+1,day,message.toString());
		System.out.println(dayOfWeek);
		//ctrl+shift+o
		
		//짤필요 없이 SimpleDateFormat
		cal.set(2004,1,13);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E요일");
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display);
		//해당월의 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
	}
}
