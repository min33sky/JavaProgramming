package ex12.thread;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator){
		this.setName("CalculatorUser1");
		this.calculator = calculator;
	}
	
	public void run(){
		calculator.setMemory(100);
	}
}
