package practice.thread;

public class MultiThreadSample implements Runnable {

	/** 출력 메시지 템플릿 */
	private static final String MSG_TEMPLATE = "출력 중입니다.[%s][%d회째]";
	
	// Thread Name
	private final String threadName;
	
	public MultiThreadSample(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(String.format(MSG_TEMPLATE, threadName, i));
		}
	}
	
	public static void main(String[] args) {
		MultiThreadSample runnable1 = new MultiThreadSample("thread1");
		MultiThreadSample runnable2 = new MultiThreadSample("thread2");
		MultiThreadSample runnable3 = new MultiThreadSample("thread3");
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		Thread thread3 = new Thread(runnable3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
