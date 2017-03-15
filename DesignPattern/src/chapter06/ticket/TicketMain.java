package chapter06.ticket;

public class TicketMain {
	
	private static final int THREAD_NUM = 15;	// 사람 수
	
	public static void main(String[] args) {
		TicketManager mgr = TicketManager.getInstance();
		mgr.setTicketLimits(5);	// 발행할 수 있는 티켓을 5장으로 제한함
		UserThread[] user = new UserThread[THREAD_NUM];	// 15개의 티켓을 요구하는 사용자 스레드
		
		for(int i=0; i<THREAD_NUM; i++){
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start(); // 스레드 실행
		}
		
		
		for(int i=0; i<THREAD_NUM; i++){
			try {
				// main 쓰레드를 다른 쓰레드가 종료될 때 까지 대기 시킨다.
				user[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<THREAD_NUM; i++){
			if(user[i].getMyTicket().getTicketNum() != 0){
				System.out.println("User"+i+"-th Thread get ticket" 
							+ user[i].getMyTicket().getTicketNum());
			}
		}
	}
}
