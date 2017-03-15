package chapter06.printer;

public class UserThread extends Thread {
	private Printer myPrinter;
	
	public UserThread(String name){
		super(name);
	}

	@Override
	public void run() {
		PrinterManager mgr = PrinterManager.getInstance();
		myPrinter = mgr.getPrinter();
		myPrinter.print(getName());
	}
	
	

}
