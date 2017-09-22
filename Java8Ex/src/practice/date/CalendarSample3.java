package practice.date;

import java.util.Calendar;
import java.util.Date;

/**
 * 날짜 데이터에서 특정 항목을 추출한다.
 * @author Heo-MH
 *
 */
public class CalendarSample3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);	// 1일로 설정
		// 출력용으로 Calendar 클래스에서 Date 클래스를 얻는다.
		Date nextMonth = cal.getTime();
		System.out.println(nextMonth);
		// 월 부분만 꺼낸다.
		int month = cal.get(Calendar.MONTH); 
		System.out.println(month + 1);	
		
	}
}
