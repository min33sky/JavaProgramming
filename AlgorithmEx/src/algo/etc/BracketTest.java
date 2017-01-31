package algo.etc;

import java.util.Scanner;

import datastructure.stack.CharacterStack;

/*
 * 괄호 짝 맞추기 
 */
public class BracketTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		CharacterStack stack = new CharacterStack(str.length());
		boolean isWrong = false;
		
		
		for(int loop=0; loop<str.length(); loop++){
			char ch = str.charAt(loop);
			
			switch(ch){
				case '(': case '{': case '[':
				stack.push(ch);
				break;
				
				case ')':
					if(stack.isEmpty() || stack.pop() != '(')
						isWrong = true;
					break;
				
				case '}':
					if(stack.isEmpty() || stack.pop() != '{')
						isWrong = true;
					break;
				
				case ']':
					if(stack.isEmpty() || stack.pop() != '[')
						isWrong = true;
					break;
			}
			
			if(isWrong)
				break;
		}
		
		if(stack.isEmpty() && !isWrong)
			System.out.println("정확해");
		else
			System.out.println("틀렸어");
	}
}
