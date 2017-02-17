package ex12.thread;

public class User2 extends Thread {
private Calculator calculator;
	
	public void setCalculator(Calculator calculator){
		this.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	public void run(){
		calculator.setMemory(50);
	}
}
