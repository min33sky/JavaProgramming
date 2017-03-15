package chapter02;

public class TimeReminder {
	TimeProvider tProv;
	MP3 m = new MP3();
	public void setTimeProvider(TimeProvider tProv){
		this.tProv = tProv;	// 시간을 제공하는 인스턴스를 주입
	}
	
	public void reminder(){
		int hours = tProv.getTime();
		if(hours >= 22){
			m.playSong();
		}
	}
	
}
