package datastrucure.linkedlist;

public class Node<E> {
	Node<E> next = null;
	E data;
	
	public Node(E data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node : " + data;
	}
}
