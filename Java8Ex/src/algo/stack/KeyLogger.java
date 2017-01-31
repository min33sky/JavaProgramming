package algo.stack;

import java.util.Scanner;

import datastructure.stack.Stack;

/*
 * 키로거 프로그램 (https://www.acmicpc.net/problem/5397)
 */
public class KeyLogger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		sc.nextLine();	// nextInt()후에 개행문자가 남아있기 때문에 개행문자를 미리 읽어준다.
		
		for (int i = 0; i<count; i++) {
			String input = sc.nextLine();
			System.out.println(solve(input));
		}
	}

	public static String solve(String temp) {
		Stack<Character> resultStack = new Stack<Character>();
		Stack<Character> tempStack = new Stack<Character>();
		char[] insertArray = temp.toCharArray();	// String.toCharArray() ==> String -> char[]
		
		for (int i = 0; i < insertArray.length; i++) {
			if (insertArray[i] == '<') {
				if (resultStack.peek() != null) {
					tempStack.push(resultStack.pop());
				}
			} else if (insertArray[i] == '>') {
				if (tempStack.peek() != null) {
					resultStack.push(tempStack.pop());
				}
			} else if (insertArray[i] == '-') {
				if (resultStack.peek() != null) {
					resultStack.pop();
				}
			} else {
				resultStack.push(insertArray[i]);
				
			}
		}
		while (tempStack.peek() != null) {
			resultStack.push(tempStack.pop());
		}
		
		// 역순으로 출력
		while(resultStack.peek() != null){
			tempStack.push(resultStack.pop());
		}
		return tempStack.toString();
	}
}

