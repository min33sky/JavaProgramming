package chapter06.ticket;

public class UserThread extends Thread{
	private Ticket myTicket;
	
	public UserThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		TicketManager mgr = TicketManager.getInstance();
		myTicket = mgr.getTicket();
	}
	
	public Ticket getMyTicket(){
		return myTicket;
	}
}
