package javaBible_ex;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class ExpValidCheck {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		String str = new Scanner(System.in).nextLine();

		try{
			for(int i=0; i<str.length(); i++){
				char ch = str.charAt(i);
				
				if(ch == '('){
					stack.push(ch+"");
				}else if(ch == ')'){
					stack.pop();
				}
			}
			
			if(stack.empty()){
				System.out.println("괄호가 일치합니다.");
			}else{
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		}catch(EmptyStackException e){
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}
}
