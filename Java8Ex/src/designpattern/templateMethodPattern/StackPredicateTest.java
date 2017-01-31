package designpattern.templateMethodPattern;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackPredicateTest {
	private Stack stack;
	
	@Before
	public void createStack(){
		stack = new Stack();
		for(int i=1; i<=10; i++){
			stack.push(i);
		}
	}
	
	// 짝수 판별해서 짝수면 스택에 넣어 반환
	@Test
	public void evenPredicate(){
		Stack filtered = stack.filter(new StackPredicate() {
			
			@Override
			public boolean isValid(int i) {
				return (i % 2) == 0;
			}
		});
		
		assertEquals(Integer.valueOf(10), filtered.pop());
		assertEquals(Integer.valueOf(8), filtered.pop());
		assertEquals(Integer.valueOf(6), filtered.pop());
	}
	
	// 아무 효과 없는 필터링
	@Test
	public void allPredicate(){
		Stack filtered = stack.filter(new StackPredicate() {
			
			@Override
			public boolean isValid(int i) {
				return true;
			}
		});

		assertEquals(Integer.valueOf(10), filtered.pop());
		assertEquals(Integer.valueOf(9), filtered.pop());
		assertEquals(Integer.valueOf(8), filtered.pop());
	}
}
