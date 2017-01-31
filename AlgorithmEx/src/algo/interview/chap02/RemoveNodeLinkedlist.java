package algo.interview.chap02;
/*
 * Page 239
 * 연결리스트에서 중간 노드 삭제하기
 */
public class RemoveNodeLinkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Add List");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.print();

		System.out.println("Remove");
		list.remove(3);
		list.print();
		System.out.println();
		list.remove(1);
		list.print();
	}
}
