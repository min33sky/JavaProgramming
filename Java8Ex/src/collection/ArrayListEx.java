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
		
		list.add(2, "샤발");
		list.remove(3);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		if(list.contains("Nayeon")){
			System.out.println("데이터 있음");
		}else{
			System.out.println("데이터 없음");
		}
		
		System.out.println(list.indexOf("Momo"));
		System.out.println(list.lastIndexOf("Nayeon"));
		
		// 리스트 전체 삭제
		list.clear();
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
	}
}
