package time_date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 시간 비교하기
 * : 시,분을 초로 변환해서 비교
 */
public class TimeComparison {
	public static void main(String[] args) {
		String time1 = "07:10:52";
		String time2 = "14:20:50";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		String time3 = sdf.format(date);
		System.out.println("Current Time : " + time3);
		
		String[] t1 = time1.split(":");
		String[] t2 = time2.split(":");
		String[] t3 = time3.split(":");
		
		int sum1 = switchSeconds(t1);
		int sum2 = switchSeconds(t2);
		int sum3 = switchSeconds(t3);

		if(compareTime(sum1, sum2)){
			System.out.println("Time1 later than Time2");
		}else{
			System.out.println("Time2 later than Time1");
		}
		
		String diffTime = diffrenceTime(sum1, sum2);
		System.out.println("시간 차이 : " + diffTime);
	}

	/* 시간 차이 구하기 */
	private static String diffrenceTime(int time1, int time2) {
		int sum = 0;
		
		if(time1 > time2){
			sum = time1 - time2;
		}else{
			sum = time2 - time1;
		}
		
		int hour = sum / 3600;
		int minute = (sum % 3600) / 60;
		int seconds = (sum % 3600) % 60;
		
		return hour+"시"+minute+"분"+seconds+"초";
	}

	/* 시간 비교 */
	private static boolean compareTime(int sum1, int sum2) {
		return sum1-sum2 > 0;
	}

	/* 시간을 초로 바꾸는 메소드 */
	private static int switchSeconds(String[] time) {
		int sum = 0;
		
		for(int i=0; i<time.length; i++){
			switch(i){
			case 0:	// 시
				sum += Integer.parseInt(time[i]) * 3600;
				break;
			case 1:	// 분
				sum += Integer.parseInt(time[i]) * 60;
				break;
			case 2:	// 초
				sum += Integer.parseInt(time[i]);
				break;
			}
		}
		return sum;
	}
}
