package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import ex12.MThreadExample;

/*
 * 리스트 연습
 */
public class SynchronizedListEx {

	/*
	 * ArrayList 동기화 예제 코드
	 * http://docs.oracle.com/javase/6/docs/api/java/util/Collections.html#synchronizedList(java.util.List)
	 */
	public static void testMethod1(){
		List<String> syncList = Collections.synchronizedList(new ArrayList<>());
		syncList.add("사나");
		syncList.add("모모");
		syncList.add("미나");
		
		
		synchronized (syncList) {
			Iterator<String> itr = syncList.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}
	}
	
	/*
	 * 일반 ArrayList : 동기화 처리 X
	 */
	public static void testMethod2(){
		List<String> list = new ArrayList<>();
		list.add("사나");
		list.add("미나");
		list.add("모모");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ThreadA 시작");
				testMethod1();
				System.out.println("ThreadA 종료");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ThreadB 시작");
				testMethod1();
				System.out.println("ThreadB 종료");
			}
		});
		
		t1.start();
		t2.start();
	}
}
