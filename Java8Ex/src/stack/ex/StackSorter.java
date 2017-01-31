package stack.ex;

import java.util.Stack;

// 오름차순으로 스택 정렬
public class StackSorter {
	public static Stack sort(Stack stack){
		Stack result = new Stack();
		while(!stack.isEmpty()){
			int temp = (int) stack.pop();
			while(!result.isEmpty() && (Integer)result.peek() > temp){
				stack.push(result.pop());
			}
			result.push(temp);
		}
		return result;
	}
}
