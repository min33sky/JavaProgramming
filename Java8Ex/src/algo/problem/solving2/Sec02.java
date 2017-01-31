package algo.problem.solving2;

import java.util.Scanner;

/*
 * 하노이의 탑
 */
public class Sec02 {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이동할 원판 수를 입력하세요 : ");
		int number = sc.nextInt();
		hanoi(number, 1, 2);
		System.out.println("원판의 총 이동 횟수 : " + count +"회");
	}

	private static void hanoi(int number, int pre, int post) {
		count++;
		if(number == 1){
			System.out.println("원판 "+number+"을(를) "+pre+"에서 "+post+"로 이동한다.");
		}else{
			// 제일 밑에 원판을 제외하고 나머지를 임시 위치로 이동시킨다.
			int temp = 6 - pre - post; // 위치1+위치2+위치3 = 6
			hanoi(number-1, pre, temp);
			System.out.println("원판 "+number+"을(를) "+pre+"에서 "+post+"로 이동한다.");
			// 임시 위치에 있는 원판들을 제일 밑 원판을 제외하고 목적지로 이동시킨다.
			hanoi(number-1, temp, post);
		}
	}
}
