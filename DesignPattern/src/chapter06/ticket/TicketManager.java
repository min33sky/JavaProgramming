package chapter06.ticket;
/**
 * 티켓을 발행하는 클래스
 * 싱글턴 패턴으로 구현
 * 유일한 시리얼 번호를 생성한다.
 * @author Heo-MH
 *
 */
public class TicketManager {
	private static TicketManager instance;
	private int limits;	// 발행할 수 있는 티켓의 수
	private int count;	// 발행한 티켓의 수 (티켓의 일련번호)
	
	private TicketManager(){
		count = 0;
	}
	
	// 오직 하나의 티켓 발행기를 생성함
	public synchronized static TicketManager getInstance(){
		if(instance == null){
			instance = new TicketManager();
		}
		return instance;
	}
	
	// 발행할 수 있는 티켓의 수 설정
	public synchronized void setTicketLimits(int limits){
		this.limits = limits;
	}
	
	// 티켓을 결정해서 가져오기
	public synchronized Ticket getTicket(){
		if(this.count < this.limits){
			return new NormalTicket(++this.count);
		}
		
		return new NullTicket();
	}

}
