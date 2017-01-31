package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * ArrayList
 */
public class ArrayListEx2 {
	
	public static void arrayListTest(){
		List<String> list = new ArrayList<String>();
		list.add("Sana");
		list.add("Mina");
		list.add("Momo");
		list.add("Zhuhi");
		list.add("Dahyun");
		list.add("Chaeyoung");
		list.add("Nayeon");
		list.add("Jyungyeon");
		list.add("Jihyo");
	
		/*
		 * 내림차 순 정렬
		 */
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Collections.sort(list, comp);
		
		for(String s : list){
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		arrayListTest();
	}
}
