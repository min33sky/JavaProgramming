package ex13.generic;

public class Person {
	String job;

	public Person(String job) {
		super();
		this.job = job;
	}

	@Override
	public String toString() {
		return job;
	}
	
}
