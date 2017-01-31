package designpattern.proxyPattern;

/*
 * 프록시를 이용한 호출
 */
public class ClientWithProxy {
	public static void main(String[] args) {
		IService proxy = new Proxy();
		System.out.println(proxy.runSomething());
	}
}
