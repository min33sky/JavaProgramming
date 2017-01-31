package algo.interview.chap03;

import java.util.ArrayList;
import java.util.Stack;

import datastructure.stack.NewStack;

public class SetofStacks {
	ArrayList<NewStack> list = new ArrayList<>();
	
	public SetofStacks(){
		list.add(new NewStack<Integer>(3));
	}
	
	
	// push
	public void push(int v){
		NewStack last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(v);
		}else{
			System.out.println("Add New Stack");
			NewStack stack = new NewStack<Integer>(3);
			stack.push(v);
			list.add(stack);
		}
		
	}

	// pop
	public int pop(){
		NewStack last = getLastStack();
		int v = (int) last.pop();
		if(last.size() == 0){
			list.remove(list.size()-1);
		}
		return v;
	}
	// getLastStack
	private NewStack getLastStack() {
		int size = list.size();
		return list.get(size-1);
	}
	
}
