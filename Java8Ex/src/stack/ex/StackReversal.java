package stack.ex;

import java.util.Stack;

// 스택의 모든 항목의 순서 뒤집기
public class StackReversal {
	public static void reverseStack(Stack stack){
		if(stack.isEmpty()){
			return;
		}
		int temp = (int) stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, temp);
	}

	private static void insertAtBottom(Stack stack, int data) {
		if(stack.isEmpty()){
			stack.push(data);
			return;
		}
		// 기존 스택에 들어있던 값을 pop
		int temp = (int) stack.pop();
		insertAtBottom(stack, data);
		// pop한 값을 push한다.
		stack.push(temp);
	}
}
