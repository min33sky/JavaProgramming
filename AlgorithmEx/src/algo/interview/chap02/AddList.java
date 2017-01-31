package algo.interview.chap02;

/*
 * Page 243
 * 링크드리스트로 표현된 두 수의 합을 반환
 * (7->1->6) + (5->9->2) = 912
 */
public class AddList {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(7);
		list1.add(1);
		list1.add(6);
		list2.add(5);
		list2.add(9);
		list2.add(2);

		
		System.out.println(solution(list1, list2));
	}

	private static int solution(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		int carry = 0;
		int val1 = 0;
		int val2 = 0;
		Node<Integer> cur = list1.head;
		Node<Integer> p1 = list1.head;
		Node<Integer> p2 = list2.head;
		
		while(cur != null){
			val1 = p1.val;
			val2 = p2.val;
			p1.val = ((val1 + val2) % 10) + carry;
			carry = (val1 + val2) / 10;
			
			// Move Pointer
			cur = cur.next;
			p1 = p1.next;
			p2 = p2.next;
		}
		
		/*
		 * print
		 */
		cur = list1.head;
		int result = 0;
		int mul = 1;
		while(cur != null){
			result = result + (cur.val * mul);
			mul = mul * 10;
			cur = cur.next;
		}
		return result;
	}
}
