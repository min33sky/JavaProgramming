package practice.test;

/**
 * 윤년 판정 메서드
 * @author Heo-MH
 *
 */
public class LeapYear {
	public boolean isLeapYear(int year){
		// 판정 결과
		boolean result;
		
		// 기원전일 때는 콘솔에 출력
		if(year < 0){
			System.out.println("기원전입니다..");
		}
		
		// 윤년 판정
		if(year % 400 == 0){
			// 400으로 나누어떨어졌으므로 윤년
			result = true;
		}else if(year % 100 == 0){
			// 400으로 나누어떨어지지 않고, 100으로 나누어떨어지므로 윤년이 아니다.
			result = false;
		}else if(year % 4 == 0){
			// 400, 100으로 나누어떨어지지 않고, 4로 나누어떨어지므로 윤년
			result = true;
		}else{
			// 윤년이 아니다.
			result = false;
		}
		return result;
	}
}
