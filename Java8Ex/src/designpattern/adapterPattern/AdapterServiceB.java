package designpattern.adapterPattern;

/*
 * ServiceB를 위한 변환기
 */
public class AdapterServiceB {
	ServiceB sb1 = new ServiceB();
	
	void runService(){
		sb1.runServiceB();
	}
}
