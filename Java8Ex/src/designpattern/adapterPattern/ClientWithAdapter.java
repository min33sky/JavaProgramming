package designpattern.adapterPattern;

/*
 * 어댑터 패턴을 사용한 코드
 */
public class ClientWithAdapter {
	public static void main(String[] args) {
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		asa1.runService();
		asb1.runService();
	}
}
