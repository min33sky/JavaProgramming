package algo.interview.chap01;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * page 219
 * 문자열에 포함된 문자들이 전부 유일한지 검사
 */
public class IsUniqChars {
	
	public boolean solution(String str){
		// assume characters are ASCII, total 256 characters
	    // if the string is greater than 256, there is duplicate
		if(str.length()>256)
			return false;
		
		// initialize boolean array
		boolean[] arr = new boolean[256];
		
		for(int index = 0; index < str.length(); index++){
			int val = str.charAt(index);
			// if boolean array is true, then there is duplicate
			if(arr[val] == true){
				return false;
			}
			// if the value in array is False, the value is not duplicate yet
			arr[val] = true;
		}
		
		return true;
	}
	
	@Test
	public void test1(){
		assertTrue(solution("abcde"));
	}

	@Test
	public void test2(){
		assertTrue(solution("abcda"));
	}
}
