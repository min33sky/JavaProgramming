package practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeIncrement implements Runnable {

	// 선언 방법은 일반 클래스와 같다.
	public static AtomicInteger total = new AtomicInteger(0);
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			// 증가 연산에 독자적인 메서드를 사용한다.
			total.incrementAndGet();
		}
	}
	
	public static String getResult(){
		// 출력할 땐 AtomicInteger에서 int 값을 추출해 출력한다.
		return String.format("total = [%d]", total.get());
	}
	
	public static void main(String[] args) {
		Runnable runnable1 = new SafeIncrement();
		Runnable runnable2 = new SafeIncrement();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(runnable1);
		executorService.execute(runnable2);
		executorService.shutdown();
		
		try {
			if(!executorService.awaitTermination(5, TimeUnit.MINUTES)){
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			executorService.shutdownNow();
		}
		System.out.println(getResult());
	}
	
}
