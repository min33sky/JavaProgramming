package algo.sorting;

import java.util.Arrays;

/**
 * 병합 정렬 : 다듬기 코드
 * 시간복잡도 : nlogn
 * @author Heo-MH
 *
 */
public class MergeSort_New {
	public static void main(String[] args) {
		int[] arr = {8, 2, 4, 12, 1, 9, 6, 3};
		System.out.println("원본 배열 출력");
		System.out.println(Arrays.toString(arr));
		partition(arr, 0, arr.length-1);
		System.out.println("정렬 배열 출력");
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 분할 : 1개의 배열을 2개로 나눈다.
	 * @param arr
	 * @param left
	 * @param right
	 */
	private static void partition(int[] arr, int left, int right) {
		if(left < right){
			int mid = (left+right)/2;
			partition(arr, left, mid);		// 왼쪽 배열
			partition(arr, mid+1, right);	// 오른쪽 배열
			merge(arr, left, mid, right);	// 병합
		}
	}

	/**
	 * 병합 : 배열 2개를 정렬된 1개의 배열로 합친다.
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 */
	private static void merge(int[] arr, int left, int mid, int right) {
		int leftStart = left;		// 왼쪽 배열 시작점
		int rightStart = mid+1;		// 오른쪽 배열 시작점
		int tempStart = left;		// 정렬 배열 시작점
		
		int[] temp = new int[arr.length];	// 임시 배열 생성 : 병합정렬은 별도의 공간이 필요하다.
		
		// 왼쪽 배열이 오른쪽 배열보다 작으면 왼쪽 배열을 정렬 배열에 넣는다. 반대는 반대로
		while(leftStart <= mid && rightStart <= right){
			if(arr[leftStart] < arr[rightStart]){
				temp[tempStart++] = arr[leftStart++];
			}else{
				temp[tempStart++] = arr[rightStart++];
			}
		}
		
		// 아직 남아있는 배열의 값들을 정렬 배열로 옮긴다.
		while(leftStart <= mid){
			temp[tempStart++] = arr[leftStart++];
		}
		while(rightStart <= right){
			temp[tempStart++] = arr[rightStart++];
		}
		
		// 정렬된 배열의 값들을 원본 배열로 옮긴다.
		for(int i=left; i<=right; i++){
			arr[i] = temp[i];
		}
	}
}
