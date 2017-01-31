package algo.interview.chap02;

/*
 * Page 253
 * 회문 - 링크드리스트
 */
public class Palindrome {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> rList = null;
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(1);
		
		rList = reverse(list);
		list.print();
		System.out.println();
		rList.print();
		System.out.println();
		System.out.println();
		System.out.println(isPalindrome(list, rList));
	}

	private static boolean isPalindrome(LinkedList<Integer> list, 
										LinkedList<Integer> rList) {
		Node<Integer> cur1 = list.head;
		Node<Integer> cur2 = rList.head;
		
		while(cur1 != null && cur2 != null){
			
			if(cur1.val != cur2.val){
				return false;
			}
			
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		
		return true;
	}

	private static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		
		// 리스트 복사
		LinkedList<Integer> list = copy(l);
		
		Node<Integer> cur = list.head;
		Node<Integer> prev = null;
		Node<Integer> next = cur;
		boolean result = false;
		
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		list.head = prev;
		
		return list;
	}

	private static LinkedList<Integer> copy(LinkedList<Integer> l) {
		LinkedList<Integer> list = new LinkedList<>();
		Node<Integer> cur = l.head;
		while(cur != null){
			list.add(cur.val);
			cur = cur.next;
		}
		return list;
	}
}
