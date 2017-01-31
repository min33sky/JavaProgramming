package algo.interview.chap01;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncodedSpace {
	
	public String solution(String str){
		/*
		 *  1. 원본 문자열의 앞에서부터 빈 칸의 개수를 찾는다.
		 */
		int space = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				space++;
			}
		}
		// 2. 새 배열의 길이 구하기
		int newLength = str.length() + space*3;
		char[] result = new char[newLength];
		
		/*
		 *  3. 처리하기
		 *  원본 문자열의 제일 뒤에서부터 문자를 비교하며 처리한다.
		 */
		for(int i = str.length() - 1; i >= 0; i--){
			if(str.charAt(i) == ' '){
				result[newLength-1] = '0';
				result[newLength-2] = '2';
				result[newLength-3] = '%';
				newLength = newLength - 3;
			}else{
				result[newLength-1] = str.charAt(i);
				newLength--;
			}
		}
		return new String(result);
	}
	
	
	
	@Test
	public void test1(){
		assertEquals("hey%20how%20are%20you", solution("hey how are you"));
	}
}
