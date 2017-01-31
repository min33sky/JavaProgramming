package algo.problem.solving3;

import static org.hamcrest.CoreMatchers.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 최대 연속 부분합
 */
public class Sec04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		int testCases = Integer.parseInt(br.readLine());
		for(int i=0; i<testCases; i++){
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];
			String[] temp = br.readLine().split(" ");
			for(int j=0; j<size; j++){
				arr[j] = Integer.parseInt(temp[j]);
			}
			continuousAdd(arr);
		}
	}

	private static void continuousAdd(int[] arr) {
		int sum = 0;
		int solution = 0;
		int start = 0;
		int end = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
			if(solution < sum){
				solution = sum;
				end = i;
			}
			// 연속합이 0보다 작으면 그 전의 원소들은 무시하고 합을 0으로 초기화
			if(sum<0){
				sum=0;
				start=i+1;
			}
		}
		System.out.println("최대 연속 합 : " + sum);
		System.out.println("최대 연속 구간 : " + (start+1) + "-" + (end+1));
	}
}
