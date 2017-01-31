package designpattern.adapterPattern;

/*
 * 어댑터 패턴 미적용 코드
 */
public class ClientWithNoAdapter {
	public static void main(String[] args) {
		ServiceA sa1 = new ServiceA();
		ServiceB sb1 = new ServiceB();
		
		// 하는 일이 비슷한 메서드지만 메서드명이 다르다.
		sa1.runServiceA();
		sb1.runServiceB();
	}
}
