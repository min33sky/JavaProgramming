package algo.problem.solving1;

import java.util.Scanner;

/*
 * 임의의 숫자 배수의 개수와 합 구하기
 */
public class Sec05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~1000 사이에서 선택한 수의 배수가 몇 개고, 배수의 합은 얼마인가?");
		System.out.print("1부터 1000사이의 수 중에서 하나를 입력하세요 ==> ");
		int number = sc.nextInt();
		int count = 0;
		int sum = 0;
		int index = 1;
//		for(int i=1; i<=1000; i++){
//			if(i%number == 0){
//				sum += i;
//				count++;
//			}
//		}
		while(true){
			if(number * index > 1000)
				break;
			sum += number * index;
			count++;
			index++;
		}
		
		System.out.println("1부터 1000 사이 4의 배수의 개수 : " + count + ", 배수의 합 : " + sum);
	}
}
