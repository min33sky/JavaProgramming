package practice;

/**
 * @author Heo-MH 
 * 시프트 연산자
 */
public class ShiftOperator {
	public static void main(String[] args) {
		// x << n ---> x * (2^n)
		System.out.println(8 >> 1);
		System.out.println(8 >> 2);
		System.out.println(8 >> 3);

		// x >> n ---> x / (2^n)
		System.out.println(8 << 1);
		System.out.println(8 << 2);
		System.out.println(8 << 3);
		
		// >>> ---> 부호에 상관없이 항상 0으로 채운다
		System.out.println(-8 >>> 1);
		System.out.println(-8 >> 1);

		// 맨 왼쪽의 0은 생략된다.
		String number1 = Integer.toBinaryString(-8 >>> 2);
		String number2 = Integer.toBinaryString(-8 >> 2);
		System.out.println(number1);
		System.out.println(number2);
	}
}
