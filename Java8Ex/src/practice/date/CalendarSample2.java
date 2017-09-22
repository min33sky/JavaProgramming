package practice.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarSample2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	// 날짜를 생성한다.
		cal.set(Calendar.DAY_OF_MONTH, 1);		// 1일로 설정
		// 출력용으로 Calendar 클래스에서 Date를 얻는다.
		Date nextMonth = cal.getTime();
		System.out.println(nextMonth);
	}
}
