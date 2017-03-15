package javaBible_ex;

public class Ex3_7 {
	public static void main(String[] args) {
		int fahrentheit = 100;
		float original = (5F/9F) * (fahrentheit - 32);
		// 소수 셋째자리에서 반올림 
		float celcius = (int) (((5F/9F) * (fahrentheit - 32) * 100 + 0.5)) / 100F;
		
		
		System.out.println("Fahrenheit : " + fahrentheit);
		System.out.println("Celcius : " + original);
		System.out.println("Celcius : " + celcius);
	}
}
