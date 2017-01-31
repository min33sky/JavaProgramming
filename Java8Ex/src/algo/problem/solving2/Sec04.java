package algo.problem.solving2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 동전 옮기기
 */
public class Sec04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		
		int testNum = Integer.parseInt(br.readLine());
		for(int i=0; i<testNum; i++){
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			for(int j=0; j<num; j++){
				arr[j] = Integer.parseInt(br.readLine());
			}
			moveCoins(arr);
		}
		
	}

	private static void moveCoins(int[] arr) {
		// 평균 구하기
		int avg = 0;
		int sum = 0;
		int moves = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		avg = sum / arr.length;
		
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < avg){	// 평균보다 적은 주머니는 많은 쪽에서 이동이 발생
				moves += (avg - arr[i]);
				System.out.println("주머니 " + i + "의 이동횟수 : " + (avg - arr[i]));
			}
		}
		System.out.println("누적 이동 횟수 : " +  moves);
	}
}
