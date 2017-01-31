package algo.interview.chap02;

import algo.interview.chap02.*;

/*
 * page234
 * 연결 리스트에서 중복 제거하기
 */
public class DuplicateDeleteLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(7);
		list.add(4);
		list.add(6);
		list.add(6);
		list.print();
		System.out.println();
		System.out.println("Remove Duplicated Elements");
		list.deleteDups();
		list.print();
	}
}
