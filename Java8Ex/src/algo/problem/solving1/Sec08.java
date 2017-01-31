package algo.problem.solving1;

import java.util.Scanner;

/*
 * 재귀함수로 최대공약수 구하기
 */
public class Sec08 {
	static int count = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수를 구하는 프로그램");
		System.out.println("2개의 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = getGcd(num1, num2);
		System.out.println(num1+"와"+num2+"의 최대공약수는 : " + gcd);
	}

	private static int getGcd(int num1, int num2) {
		System.out.println(count++ +"회 실행한다.");
		if(num2 != 0){
			System.out.println("x = " + num1 + ", y = " + num2);
			return getGcd(num2, num1 % num2);
		}else{
			return num1;
		}
	}
}
