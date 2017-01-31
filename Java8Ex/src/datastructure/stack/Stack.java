package datastructure.stack;

/*
 * 스택
 */
public class Stack<E> {
	Node<E> top;
	
	public void push(E data){
		Node<E> newNode = new Node<E>(data);
		if(top == null){
			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;
		}
	}
	
	public E pop(){
		if(top != null){
			Node<E> temp = top;
			E item = temp.data;
			top = temp.next;
			temp = null;
			return item;
		}
		return null;
	}
	
	public E peek(){
		if(top == null){
			return null;
		}
		return top.data;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if(top == null){
			sb.append("스택에 값이 없습니다.");
		}else{
			Node<E> temp = top;
			sb.append("Stack : " + temp.data);
			while(temp.next != null){
				temp = temp.next;
				sb.append(" " + temp.data);
			}
		}
		return sb.toString();
	}

	/*
	 * 노드
	 */
	class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data){
			this.data = data;
		}
	}
}
