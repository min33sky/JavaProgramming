package chapter06;
/**
 * 싱글턴 패턴의 다중 스레드 문제를 해결하자 --> 동기화 활용
 * @author Heo-MH
 *
 */
public class Printer2 {
	private static Printer2 instance;
	private int counter = 0;
	private Printer2(){}
	
	/**
	 * 인스턴스를 생성한다. - 동기화로 인스턴스가 여러개 생기는 것을 막는다.
	 * @return
	 */
	public synchronized static Printer2 getInstance(){
		if(instance == null){
			instance = new Printer2();
		}
		return instance;
	}
	
	public void print(String str){
		// counter가  스레드들의 영향을 받지 않게 하기 위해서 동기화 블럭을 사용한다.
		synchronized (this) {
			counter++;
			System.out.println(str + counter);
		}
	}
}
