package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sana");
		list.add("Momo");
		list.add("Mina");
		list.add("Nayeon");
		list.add("Tzuwi");
		list.add("Chaeyoung");
		list.add("Dahyun");
		list.add("JungYeon");
		list.add("Nayeon");
		
		list.add(2, "박진영");
		list.remove(3);
		
		// Print List
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// Contain Elements
		if(list.contains("Nayeon")){
			System.out.println("Exist");
		}else{
			System.out.println("Not Exist");
		}
		
		System.out.println("Momo's index : " + list.indexOf("Momo"));
		
		// 리스트 전체 삭제
		list.clear();
		
		if(list.isEmpty()){
			System.out.println("리스트 삭제 O");
		}else{
			System.out.println("리스트 삭제 X");
		}
	}
}
