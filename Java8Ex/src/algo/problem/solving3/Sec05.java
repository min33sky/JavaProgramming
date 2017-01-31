package algo.problem.solving3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화물차 배치
2
10 4
75
30
100
38
50
51
52
20
81
5
1 10
3 5
6 9
8 10
5 2
67
74
10
8
81
1 5
1 3
 */
public class Sec05 {
	static int MAX = 99999;
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		int testCases = Integer.parseInt(br.readLine());
		for(int i=0; i<testCases; i++){
			String[] select = br.readLine().split(" ");
			int height = Integer.parseInt(select[0]);
			int question = Integer.parseInt(select[1]);
			int[] heightArr = new int[height];
			for(int j=0; j<height; j++){
				heightArr[j] = Integer.parseInt(br.readLine());
			}
			for(int j=0; j<question; j++){
				String[] q = br.readLine().split(" ");
				int start = Integer.parseInt(q[0]);
				int end = Integer.parseInt(q[1]);
				getHeight(heightArr, start, end);
			}
			System.out.println();
		}

	}
	
	// 주어진 영역의 최소 값을 구한다. -> 운송 트럭의 최대 최대 높이
	private static void getHeight(int[] arr, int start, int end) {
		int min = MAX;
		for(int i=start-1; i<end; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
