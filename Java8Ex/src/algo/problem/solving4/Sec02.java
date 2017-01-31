package algo.problem.solving4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
  계단 오르기 게임
2
6
10
20
15
25
10
20
7
13
1
15
27
29
21
20
 */
public class Sec02 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		int testCases = Integer.parseInt(br.readLine());
		for(int i=0; i<testCases; i++){
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];
			for(int j=0; j<size; j++){
				arr[j] = Integer.parseInt(br.readLine());
			}
			solve(arr);
		}
	}

	private static void solve(int[] arr) {
		int[] solution = new int[300];
		int noJumpSteps = 0;
		int oneJumpSteps = 0;
		
		// 배열 인덱스 문제를 피하기 위해 1번 인덱스부터 값을 집어넣는다.
		int[] steps = new int[arr.length+1];
		for(int i=0; i<arr.length; i++){
			steps[i+1] = arr[i];
		}
		
		// 초기화 - 처음부터 두 번째 계단까지 값 구하기
		solution[0] = 0;
		solution[1] = steps[1];
		solution[2] = steps[1] + steps[2];
		
		// 세 번째 계단부터 누적값을 계산함 (마지막 계단 밟아야함)
		for(int i=3; i<steps.length; i++){
			noJumpSteps = steps[i] + steps[i-1] + solution[i-3];
			oneJumpSteps = steps[i] + solution[i-2];
			
			// 두 가지 경우 중에서 큰 값을 선택
			if(noJumpSteps > oneJumpSteps)
				solution[i] = noJumpSteps;
			else
				solution[i] = oneJumpSteps;
			
			System.out.println("solution["+i+"] : " + solution[i]);
		}
		System.out.println();
	}
}
