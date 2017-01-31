package stack.ex;

import java.util.Stack;

/*
 * 회문 : 앞에서 읽으나 뒤에서 읽으나 같은 문장
 */
public class Palindrome {
	boolean isPalindrome(String inputStr){
		Stack<Character> stack = new Stack<>();
		char[] input = inputStr.toCharArray();	// String -> Char[] 변환
		int index = 0;
		
		// 'X'가 나올 때까지 스택에 push
		while(input[index] != 'X'){
			stack.push(input[index]);
			index++;
		}
		index++;	// 'X'는 필요없기 때문에 넘어간다.
		
		while(index < input.length){
			// 스택이 비어있으면 false
			if(stack.isEmpty()){
				return false;
			}
			// 스택에서 pop한 값과 배열에 있는값이 다르면 false
			if(input[index] != stack.pop()){
				return false;
			}
			index++;
		}
		return true;
	}
}
