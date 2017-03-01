package ex16.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		
		Stream<String> stream = map.keySet().stream();
		stream.forEach(key -> System.out.println(map.get(key)));
		
	}
}
