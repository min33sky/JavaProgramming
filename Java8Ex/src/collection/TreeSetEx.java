package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> name = new TreeSet<String>();
		name.add("김봉준");
		name.add("철구");
		name.add("양팡");
		name.add("흥민이");
		name.add("오메킴");
		name.add("기뉴다");
		name.add("은견이");

		System.out.println(name.first());	// 가작 작은 객체
		System.out.println(name.last());	// 가장 큰 객체
		System.out.println(name.lower("오메킴"));	// 오메킴 바로 아래
		System.out.println(name.higher("오메킴"));	// 오메킴 바로 위

		System.out.println("******* 내림차순 ********");
		NavigableSet<String> desc = name.descendingSet();
		for(String descName : desc){
			System.out.println(descName);
		}
		
		
		System.out.println("******** 오름차순 출력 *********");
		while(!name.isEmpty()){
			System.out.println(name.pollFirst());
		}
		
	}
}
