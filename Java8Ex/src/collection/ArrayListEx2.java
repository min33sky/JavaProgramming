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
		Comparator<String> comp1 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Comparator<String> comp2 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		System.out.println("이름 내림차순 정렬");
		Collections.sort(list, comp1);
		printArray(list);
		System.out.println("글자수 오름차순 정렬");
		Collections.sort(list, comp2);
		printArray(list);
		
	}
	
	private static void printArray(List<String> list) {
		for(String s : list){
			System.out.println(s);
		}		
		System.out.println("**********************************");
	}



	public static void main(String[] args) {
		arrayListTest();
	}
}
