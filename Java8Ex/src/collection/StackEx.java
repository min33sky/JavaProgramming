package collection;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList를 Stack으로 활용
 */
public class StackEx {
	public static void main(String[] args) {
		
		LinkedList<String> stack = new LinkedList<>();
		stack.add("apple");
		stack.add("banana");
		stack.add("melon");
		
		String receiveStr = stack.removeLast();
		System.out.println("Pop Data : " + receiveStr);
		
		System.out.println("저장된 데이터 출력");
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
