package tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;

public class RandomAdderTest {
	
	// 목 오브젝트 생성
	@Mocked private RandomNumber mockRandNumber;
	private int num;

	@Test
	public void test(){
		RandomAdder rand = new RandomAdder();
	
		// getRandomNumber()의 반환값을 2로 정의한다.
		new NonStrictExpectations() {
			{
				mockRandNumber.getRandomNumber();
				result = 2;
			}
		};
		
		// 결과는 난수이므로 예상값이 일정하지 않다.
		assertThat(rand.add(), is(4));
	}
	
	@Test
	public void testCount(){
		RandomAdder rand = new RandomAdder();
		rand.add();
		
		// 메서드 실행 횟수 검증
		new Verifications() {
			{
				mockRandNumber.getRandomNumber();
				times = 2;	// 2번 실행되면 테스트 성공
			}
		};
	}
}
