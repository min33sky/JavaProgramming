package designpattern.singletonPattern;

/*
 * 싱글톤 패턴
 */
public class Singleton {
	static Singleton singletonObject;	// 정적 참조 변수
	
	private Singleton(){}	// private 생성자
	
	// 객체 반환 static 메서드
	public static Singleton getInstance(){
		if(singletonObject == null){
			singletonObject = new Singleton();
		}
		
		return singletonObject;
	}
}
