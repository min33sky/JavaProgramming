package chapter06.ticket;

/**
 * 정상적인 시리얼 번호가 있는 티켓
 * @author Heo-MH
 *
 */
public class NormalTicket implements Ticket {

	private int serial_num;
	
	public NormalTicket(int num) {
		this.serial_num = num;
	}
	
	@Override
	public int getTicketNum() {
		return this.serial_num;
	}

}
