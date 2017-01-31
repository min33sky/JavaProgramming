package algo.problem.solving3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 대칭 행렬 구하기
2
4
A B C D
8
A C B D E F G H
 */
public class Sec06 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		int testCases = Integer.parseInt(br.readLine());
		for(int i=0; i<testCases; i++){
			int lengths = Integer.parseInt(br.readLine());	// 필요없음
			String[] temp = br.readLine().split(" ");
			solve(temp);
		}
	}

	private static void solve(String[] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				String s = arr[i^j];	// 대칭 배열을 만들기 위한 핵심
				if(j == arr.length-1)
					System.out.println(s);
				else
					System.out.print(s+" ");
			}
		}
		System.out.println();
	}
}
