package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("red", "apple");
		hashMap.put("yellow", "banana");
		hashMap.put("green", "melon");
		hashMap.put("ang", "gimochi");
		
		String receiveStr = hashMap.get("yellow");
		String deleteStr = hashMap.remove("green");
		
		System.out.println("꺼낸 데이터 : " + receiveStr);
		System.out.println("삭제 데이터 : " + deleteStr);
		
		System.out.println();
		System.out.println("KeySet");
		
		// KeySet
		Iterator<String> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println(key + " : " + hashMap.get(key));
		}
		
		System.out.println();
		System.out.println("EntrySet");
		// EntrySet
		Iterator<Entry<String, String>> it = hashMap.entrySet().iterator();
		while(it.hasNext()){
			String key = it.next().getKey();
			String val = hashMap.get(key);
			System.out.println(key + " : " + val);
		}
	}
}
