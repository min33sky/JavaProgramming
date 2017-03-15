package chapter06;

public class Printer {
	private static Printer instance;
	private Printer(){}
	
	public static Printer getInstance(){
		if(instance == null){
			instance = new Printer();
		}
		return instance;
	}
	
	public void print(String str){
		System.out.println(str);
	}
}
