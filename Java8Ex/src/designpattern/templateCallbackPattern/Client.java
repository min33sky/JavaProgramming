package designpattern.templateCallbackPattern;

public class Client {
	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("총! 총조종총 총! 총!");
		
		System.out.println();
		
		rambo.runContext("칼! 카가갈 칼! 칼!");
		
		System.out.println();
	}
}
