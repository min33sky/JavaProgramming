package algo.problem.solving1;

import java.util.Scanner;

/*
 * 최대 공약수 구하기
 */
public class Sec03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getGCD(num1, num2));
	}

	private static int getGCD(int num1, int num2) {
		if(num1 < num2)
			getGCD(num2, num1);
		
		int result = 0;
		int remainder = num1 % num2;
	
		if(remainder == 0){
			result = num2;
		}else{
			num1 = num2;
			num2 = remainder;
			result = getGCD(num1, num2);
		}
		return result;
	}
}
