package chapter02;

public class Page98 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setRole(new Driver());
		person.doIt();
		person.setRole(new Worker());
		person.doIt();
	}
}
