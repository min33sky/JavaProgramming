package practice.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class ExchangeDateTimeSample {
	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.of(2025, Month.DECEMBER.getValue(), 1,2,3,4,567890123);
		System.out.println("-------시작 시의 시간과 날짜 --------");
		System.out.println(localDateTime1);
		
		Instant instant1 = localDateTime1.toInstant(ZoneOffset.of("+09:00"));
		
		// Instant에서 Date로 변환
		Date date = Date.from(instant1);
		System.out.println("---------- java.util.Date의 일시 ----------------");
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("---------- java.util.Calendar의 일시 ---------------");
		System.out.println(calendar);
		
		Instant instant2 = date.toInstant();
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.of("Asia/Seoul"));
		System.out.println("------------------------- java.util.Date에서 LocalDateTime으로 되돌린 값 ---------");
		System.out.println(localDateTime2);
		
		
		// Calendar에서 Instant로 변환
		Instant instant3 = calendar.toInstant();
		LocalDateTime localDateTime3 = LocalDateTime.ofInstant(instant3, ZoneId.of("Asia/Seoul"));
		System.out.println("------------------------ java.util.Calendar에서 LocalDateTime으로 되돌린 값 -----------");
		System.out.println(localDateTime3);
	}
}
