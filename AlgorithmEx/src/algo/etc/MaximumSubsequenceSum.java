package algo.etc;
/**
 * 최대 연속 부분수열의 합
 * 1. 수의 합을 반복적으로 구한다.
 * 2. 이 때 합이 음수이면 그 다음 수부터 다시 시작
 * 3. 합의 최대값을 도출한다.
 * @author Heo-MH
 *
 */
public class MaximumSubsequenceSum {
	public static void main(String[] args) {
		int[] arr = {-3, 3, 5, -3, -7, 9, -2, 10, -5, -2};
		System.out.println(maximumSubsequenceSum(arr));
	}

	private static int maximumSubsequenceSum(int[] arr) {
		int max = 0;
		int sum = 0;

		for(int i=0; i<arr.length; i++){
			sum += arr[i];
			if(sum > max){
				max = sum;
			}else if(sum < 0){
				sum = 0;
			}
		}
		return max;
	}
}
