package datastructure.queue;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class QueueReversalTest {
	public static void main(String[] args) throws Exception {
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue = QueueReversal.reverseQueue(queue);
		
		int size = queue.size();
		for(int i=0; i<size; i++){
			System.out.println(queue.dequeue());
		}
	}
	
	@Test
	public void test1() throws Exception{
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue = QueueReversal.reverseQueue(queue);
		assertThat(50, is(queue.dequeue()));
	}
}
