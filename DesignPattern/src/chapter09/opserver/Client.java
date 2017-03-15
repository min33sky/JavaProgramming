package chapter09.opserver;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3); // 3개 출력
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5); // 5개 출력
		MinMaxView minMaxView = new MinMaxView(scoreRecord);

		// 3개 목록 DataSheetView를 ScoreRecord에 Observer로 추가함
		scoreRecord.attach(dataSheetView3);
		// 5개 목록 DataSheetView를 ScoreRecord에 Observer로 추가함
		scoreRecord.attach(dataSheetView5);
		// MinMaxView를 ScoreRecord에 Observer로 추가함
		scoreRecord.attach(minMaxView);
		
		
		for(int index=1; index<=5; index++){
			int score = index * 10;
			System.out.println("Adding " + score);
			scoreRecord.addScore(score);
		}
		
		scoreRecord.detach(minMaxView);
		scoreRecord.detach(dataSheetView3);
		scoreRecord.detach(dataSheetView5);
		
		System.out.println("========= 추가 ==========");
		StatisticsView statisticsView = new StatisticsView(scoreRecord);
		scoreRecord.attach(statisticsView);
		for(int index=1; index<=5; index++){
			int score = index * 10;
			System.out.println("Adding " + score);
			scoreRecord.addScore(score);
		}
		
		
	}
}
