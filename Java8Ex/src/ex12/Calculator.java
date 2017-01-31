package ex12;

public class Calculator {
	private int memory;
	
	public int getMemery(){
		return memory;
	}
	
	public void setMemory(int memory){
		synchronized (this) {
			this.memory = memory;
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
			
		}
	}
}
