package practice.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AdderTest {

	private int num1;
	private int num2;
	
	@Before
	public void setup(){
		// 테스트 초기 처리 실시
		System.out.println("테스트 초기 처리 실시");
		init();
	}
	
	public void init() {
		num1 = 1;
		num2 = 2;
	}
	
	@BeforeClass
	public static void setupClass(){
		// static 메서드이다
		System.out.println("이 클래스는 테스트 전에 한번만 실행됩니다.");
	}
	
	@After
	public void tearDown(){
		// 테스트 종료 후 처리 실시
		refresh();
	}

	public void refresh() {
		System.out.println("테스트가 종료되었습니다.");
	}

	@Test
	public void testCase() {
		Adder adder = new Adder();
		int result = adder.add(num1, num2);
		
		// 계산 결과 비교
//		assertEquals(result, 3);
		assertThat(result, is(3));
	}
	
	@Ignore
	@Test
	public void testCaseFail(){
		Adder adder = new Adder();
		int result = adder.add(num1, num2);
		
		// 계산 결과 비교
		assertEquals(result, 2);
	}

}
