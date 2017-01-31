package datastructure.queue;
/*
 * Queue
 */
public class Queue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int count;	// Queue에 저장된 데이터 수
	
	public void enQueue(E data){
		Node<E> newNode = new Node<E>(data);
		if(front == null){
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
		count++;
	}
	
	public E deQueue(){
		if(isEmpty()){
			return null;
		}
		Node<E> temp = front;
		if(temp.next == null){
			front = null;
			rear = null;
		}else{
			front = temp.next;
		}
		count--;
		return temp.data;
		
	}
	
	public int getSize(){
		return count;
	}
	
	public boolean isEmpty(){
		return front == null;
	}
	
	class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data){
			this.data = data;
		}
		
	}

	public E getFront() {
		if(front != null){
			return front.data;
		}
		return null;
	}

	public E getRear() {
		if(rear != null){
			return rear.data;
		}
		return null;
	}
}
