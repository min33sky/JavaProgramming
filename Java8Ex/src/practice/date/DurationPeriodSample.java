package practice.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DurationPeriodSample {
	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.JUNE.getValue(), 10, 10, 10, 10, 000000000);
		LocalDateTime localDateTime2 = LocalDateTime.of(2016, Month.JULY.getValue(), 11, 11, 11, 11, 100000001);
		
		Period period = Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate());
		System.out.println("----------period 특정 항목의 차이 -----------");
		System.out.println("년차: " + period.getYears());
		System.out.println("월차: " + period.getMonths());
		System.out.println("일차: " + period.getDays());
		
		System.out.println("----------period 누적-----------");
		System.out.println("누적 월차 : " + period.toTotalMonths());
		
		Duration duration = Duration.between(localDateTime1, localDateTime2);
		System.out.println("----------duration 특정 항목의 차이 -------------");
		System.out.println("밀리초-나노초차: " + duration.getNano());
		
		System.out.println("------- duration 누적 -----------");
		System.out.println("누적 일차: " + duration.toDays());
		System.out.println("누적 시간차: " + duration.toHours());
		System.out.println("누적 분차: " + duration.toMinutes());
		System.out.println("누적 초차: " + duration.getSeconds());
		System.out.println("누적 말리초차: " + duration.toMillis());
		System.out.println("누적 나노초차: " + duration.toNanos());
		
	}
}
