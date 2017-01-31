package designpattern.strategyPattern;
/*
 * 전략 패턴을 이용해 Logging 인터페이스 구현하기
 */
public class Client2 {
	private final Logging logging;
	
	public Client2(Logging logging){
		this.logging = logging;
	}
	
	public void doWork(final int count){
		if(count % 2 == 0){
			logging.write("Even number: " + count);
		}
	}
	
}
