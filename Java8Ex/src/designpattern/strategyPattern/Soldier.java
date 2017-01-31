package designpattern.strategyPattern;

// 전략 객체를 사용하는 컨택스트
public class Soldier {
	void runContext(Strategy strategy){
		System.out.println("전투 시작");
		strategy.runStrategy();
		System.out.println("전투 종료");
	}
}
