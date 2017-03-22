package practice;
/**
 * 재귀 3
 * @author Heo-MH
 *
 */
public class Code03 {
	public static void main(String[] args) {
		int[] arr = {3,6,1,2,9,7,4,5};
		System.out.println(max(arr, 0, arr.length-1));
		
		System.out.println("순차 탐색 : " + search(arr, 0, arr.length-1, 7));
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(arr2, 0, arr2.length-1, 8));
		
	}
	
	/**
	 * 순차 탐색 - 재귀 이용
	 * @param arr
	 * @param i
	 * @param j
	 * @return
	 */
	private static int search(int[] arr, int begin, int end, int target) {
		if(begin > end){				// 값이 없다.
			return -1;
		}else{
			if(arr[begin] == target){	// 값이 있다.
				return 0;
			}
			return search(arr, begin+1, end, target);
		}
	}

	/**
	 * 이진 탐색(Binary Search) : 재귀로 풀기
	 * @param arr2
	 * @param i
	 * @param j
	 * @return
	 */
	private static int binarySearch(int[] arr, int begin, int end, int target) {
		if(begin>end){	// 존재하지 않는다.
			return -1;
		}else{
			int mid = (begin + end) / 2;
			if(target == arr[mid]){			// 존재한다.
				return 0;
			}else if(target > mid){
				return binarySearch(arr, mid+1, end, target);
			}else if(target < mid){
				return binarySearch(arr, begin, mid-1, target);
			}
		}
		return -1;
	}

	/**
	 * 최대값 구하기 : 재귀를 이용
	 * @param arr
	 * @param begin
	 * @param end
	 * @return
	 */
	public static int max(int[] arr, int begin, int end){
		if(begin == end)
			return arr[begin];
		return Math.max(arr[begin], max(arr, begin+1, end));
	}
}
