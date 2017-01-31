package algo.interview.chap01;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

/*
 * page 221
 * 문자열 뒤집기
 */
public class ReverseString {
	public char[] solution(String str){
		
		// use stack to solve problem
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++){
			stack.push(str.charAt(i));
		}
		
		int idx = 0;
		char[] result = new char[str.length()];
		
		// 스택이 빌 때까지 pop()
		while(!stack.isEmpty()){
			result[idx] = stack.pop();
			idx++;
		}
		
		return result;
	}
	
	public String solution1(String str){
		
		// use stack to solve problem
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++){
			stack.push(str.charAt(i));
		}
		
		int idx = 0;
		char[] result = new char[str.length()];
		
		// 스택이 빌 때까지 pop()
		while(!stack.isEmpty()){
			result[idx] = stack.pop();
			idx++;
		}
		
		return new String(result);
	}
	
	@Test
	public void test1(){
		char[] arr = "edcba".toCharArray();
		assertArrayEquals(arr, solution("abcde"));
	}
	
	@Test
	public void test2(){
		char[] arr = "qwert".toCharArray();
		assertArrayEquals(arr, solution("trewq"));
	}
	
	@Test
	public void test3(){
		assertEquals("edcba", solution1("abcde"));
	}
	
	
}
