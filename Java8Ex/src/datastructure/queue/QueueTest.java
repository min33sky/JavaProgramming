package datastructure.queue;

public class QueueTest {
	public static void main(String[] args) {
		System.out.println("Queue Test");
		Queue<Integer> queue = new Queue<Integer>();
		System.out.println("queue.enqueue(1)");
		queue.enQueue(1);
		System.out.println("queue.enqueue(2)");
		queue.enQueue(2);
		System.out.println("queue.enqueue(3)");
		queue.enQueue(3);
		System.out.println("queue.enqueue(4)");
		queue.enQueue(4);
		System.out.println("queue.dequeue() : "+queue.deQueue());
		System.out.println("queue.dequeue() : "+queue.deQueue());
		System.out.println("queue.dequeue() : "+queue.deQueue());
		System.out.println("queue.dequeue() : "+queue.deQueue());
		System.out.println("queue.getSize() : "+queue.getSize());
		System.out.println("queue.dequeue() : "+queue.deQueue());
		System.out.println("queue.getSize() : "+queue.getSize());
		System.out.println("queue.enqueue(1)");
		queue.enQueue(1);
		System.out.println("queue.enqueue(2)");
		queue.enQueue(2);
		System.out.println("queue.enqueue(3)");
		queue.enQueue(3);
		System.out.println("queue.getSize() : "+queue.getSize());
		System.out.println("queue.enqueue(4)");
		queue.enQueue(4);
	}
}
