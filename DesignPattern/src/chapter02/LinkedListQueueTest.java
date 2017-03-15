package chapter02;

public class LinkedListQueueTest {
	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();
		queue.addQueue("양팡");
		queue.addQueue("금지");
		queue.addQueue("동지");
		queue.addQueue("흥민이");
		
		System.out.println(queue.peekQueue());
		
		queue.removeQueue();
		System.out.println(queue.peekQueue());
		
	}
}
