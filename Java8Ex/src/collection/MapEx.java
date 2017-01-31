package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*
 * Map에 대해 알아보자
 */
public class MapEx {
	
	/*
	 * hashTable은 hashMap과 달리
	 * null값을 허용하고 동기화를 지원한다.
	 */
	public static void hashTableTest(){
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("1", 1);
		hashTable.put("3", 3);
		hashTable.put("5", 5);
		hashTable.put("2", 2);
		hashTable.put("4", 4);
		
		
		synchronized (hashTable) {
			Iterator<String> itr = hashTable.keySet().iterator();
			while(itr.hasNext()){
				System.out.println(hashTable.get(itr.next()));
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 시작");
				hashTableTest();
				System.out.println("Thread1 종료");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread2 시작");
				hashTableTest();
				System.out.println("Thread2 종료");
			}
		});
		
		t1.start();
		t2.start();
	}
}
