package designpattern.adapterPattern;

/*
 * ServiceA를 위한 변환기
 */
public class AdapterServiceA {
	ServiceA sa1 = new ServiceA();
	
	void runService(){
		sa1.runServiceA();
	}
}
