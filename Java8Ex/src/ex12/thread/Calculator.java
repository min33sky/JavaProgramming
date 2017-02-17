package ex12.thread;

public class Calculator {
	private int memory;
	
	public int getMemery(){
		return memory;
	}
	
	public void setMemory(int memory){
		
		/*
		 * 동기화 블록 설정
		 * 공유 객체가 객체 자신일땐 this 사용
		 */
		synchronized (this) {
			this.memory = memory;
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
