package algo.interview.chap01;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * page 225
 * 같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현
 * abbcccccccd -> a1b2c7d1
 * abc -> abc if the compression (a1b1c1) is longer than original, return original
 */
public class CompressWord {
	
	public String solution1(String str){
		// initialize
		char buf = ' ';
		int count = 1;
		char[] input = str.toCharArray();
		StringBuffer result = new StringBuffer();
		
		// process
		for(int i=0; i<input.length; i++){
			char ch = input[i];
			if(buf == ' '){
				buf = ch;
				result.append(ch);
			}else{
				// 버퍼에 있는 값과 문자가 같을 경우
				if(buf != ch){
					result.append(count);
					buf = ch;
					result.append(buf);
					count = 1;
				}else{
					count++;
				}
			}
		}
		// 루프가 끝나고 남은 카운트 처리
		result.append(count);
		
		// 원본보다 길어지면 원본 반환
		if(result.length() >= input.length)
			return str;
		
		return new String(result);
	}
	
	@Test
	public void test1(){
		assertEquals("a1b2c7d1", solution1("abbcccccccd"));
	}
	@Test
	public void test2(){
		assertEquals("a1b7c2d2", solution1("abbbbbbbccdd"));
	}
	@Test
	public void test3(){
		assertEquals("abc", solution1("abc"));
	}
	@Test
	public void test4(){
		assertEquals("aabcc", solution1("aabcc"));
	}
	
}
