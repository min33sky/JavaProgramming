package time_date;

import java.util.Calendar;

public class DayOfWeekTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		switch(calendar.get(Calendar.DAY_OF_WEEK)){
			case Calendar.MONDAY:
				System.out.println("Monday");
				break;
			case Calendar.TUESDAY:
				System.out.println("Tuesday");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("Wednesday");
				break;
			case Calendar.THURSDAY:
				System.out.println("Thursday");
				break;
			case Calendar.FRIDAY:
				System.out.println("Friday");
				break;
			case Calendar.SATURDAY:
				System.out.println("Saturday");
				break;
			case Calendar.SUNDAY:
				System.out.println("Sunday");
				break;
		}
		
	}
}
