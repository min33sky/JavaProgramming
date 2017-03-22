package datastructure.linkedlist;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		list.add(2, 3);
		list.add(4, 30);
		
		System.out.println(list);
		
		System.out.println("List Size : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		list.remove(0);
		list.remove(3);
		
		
		System.out.println(list);
	}
}
