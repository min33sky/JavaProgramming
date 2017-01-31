package algo.problem.solving2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 기약 분수 구하기
 */
public class Sec03 {
	public static void main(String[] args) throws IOException {
			FileReader fr = new FileReader("input");
			BufferedReader br = new BufferedReader(fr);
			
			String input = br.readLine();
			int count = Integer.parseInt(input);	// 구할 숫자 개수
			int fractionCount = 0; // 기약 분수 개수
			int[] arr = new int[count];
			for(int i=0; i<count; i++){
//				arr[i] = Integer.parseInt(br.readLine());
//				System.out.println(arr[i]);
				int maxNumber = Integer.parseInt(br.readLine());
				
				for(int j=1; j<=maxNumber; j++){
					for(int k=2; k<=maxNumber; k++){
						if(j<k && gcd(j,k) == 1){
							System.out.println("찾은 기약 분수 : " + j+"/"+k);
							fractionCount++;
						}
					}
				}
				System.out.println("찾은 기약 분수의 총 개수 : " + fractionCount);
			}
			
			
	}
	// 최대 공약수 구하기 = 유클리드 호제법 이용
	public static int gcd(int num1, int num2){
		if(num2 == 0){
			return num1;
		}
		return gcd(num2, num1%num2);
	}
}
