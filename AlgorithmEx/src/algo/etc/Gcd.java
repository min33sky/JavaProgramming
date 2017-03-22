package algo.etc;

import java.util.Scanner;

/**
 * 최대공약수 구하기 : 유클리드 호제법
 * m>=n인 양의 정수가 있을 때 m이 n의 배수라면 n이 최대공약수이다.
 * 배수가 아니라면 gcd(m, n) = gcd(n, m % n)
 * @author Heo-MH
 *
 */
public class Gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = euclide(num1, num2);
		System.out.println(result);
		result = simple(num1, num2);
		System.out.println(result);
	}

	private static int euclide(int num1, int num2) {
		if(num1 < num2){		// 왼쪽 수가 더 크도록 설정한다.
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 % num2 == 0){
			return num2;		// num2가 최대 공약수이다.
		}
		return euclide(num2, num1 % num2);
	}
	
	/**
	 * 위에 method를 simple화 시킨 method
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static int simple(int num1, int num2){
		if(num2 == 0){
			return num1;
		}
		return simple(num2, num1 % num2);
	}
	
}
