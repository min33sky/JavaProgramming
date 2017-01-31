package datastructure.queue;

import java.util.Stack;

public class QueueReversal {
	public static LinkedQueue reverseQueue(LinkedQueue queue) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()){
			stack.push(queue.dequeue());
		}
		while(!stack.isEmpty()){
			queue.enqueue((Integer)stack.pop());
		}
		return queue;
	}
}
