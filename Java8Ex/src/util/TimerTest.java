package util;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer 클래스 : 실제 타이머의 기능을 수행하는 클래스
 * TimerTask 클래스 : Timer 클래스가 수행되어야할 내용을 작성하는 클래스
 */
public class TimerTest {
	public static int count = 0;
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				if(count<5){
					System.out.println("봉쥬리");
					count++;
				}else{
					timer.cancel();
				}
			}
		};
		
		// schedule(작업, 최초 시작 딜레이 : 2초, 반복 시간 : 1초)
		timer.schedule(task, 2000, 1000);
	}
}
