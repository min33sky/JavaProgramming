package singleton;

/*
 * Singleton Pattern
 */
public class Main {
	public static void main(String[] args) {
		/*
		 * Get Instance
		 */
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();

		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		/*
		 * speaker1.address = speaker2.address
		 */
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
} 
