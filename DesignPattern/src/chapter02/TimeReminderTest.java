package chapter02;

public class TimeReminderTest {
	public static void main(String[] args) {
		TimeReminder tr = new TimeReminder();
		TimeProvider tp1 = new FakeTimeProvider(23);
		TimeProvider tp2 = new RealTimeProvider();
		
		System.out.println("-- 시간 주입 --");
		tr.setTimeProvider(tp1);
		tr.reminder();
		System.out.println("-- 실제 시간 --");
		tr.setTimeProvider(tp2);
		tr.reminder();
		
	}
}
