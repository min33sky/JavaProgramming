package chapter02;

import java.util.Calendar;
import java.util.Date;

public class RealTimeProvider implements TimeProvider {
	
	Calendar c;
	
	public RealTimeProvider() {
		c = Calendar.getInstance();
	}

	@Override
	public void setHours(int hours) {
		c.setTime(new Date());
	}

	@Override
	public int getTime() {
		return Calendar.HOUR_OF_DAY;
	}

}
