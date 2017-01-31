package stack.ex;

import java.util.Stack;

public class StackReversalTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		StackReversal sr = new StackReversal();
		sr.reverseStack(stack);
		System.out.println(stack);
		
	}
}
