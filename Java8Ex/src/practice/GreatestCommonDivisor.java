package practice;

import java.util.Scanner;

/*
 * 유클리드 호제법으로 최대공약수 구하기
 * X와 Y의 최대공약수는 Y와 R(X와Y를 나눈 값의 나머지)의 최대공약수와 같다.
 */
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int gcd = getGcd(num1, num2);
		System.out.println("최대공약수 : " +  gcd);
		
	}

	private static int getGcd(int num1, int num2) {
		if(num1 < num2){
			swap(num1, num2);
		}
		System.out.println(num1 + " : " + num2);
		int result = 0;
		int remainder = num1 % num2;
		
		if(remainder == 0){	// 나머지가 0이면 num2가 최대공약수
			 result = num2;
		}else{
			num1 = num2;
			num2 = remainder;
			result = getGcd(num1, num2); // 나머지가 0이될 때까지 반복
		}
		return result;
	}

	private static void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
}
