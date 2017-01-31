package designpattern.strategyPattern;

public class ConsoleLogging implements Logging{

	@Override
	public void write(String message) {
		System.out.println(message);
	}

}
