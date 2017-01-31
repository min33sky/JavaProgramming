package util;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 사용 가능한 지역 리스트
		String[] local = TimeZone.getAvailableIDs();
		
		for(int i=0; i<local.length; i++){
			System.out.println(local[i]);
		}
		
		System.out.println("타임존 적용 전 : " +cal.get(Calendar.HOUR)+"시 " +
				cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");
		
		// 타임존 설정
		TimeZone zone = TimeZone.getTimeZone("Europe/London");
		cal.setTimeZone(zone);
		
		System.out.println("타임존 적용 후 : " +cal.get(Calendar.HOUR)+"시 " +
				cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");
	}
}
