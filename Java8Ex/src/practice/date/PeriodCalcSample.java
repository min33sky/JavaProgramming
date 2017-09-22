package practice.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodCalcSample {
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2015, Month.MAY.getValue(), 1);
		LocalDate localDate2 = LocalDate.of(2016, Month.JUNE.getValue(), 2);
		
		Period period = Period.between(localDate1, localDate2);	// 며칠 차이나는지 확인
		
		LocalDate localDate3 = localDate2.plus(period);	// 날짜 더하기
		
		System.out.println(localDate3);
	}
}
