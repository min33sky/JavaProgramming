package practice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 날짜 데이터를 지정 서식으로 출력한다.
 * @author Heo-MH
 *
 */
public class CalendarSample4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// 출력용으로 Calendar 클래스에서 Date 클래스를 얻는다.
		Date nextMonth = cal.getTime();
		System.out.println(nextMonth);
		// 슬래시로 구분해 연월일을 출력한다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String formatedStr = sdf.format(nextMonth);
		System.out.println(formatedStr);
	
		// Parse 메서드 활용 (String -> Date)
		SimpleDateFormat ps = new SimpleDateFormat("yyyy/MM/dd");
		String date = "2011/07/19";
		try {
			Date newDate = ps.parse(date);
			System.out.println(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}
}
