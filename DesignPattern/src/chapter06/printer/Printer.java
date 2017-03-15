package chapter06.printer;

import java.util.Random;

public class Printer {
	private boolean available = true;
	public boolean isAvailable(){
		return available;
	}
	
	public void print(String name){
		try {
			Thread.sleep(new Random().nextInt(100));
			System.out.println(name + " is using" + this.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setAvailable(true);	// 다른이가 사용 가능
	}
	
	public void setAvailable(boolean available){
		this.available = available;
	}
}
