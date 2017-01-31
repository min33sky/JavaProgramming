package designpattern.templateMethodPattern;

import java.util.LinkedList;

public class Stack {
	private final LinkedList<Integer> stack;
	
	public Stack(){
		stack = new LinkedList<>();
	}
	
	public Stack(final LinkedList<Integer> initialState){
		this.stack = initialState;
	}
	
	public void push(final int number){
		stack.add(0, number);
	}
	
	public Integer pop(){
		return stack.remove(0);
	}
	
	// 필터를 구현한 객체를 주입받는다
	public Stack filter(StackPredicate filter){
		LinkedList<Integer> initialState = new LinkedList<>();
		for(Integer integer : stack){
			if(filter.isValid(integer)){
				initialState.add(integer);
			}
		}
		return new Stack(initialState);
	}
}
