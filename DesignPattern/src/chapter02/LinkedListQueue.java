package chapter02;

import java.util.LinkedList;

public class LinkedListQueue {
	private LinkedList<String> queue = new LinkedList<String>();

	public boolean addQueue(String element){
		return queue.offer(element);	// 큐에 element를 추가함
	}
	
	public String removeQueue(){
		return queue.poll();	// 큐에서 가장 먼저 추가된 element를 삭제함
	}
	
	public String peekQueue(){
		return queue.peek();
	}
}
