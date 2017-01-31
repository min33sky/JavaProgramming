package algo.interview.chap03;

import java.util.Stack;

/*
 * page 274
 * 스택 2개로 큐 만들기
 */
public class MyQueue<T> {
	Stack<T> newStack, oldStack;
	
	public MyQueue(){
		newStack = new Stack<T>();	// Push 작업
		oldStack = new Stack<T>();	// Pop, Peek 작업
	}
	
	public int size(){
		return newStack.size() + oldStack.size();
	}
	
	public void add(T value){
		/*
		 * newStack에 push한다.
		 * 이 stack은 항상 최신값을 최상단에 유지한다.
		 */
		newStack.push(value);
	}
	
	/*
	 * 원소들을 newStack에서 oldStack으로 옮긴다.
	 * oldStack에 대해 작업을 계속할 수 있도록 만들기 위해서
	 */
	private void shiftStacks(){
		if(oldStack.isEmpty()){
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
		}
	}
	
	public T peek(){
		shiftStacks();	// oldStack이 현재 항목들을 보관하도록 보장
		return oldStack.peek();	// 가장 오래된 값 반환
	}
	
	public T remove(){
		shiftStacks();
		return oldStack.pop();
	}
	
}
