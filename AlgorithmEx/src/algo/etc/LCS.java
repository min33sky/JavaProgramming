package algo.etc;

import java.util.Stack;

/**
 * 두 문자열에서 가장 긴 공통의 글자 찾기
 * Long Common Sequence
 * 
 * BDCABA, ABCBDAB ===> BCBA
 * @author Heo-MH
 *
 */
public class LCS {
	public static int[][] arr;	
	static String str1 = "ABCBDAB";
	static String str2 = "BDCABA";
	static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) {
		arr= new int[str1.length()+1][str2.length()+1];
		
		int len = matrix(str1.length(), str2.length());
		System.out.println("LCS 길이 : " + len);
		print(arr);
		
		System.out.print("==> LCS : ");
		route(str1.length(), str2.length(), len);
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
		System.out.print("\n--> LCS : ");
		route2(str1.length(), str2.length(), len);
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
	}

	/**
	 * 뒤에서부터 경로를 추적하자.
	 * 해당 인덱스의 글자들이 같을 경우 lcs 길이를 1 줄여주고 
	 * 왼쪽 대각선 위로 이동한다.
	 * @param num1
	 * @param num2
	 * @param lcs
	 */
	private static void route(int num1, int num2, int lcs) {
		if(lcs == 0){	// 공통 문자들이 없다 -> 종료
			return;
		}else if(arr[num1][num2] == lcs){	
			// 해당 인덱스 값의 문자들이 공통 문자라면
			if(str1.charAt(num1-1) == str2.charAt(num2-1)){
//				System.out.print(str1.charAt(num1-1) + " ");
				stack.push(str1.charAt(num1-1));
				// 인덱스와 공통문자개수를 줄여준다.
				num1--;
				num2--;
				lcs--;
			}else{
				// 공통문자가 아니라면 위쪽이나 왼쪽으로 이동한다.
				if(arr[num1-1][num2] == lcs){
					num1--;
				}else{
					num2--;
				}
			}
		}
		route(num1, num2, lcs);
	}
	
	/**
	 * 재귀를 사용하지 않고 풀기
	 * @param len1
	 * @param len2
	 * @param lcs
	 */
	private static void route2(int len1, int len2, int lcs) {
		while(lcs != 0){
			if(arr[len1][len2] == lcs){
				if(str1.charAt(len1-1) == str2.charAt(len2-1)){
					stack.push(str1.charAt(len1-1));
					len1--; len2--; lcs--;
				}else if(arr[len1-1][len2] == lcs){
					len1--;
				}else if(arr[len1][len2-1] == lcs){
					len2--;
				}
			}
		}
	}

	private static void print(int[][] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	/**
	 * LCS 길이 배열
	 * 1. 문자열의 길이가 0일땐 lcs도 0이다
	 * 2. 문자열x의 i번째와 문자열y의 j번째가 같은 값일 경우 
	 *    x의 i-1번째와 y의 j-1번째까지의 lcs값 + 1이 해당 lcs값이다.
	 * 3. 다른 값일 경우에는 x의 i-1와 y의 j 그리고 x의 i,y의 j-1의 lcs중 큰값이 lcs다.
	 * @param len1
	 * @param len2
	 * @return	LCS 길이
	 */
	private static int matrix(int len1, int len2) {
		
		for(int i=0; i<=len1; i++){
			for(int j=0; j<=len2; j++){
				if(i==0 || j==0){	// 문자열의 길이가 0일때는 LCS의 값은 0이다.
					arr[i][j] = 0;
				}else{
					if(str1.charAt(i-1) == str2.charAt(j-1)){
						arr[i][j] = arr[i-1][j-1] + 1;
					}else{
						arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
					}
				}
			}
		}
		return arr[len1][len2];
		
//		for(int i=0; i<len1; i++){
//			for(int j=0; j<len2; j++){
//				if(str1.charAt(i) == str2.charAt(j)){
//					// 문자열 길이가 0일때는 값이 0이기때문에 인덱스에 1씩 더해주었다.
//					arr[i+1][j+1] = arr[i][j] + 1;	
//				}else{
//					// 두 문자열중 LCS 길이가 긴 것이 LCS값이다.
//					arr[i+1][j+1] = Math.max(arr[i][j+1], arr[i+1][j]);
//				}
//			}
//		}
		
	}
}
