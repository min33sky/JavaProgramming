package practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 스레드 풀 샘플
 * @author Heo-MH
 *
 */
public class ThreadPoolSample implements Runnable {
	
	// 출력 메세지 템플릿
	private static final String MSG_TEMPLATE = "출력 중입니다. [%s][%d회째]";
	
	// 스레드 명
	private final String threadName;
	
	public ThreadPoolSample(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for(int i=1; i<100; i++){
			System.out.println(String.format(MSG_TEMPLATE, threadName, i));
		}
	}
	
	public static void main(String[] args) {
		ThreadPoolSample runnable1 = new ThreadPoolSample("thread1");
		ThreadPoolSample runnable2 = new ThreadPoolSample("thread2");
		ThreadPoolSample runnable3 = new ThreadPoolSample("thread3");
		
		// 스레드가 3개인 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(runnable1);
		executorService.execute(runnable2);
		executorService.execute(runnable3);
		
		// 실행 중인 스레드가 끝나면 종료
		executorService.shutdown();
		
		try {
			if(!executorService.awaitTermination(5, TimeUnit.MINUTES)){
				// 타임아웃 후에도 아직 실행이 끝나지 않았다. 그래도 강제종료 시킨다.
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			executorService.shutdownNow();
		}
	}
}
