package tutorial;

import java.util.Random;

public class RandomNumber {
	public int getRandomNumber(){
		Random rand = new Random();
		
		// 10이하의 정수를 랜덤하게 반환한다.
		return rand.nextInt(10);
	}
}
