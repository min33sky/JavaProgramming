package algo.queue;

import java.util.Scanner;

import datastructure.stack.Stack;

/*
 * 괄호 알고리즘 (https://www.acmicpc.net/problem/9012)
 */
public class ParenthesisTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine(); 				// 개행문자 처리
		for(int i=0; i<count; i++){
			String input = sc.nextLine();
			if(solve(input)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

	private static boolean solve(String input) {
		boolean result = true;
		Stack<Character> stack = new Stack<Character>();
		char[] arr = input.toCharArray();
		for(int i=0; i<arr.length; i++){
			if(arr[i] == '('){
				stack.push(arr[i]);
			}else if(arr[i] == ')'){
				if(stack.peek() == null){
					result = false;
					break;
				}else{
					stack.pop();
				}
			}
		}
		
		// 스택에 아직 괄호가 남아있는 경우는 false
		if(result && stack.peek() != null){
			result = false;
		}
		
		return result;
	}
}
