package algo.problem.solving1;

import java.util.Scanner;

/*
 * 숫자 맞추기
 */
public class Sec02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int randomNumber = (int) (Math.random()*10);
		System.out.println(randomNumber);
		System.out.println("0부터 9까지의 숫자를 입력하세요");
		
		while(true){
			System.out.print("["+ count + "번째 도전] : ");
			int number = sc.nextInt();
			if(number == randomNumber){
				System.out.println("우와! 정확하다. " + count + "번째 만에 맞췄어!!");
				break;
			}else if(number > randomNumber){
				System.out.println(number + "보다 작습니다.");
			}else if(number < randomNumber){
				System.out.println(number + "보다 큽니다.");
			}
			count++;
		}
	}
}
