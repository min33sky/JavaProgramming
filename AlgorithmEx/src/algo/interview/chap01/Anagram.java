package algo.interview.chap01;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/*
 * page 222
 * 문자열 두 개를 입력으로 받아 그 중 하나가 다른 하나의 순열인지 판별하라
 */
public class Anagram {
	
	/*
	 * 1. 정렬을 이용
	 */
	public boolean solution1(String str1, String str2){
		
		// 두 문자열의 길이가 다르면 순열 관계가 아니다.
		if(str1.length() != str2.length())
			return false;
		
		return sort(str1).equals(sort(str2));
	}
	
	/*
	 * 문자열에 포함된 문자의 출현 횟수 비교
	 */
	public boolean solution2(String str1, String str2){
		
		// 두 문자열의 길이가 다르면 순열 관계가 아니다.
		if(str1.length() != str2.length())
			return false;
		
		// Ascii 문자 개수 : 256개
		int[] letters = new int[256];
		
		// 원본 문자열의 문자 개수를 배열에 기록
		char[] s1 = str1.toCharArray();
		for(int i=0; i<s1.length; i++){
			letters[s1[i]]++;
		}
		
		// 다른 문자열의 문자가 기존 배열에 존재하면 배열 값을 1씩 줄인다.
		char[] s2 = str2.toCharArray();
		for(int i=0; i<s2.length; i++){
			// 0보다 작다는것은 동일한 문자가 없다는 것
			if(--letters[s2[i]] < 0){
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * 정렬
	 */
	private String sort(String str) {
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}

	@Test
	public void test1(){
		assertTrue(solution1("listen", "silent"));
	}
	
	@Test
	public void test2(){
		assertTrue(solution1("abc", "def"));
	}
	
	@Test
	public void test3(){
		assertTrue(solution2("listen", "silent"));
	}
	
	@Test
	public void test4(){
		assertTrue(solution2("abc", "def"));
	}
}
