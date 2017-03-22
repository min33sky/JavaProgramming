package datastructure.linkedlist;
/*
 * LinkedList
 */
public class LinkedList<E> {
	Node<E> head;		// Head Node
	int size;			// List Size
	
	/*
	 * 제일 마지막에 노드 삽입
	 */
	public void add(E element){
		Node<E> newNode = new Node<E>(element);
		if(head == null){
			head = newNode;
		}else{
			Node<E> cur = head;
			while(cur.next != null){
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}
	
	/*
	 * 지정한 인덱스에 노드 삽입
	 */
	public void add(int index, E element){
		Node<E> newNode = new Node<E>(element);
		if(index == 0){
			newNode.next = head;
			head = newNode;
		}else{
			Node<E> cur = head;
			while(index > 1){
				cur = cur.next;
				index--;
			}
			newNode.next = cur.next;
			cur.next = newNode;
		}
	}
	
	/*
	 * 노드 삭제
	 */
	public void remove(int index){
		Node<E> temp = head;
		if(index == 0){
			head = temp.next;
			temp = null;
		}else{
			while(index > 1){
				temp = temp.next;
				index--;
			}
			if(temp.next.next == null){
				temp.next = null;
			}else{
				temp.next = temp.next.next;
			}
		}
	}
	
	/*
	 * 해동 인덱스의 노드 얻기
	 */
	public Node<E> get(int index){
		Node<E> cur = head;
		while(index > 0){
			cur = cur.next;
			index--;
		}
		return cur;
	}
	
	/*
	 * 연결리스트 크기 제공
	 */
	public int size(){
		if(head == null){
			size = 0;
		}else{
			size = 1;
			Node<E> cur = head;
			while(cur.next != null){
				size++;
				cur = cur.next;
			}
		}
		return size;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if(head == null){
			sb.append("리스트에 값이 없습니다.");
		}else{
			sb.append("LinkedList : " + head.data);
			
			Node<E> cur = head;
			while(cur.next != null){
				cur = cur.next;
				sb.append(" " + cur.data );
			}
		}
		return sb.toString();
	}
}
