package algo.sorting;

import java.util.Arrays;

/**
 * 퀵 정렬 : 다듬기 코드
 * 최악의 경우 : 이미 정렬되어있을 때(마지막 원소를 피봇으로 선택하는 경우) -> n^2
 * 최선의 경우 : 항상 절반으로 분할될 때 -> nlogn
 * @author Heo-MH
 *
 */
public class QuickSort_new {
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 33, 7, 1, 12, 9, 3};
		System.out.println("원본 : " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("정렬 : " + Arrays.toString(arr));
	}

	/**
	 * 퀵 정렬
	 * @param arr
	 * @param i
	 * @param length
	 */
	private static void quickSort(int[] arr, int left, int right) {
		if(left < right){
			int pivot = partition(arr, left, right);	// 피봇 정하기
			quickSort(arr, left, pivot-1);				// 왼쪽 정렬
			quickSort(arr, pivot+1, right);				// 오른쪽 정렬
		}
		
	}

	/**
	 * 분할
	 * @param arr
	 * @param left
	 * @param right
	 * @return
	 */
	private static int partition(int[] arr, int start, int end) {
		int pivot = end;	// 피봇을 마지막 인덱스로 정한다.
		int left = start;
		int wall = start;
		
		/*
		 * left가 pivot전까지 값을 비교한다.
		 * left는 계속 증가한다.
		 * left가 pivot보다 작다면 left와 wall을 swap한 후 wall을 증가시킨다.
		 */
		while(left < pivot){
			if(arr[left] < arr[pivot]){
				swap(arr, left, wall);
				wall++;
			}
			left++;
		}
		
		// 피봇과 벽의 값을 교환한 후 피봇을 벽으로 재설정한다.
		swap(arr, wall, pivot);
		pivot = wall;
		System.out.println("Pivot Index : " + pivot);
		System.out.println("Pivot Value : " + arr[pivot]);
		return pivot;
	}
	
	/**
	 * Swap
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
