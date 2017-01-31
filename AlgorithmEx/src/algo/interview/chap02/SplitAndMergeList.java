package algo.interview.chap02;

/*
 * Page 240
 * 특정 노드를 기준으로 연결리스트 나누기
 */
public class SplitAndMergeList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(6);
		list.add(3);
		list.add(8);
		list.add(1);
		list.add(5);
		list.add(9);
		list.print();
		
		System.out.println();
		System.out.println("List 쪼개기");
		LinkedList<Integer> newList = list.partition(5);
		newList.print();
	}
}
