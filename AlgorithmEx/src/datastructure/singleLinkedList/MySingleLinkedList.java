package datastructure.singleLinkedList;

public class MySingleLinkedList<T> {
	
	public Node<T> head;
	public int size;
	
	public MySingleLinkedList(){
		head = null;
		size = 0;
	}
	
	public void addFirst(T item){
		if(head == null){
			Node<T> newNode = new Node<T>(item);
			head = newNode;
		}else{
			Node<T> newNode = new Node<T>(item);	// T : type parameter
			newNode.next = head;
			head = newNode;
			size++;
		}
	}
	
	public void addAfter(Node<T> before, T item){
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}
	
	public void add(int index, T item){
		if(index < 0 || index > size)
			return;
		
		if(index == 0){
			addFirst(item);
		}else{
			Node<T> current = getNode(index-1);
			addAfter(current, item);
		}
		
	}
	
	public T removeFirst(){
		if(head == null)
			return null;
		
		T data = head.data;
		head = head.next;
		size--;
		return data;
	}
	
	public T removeAfter(Node<T> before){
		if(before.next == null){
			return null;
		}
		T temp = before.next.data;	// 삭제당한 데이터
		before.next = before.next.next;
		size--;
		return temp;
	}
	
	public T remove(int index){
		if(index < 0 || index >= size)
			return null;
		if(index == 0){
			return removeFirst();
		}
		Node<T> prev = getNode(index-1);
		return removeAfter(prev);
	}
	
	public T remove(T item){
		Node<T> cur = head;
		Node<T> prev = null;
		while(cur != null && !cur.data.equals(item)){
			prev = cur;
			cur = cur.next;
		}
		if(cur == null){
			return null;
		}
		if(prev == null){
			return removeFirst();
		}
		return removeAfter(prev);
	}
	
	public int indexOf(T item){	// search
		
		
		Node<T> cur = head;
		int index = 0;
		while(cur != null){
			if(cur.data.equals(item))
				return index;
			cur = cur.next;
			index++;
		}
		return -1;
	}
	
	public Node<T> getNode(int index){
		if(index < 0 || index >= size){
			return null;
		}
		Node<T> current = head;
		for(int i=0; i<index; i++){
			current = current.next;
		}
		return current;
	}
	
	public T get(int index){
		if(index < 0 || index >= size)
			return null;
		return getNode(index).data;
	}
	
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday");	// M, S, F
		list.add(2, "Tuesday");	// M, S, T, F
		
		String str = list.get(2);	// str = "Tuesday"
		list.remove(2);				// M, S, F
		int pos = list.indexOf("Friday");	// pos = 2
		
	}
}
