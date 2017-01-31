package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("A");
		set.add("C");
		set.add("E");
		set.add("D");
		set.add("B");
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		for(int i=0; i<set.size()-1; i++){
			if(i==1){
				System.out.println(itr.next());
			}
			itr.next();
		}
		
		// 특정 요소가 포함되는지 조사
		System.out.println(set.contains("B"));
		System.out.println(set.contains("ZZZ"));
		
	}
}
