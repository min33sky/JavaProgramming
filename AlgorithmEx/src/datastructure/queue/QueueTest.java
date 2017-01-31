package datastructure.queue;

public class QueueTest {
	public static void main(String[] args) {
		
		Queue<Integer> queue1 = new Queue<>();
		Queue<Character> queue2 = new Queue<>();
		
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		System.out.println("Queue Size : " + queue1.size());
		System.out.println("Queue Size : " + queue2.size());
		System.out.println("IsEmpty? : " + queue1.isEmpty());
		System.out.println("IsEmpty? : " + queue2.isEmpty());
		
		queue1.print();
		
		System.out.println("Dequeue");
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		
		queue1.enqueue(4);
		System.out.println("Queue Size : " + queue1.size());
		
		
	}
}
