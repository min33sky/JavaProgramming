package practice;
/**
 * 재귀함수 1
 * @author Heo-MH
 *
 */
public class Code01 {
	public static void main(String[] args) {
		int result = sequentSum(10);
		System.out.println("1~10까지 합 : " + result);
		
		result = power(2, 10);
		System.out.println("2의 10제곱 : " + result);
		
		result = factorial(5);
		System.out.println("팩토리얼 : " + result);
		
		result = fibonacci(7);
		System.out.println("피보나치 7번째 값 : " + result);
		
	}

	/**
	 * 피보나치
	 * @param i
	 * @return
	 */
	private static int fibonacci(int i) {
		if(i == 1 || i == 2){
			return 1;
		}
		return fibonacci(i-1) + fibonacci(i-2);
	}

	/**
	 * 팩토리얼
	 * @param i
	 * @return
	 */
	private static int factorial(int i) {
		if(i==1){
			return 1;
		}
		return i * factorial(i-1);
	}

	/**
	 * n제곱 계산
	 * @param x
	 * @param n
	 * @return
	 */
	private static int power(int x, int n) {
		if(n==0){
			return 1;
		}
		return x*power(x,n-1);
	}

	/**
	 * 1~n까지 수의 합
	 * @param i
	 * @return
	 */
	private static int sequentSum(int i) {
		if(i==0){				// base case (재귀 종료 조건)
			return 0;	
		}
		return i + sequentSum(i-1);	// reculsive case
	}
}
