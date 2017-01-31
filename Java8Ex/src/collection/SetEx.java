package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	/*
	 * TreeSet
	 */
	public static void treeSetTest(){
		TreeSet<Integer> tSet1 = new TreeSet<>();
		TreeSet<Integer> tSet2 = new TreeSet<Integer>(new Comparator<Integer>() {
			/*
			 * 내림차순 정렬
			 */
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		tSet1.add(3);
		tSet2.add(3);
		tSet1.add(1);
		tSet2.add(1);
		tSet1.add(2);
		tSet2.add(2);
		
		Iterator<Integer> itr = tSet1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		itr = tSet2.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	/*
	 * Set에 동기화 적용하기
	 */
	public static void syncSetTest(){
		Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
		syncSet.add(3);
		syncSet.add(1);
		syncSet.add(2);
		
		synchronized (syncSet) {
			Iterator<Integer> itr = syncSet.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		};
		
	}
	
	
	public static void main(String[] args) {
		treeSetTest();
	}
}
