package algo.interview.chap02;

/*
 * page 237
 * 연결 리스트에서 뒤에서 K번째 값 찾기
 */
public class KthFromLastLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(7);
		list.add(4);
		System.out.println(list.nthToLast(1).val);
		System.out.println(list.nthToLast(2).val);
		System.out.println(list.nthToLast(3).val);
		System.out.println(list.nthToLast(4).val);
	}
}
