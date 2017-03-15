package chapter02;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider{
	
	private Calendar cal;

	public FakeTimeProvider(){
		cal = Calendar.getInstance();
	}

	public FakeTimeProvider(int hours){
		cal = Calendar.getInstance();
		setHours(hours);
	}
	
	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);	// 주어진 시간으로 시간 설정
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);	// 현재 시간 반환
	}

}
