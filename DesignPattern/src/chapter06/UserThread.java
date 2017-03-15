package chapter06;

public class UserThread extends Thread{
	public UserThread(String name){
		super(name);
	}

	@Override
	public void run() {
		Printer2 printer = Printer2.getInstance();
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + ".");
	}

	
}
