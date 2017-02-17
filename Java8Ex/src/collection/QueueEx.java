package collection;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList를 Queue로 활용
 */
public class QueueEx {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		/*
		 * 족발 <- apple <- banana <- melon <- strawberry
		 */
		queue.offer("apple");
		queue.offer("banana");
		queue.offer("melon");
		queue.offer("strawberry");
		queue.addFirst("족발");
		System.out.println("제거 : " + queue.removeFirst());
		
		// poll() => 첫 번째 요소(head) 가져오기 & 그 요소를 리스트에서 제거
		String receiveStr = queue.poll();
		System.out.println("꺼낸 데이터 : " + receiveStr);
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
	}
}
