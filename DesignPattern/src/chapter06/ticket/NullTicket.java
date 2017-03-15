package chapter06.ticket;

/**
 * 무효 티켓
 * @author Heo-MH
 *
 */
public class NullTicket implements Ticket {

	@Override
	public int getTicketNum() {
		return 0;
	}

}
