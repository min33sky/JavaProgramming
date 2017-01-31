package datastructure.queue;

import java.util.Stack;

public class QueueWithTwoStacks {
	Stack stack1;
	Stack stack2;
	
	public QueueWithTwoStacks(){
		stack1 = new Stack();
		stack2 = new Stack();
	}
	
	public boolean isEmpty(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.isEmpty();
	}
	
	public void enQueue(Object data){
		stack1.push(data);
	}
	
	public Object deQueue(){
		if(!stack2.isEmpty()){
			return stack2.pop();
		}else{
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
}
