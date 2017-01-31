package algo.interview.chap02;

import java.util.Hashtable;

public class LinkedList<E> {
	Node<E> head;
	
	// 추가
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
	
	// Remove Duplicated Value
	public void deleteDups(){
		Hashtable<E, Boolean> table = new Hashtable<E, Boolean>();
		Node<E> prev = head;
		Node<E> cur = head;
		
		while(cur.next != null){
			// 중복된 값이 있다면
			if(table.containsKey(cur.val)){
				System.out.println("Duplicated Value : " + cur.val);
				prev.next = cur.next;
			}else{
				table.put(cur.val, true);
				prev = cur;
			}
			cur = cur.next;
		}
	}
	
	// k th node value from last node
	public Node<E> nthToLast(int k){
		if(k <= 0)
			return null;
		Node<E> p1 = head;
		Node<E> p2 = head;
		
		// p2를 리스트 뒤쪽으로 k번 이동시킨다.
		for(int i=0; i<k-1; i++){
			if(p2 == null)
				return null;
			p2 = p2.next;
		}
		if(p2 == null) return null;
		
		// p1, p2를 같이 움직인다. p2가 마지막 노드에 도착하면 p1이 답이다.
		while(p2.next != null){
			p2 = p2.next;
			p1 = p1.next;
		}
		
		return p1;
	}

	/*
	 * Node Delete
	 */
	public void remove(int k){
		Node<E> cur = head;
		if(k < 1){
			throw new IndexOutOfBoundsException("Index Error!!");
		}else if(k == 1){
			head = head.next;
		}else{
			for(int i=0; i<k-2; i++){
				cur = cur.next;
			}
			cur.next = cur.next.next;
		}
	}
	
	/*
	 * 특정 수를 기준으로 노드 나누기
	 */
	public LinkedList<E> partition(Integer k){
		Node<E> cur = head;
		Node<E> temp = null;
		int count = 0;
		LinkedList<E> pre = new LinkedList<>();
		LinkedList<E> post = new LinkedList<>();
		Integer val = null;
		
		while(cur.next != null){
			count++;
			cur = cur.next;
		}
		// Initialize
		cur = head;
		
		for(int i=0; i<=count; i++){
			val = (Integer) cur.val;
			if(val == k){
				temp = cur;
			}else if(val < k){
				if(pre == null){
					pre.head = cur;
				}else{
					pre.add(cur.val);
				}
			}else if(val > k){
				if(post == null){
					post.head = cur;
				}else{
					post.add(cur.val);
				}
			}
			cur = cur.next;
		}
		
		
		Node<E> preCur = pre.head;
		while(preCur.next != null){
			preCur = preCur.next;
		}
		preCur.next = temp;
		temp.next = post.head;
		return pre;
		
	}
	
	// Print
	public void print(){
		Node<E> cur = head;
		while(cur.next != null){
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.print(cur.val + " ");
		
	}
}
