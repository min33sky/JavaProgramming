package chapter09.opserver;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	private List<Integer> scores = new ArrayList<Integer>();	// 점수를 저장하는 리스트
	
	public void addScore(int score){
		scores.add(score);	
		// 데이터가 변경되면 Subject 클래스의 notifyObservers 메서드를 호출해
		// 각 옵저버에게 데이터의 변경을 통보함.
		notifyObservers();
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
	
}
