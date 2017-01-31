package designpattern.proxyPattern;

/*
	프록시를 이용하지 않은 호출
 */
public class ClientWithNoProxy {
	public static void main(String[] args) {
		Service1 service = new Service1();
		System.out.println(service.runSomething());
	}
}
