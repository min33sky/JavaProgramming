package algo.etc;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 이항계수 (조합)
 * nCr = n개에서 r개를 뽑는 개수 구하기
 * nCr = n-1Cr-1 + n-1C
 * @author Heo-MH
 *
 */
public class Binomial {
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int num1 = Integer.parseInt(input.split(" ")[0]);
		int num2 = Integer.parseInt(input.split(" ")[1]);
		arr = new int[num1+1][num1+1];
		int result = binomial(num1, num2);
		int result2 = bottonUp(num1, num2);
		System.out.println(num1 + "C" + num2 + " : " + result);
		System.out.println(num1 + "C" + num2 + " : " + result2);
		
		sc.close();
	}

	/**
	 * Bottom Up 방식
	 * 2차원 배열을 그리고 좌측 위에서 우측 아래로 대각선을 그었을때
	 * 대각선 위는 생각안해도 된다. 그래서 조건에 j<=i가 들어갔고
	 * r개의 개수보다 많을 필요가 없기때문에 j<=r이다.
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static int bottonUp(int n, int r) {
		for(int i=0; i<=n; i++){
			for(int j=0; j<=i && j<=r; j++){
				if(j==0 || i==j){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		return arr[n][r];
	}

	/**
	 * Recursion 방식
	 * @param i
	 * @param j
	 * @return
	 */
	private static int binomial(int n, int r) {
		if(n==r || r==0){
			return 1;
		}else if(arr[n][r] != 0){
			return arr[n][r];
		}else{
			arr[n][r] = binomial(n-1, r-1) + binomial(n-1, r);
			return arr[n][r];
		}
	}
}
