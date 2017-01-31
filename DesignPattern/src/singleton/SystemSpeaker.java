package singleton;

public class SystemSpeaker {
	/*
	 * instance field
	 */
	private static SystemSpeaker instance;
	
	/*
	 * field
	 */
	private int volume;
	
	/*
	 * Constructor - private
	 */
	private SystemSpeaker(){
		volume = 5;
	}
	
	/*
	 * return Instance
	 */
	public static SystemSpeaker getInstance() {
		if(instance == null){
			// System Speaker
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		} else {
			System.out.println("이미 생성");
		}
		
		return instance;
	}
	
	/*
	 * Getter, Setter Method
	 */
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
