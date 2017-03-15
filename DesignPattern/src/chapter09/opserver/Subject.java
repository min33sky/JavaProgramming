package chapter09.opserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {	// 추상화된 변경 관심 대상 데이터
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer){ // 통보 대상을 추가함
		observers.add(observer);
	}
	
	public void detach(Observer observer){ // 통보 대상 제거
		observers.remove(observer);
	}
	
	// 통보 대상 목록, 즉 각 옵저버에게 변경을 통보함
	public void notifyObservers(){
		for(Observer o : observers){
			o.update();
		}
	}
}
