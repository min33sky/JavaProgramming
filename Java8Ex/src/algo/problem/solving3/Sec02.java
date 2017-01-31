package algo.problem.solving3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 앞뒤가 같은 제곱
 */
public class Sec02 {
	static int maxValue = 300;
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input");
		BufferedReader br = new BufferedReader(fr);
		int testCases = Integer.parseInt(br.readLine());
		for(int i=0; i<testCases; i++){
			int solution = 0;	// 결과 개수 저장 변수
			int baseNumber = Integer.parseInt(br.readLine());
			for(int j=1; j<maxValue; j++){
				solution += makeReverseNumber(j*j, baseNumber);
			}
			System.out.println("총 개수 : " + solution);
		}
	}

	private static int makeReverseNumber(int original, int baseNumber) {
		int temp = original;
		int reverse = 0;

		while(temp != 0){
			/*
			 * 결과를 뒤집은 값 = 결과를 뒤집은 값 * 진수 값 + (원 제곱 수 % 진수 값)
			 * 원 제곱 수 = 원 제곱 수 / 진수 값
			 */
			reverse = reverse*baseNumber + (temp % baseNumber);
			temp = temp / baseNumber;
		}
		
		if(reverse == original)
			System.out.println("num_Reverse : " + reverse + ", num_original : " + original);
		
		return reverse == original ? 1 : 0;
	}
}
