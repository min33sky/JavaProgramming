package chapter06;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void print(){
		Printer printer = Printer.getInstance();
		printer.print(this.name + " print using " + printer.toString() + ".");
	}
}
