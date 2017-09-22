package practice.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnsafeSample {
	public static void main(String[] args) {
		// SimpleDateFormat 클래스는 스레드 세이프하지 않다.
		DateFormat unsafeDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		// 날짜 1은 1989/03/10이다.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1989, Calendar.MARCH, 10);
		Date date1 = cal1.getTime();
		// 날짜 2는 2020/06/20이다.
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, Calendar.JUNE, 20);
		Date date2 = cal2.getTime();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++){
					try {
						String result = unsafeDateFormat.format(date1);
						System.out.println("Thread1 : " + result);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++){
					try {
						String result = unsafeDateFormat.format(date2);
						System.out.println("Thread2 : " + result);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		System.out.println("스레드 세이프하지 않은 프로그램의 검증을 시작합니다.");
		thread1.start();
		thread2.start();
	}
	
}
