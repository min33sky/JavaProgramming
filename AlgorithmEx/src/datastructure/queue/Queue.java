package datastructure.queue;

public class Queue<T> {
	private Node<T>	head;
	private int size;

	// Enqueue
	public void enqueue(T data){
		Node<T> newNode = new Node<T>(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
		System.out.println("Insert : " + data);
		size++;
	}

	// Dequeue
	public Node<T> dequeue(){
		if(head == null){
			throw new NullPointerException("dequeue imposible");
		}
		
		Node<T> p1 = head;
		Node<T> p2 = head.next;
		Node<T> result = null;
		
		if(p2 == null){
			result = p1;
			head = null;
			size--;
			return result;
		}else{
			while(p2.next != null){
				p1 = p1.next;
				p2 = p2.next;
			}
			result = p2;
			p1.next = null;
			size--;
			return result;
		}
		
	}

	// isEmpty
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		}
		return false;
	}
	
	// Size
	public int size(){
		return size;
	}

	// Print
	public void print(){
		Node<T> cur = head;
		while(cur.next != null){
			System.out.println(cur);
			cur = cur.next;
		}
		System.out.println(cur);
	}
}
