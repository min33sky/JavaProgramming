package chapter09.opserver;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
	private ScoreRecord scoreRecord;
	
	public MinMaxView(ScoreRecord scoreRecord){
		this.scoreRecord = scoreRecord;
	}
	
	public void update(){
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회함
		displayMinMax(record);
	}
	
	private void displayMinMax(List<Integer> record){
		int max = Collections.max(record, null);
		int min = Collections.min(record, null);
		System.out.println("Min: " + min + " Max: " + max);
	}
}
