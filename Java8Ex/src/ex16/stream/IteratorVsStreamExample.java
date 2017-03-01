package ex16.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("양팡", "김봉준", "흥민이","오메킴","은견이");
		
		// Iterator 이용
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("***********************");
		
		// Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
