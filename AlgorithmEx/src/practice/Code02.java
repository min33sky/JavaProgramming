package practice;
/**
 * 재귀 2
 * @author Heo-MH
 *
 */
public class Code02 {
	public static void main(String[] args) {
		printCharsReverse("abcdefgh");
		System.out.println();
		printInBinary(8);
		System.out.println();
		int[] arr = {1,2,3,4,5};
		int sum = printArraySum(arr, 4);
		System.out.println("합 : " + sum);
		
	}

	/**
	 * 배열의 합구하기
	 * @param arr	
	 * @param i
	 */
	private static int printArraySum(int[] arr, int i) {
		if(i <= 0){
			return 0;
		}
		return printArraySum(arr, i-1) + arr[i-1];
	}

	/**
	 * 2진수로 출력하기
	 * @param i
	 */
	private static void printInBinary(int i) {
		if(i<2){
			System.out.print(i);
			return;
		}else{
			printInBinary(i/2);
			System.out.print(i%2);
		}
	}

	/**
	 * 문자열 뒤집기 - Recursive 이용
	 * @param string
	 * @return
	 */
	private static void printCharsReverse(String str) {
		if(str.length() == 0){
			return;
		}
		printCharsReverse(str.substring(1));
		System.out.print(str.charAt(0));
	}
}
