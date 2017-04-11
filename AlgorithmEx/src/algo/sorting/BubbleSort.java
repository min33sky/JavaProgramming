package algo.sorting;

import java.util.Arrays;

/*
 * 버블 정렬
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 33, 7, 1, 12, 9, 3};
		System.out.println(Arrays.toString(arr));
		sort1(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = { 30, 90, 20, 25, 50, 40, 80, 75, 35, 45 };
		System.out.println(Arrays.toString(arr2));
		bubbleSort(arr2);
		System.out.println(Arrays.toString(arr2));

	}

	/**
	 * 마지막 원소 전까지 반복을 수행한다.
	 * 한번 반복이 끝난후에 마지막 원소는 정렬이 된 상태이므로 
	 * 반복 대상에서 제외한다.
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		for(int i=arr.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	private static void sort1(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	private static void sort2(int[] arr) {
		boolean flag = true;
		for(int i=0; i<arr.length; i++){
			if(flag == false) break;
			flag = false;
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
		}
	}
	
	public static void swap(int[] arr, int idx1, int idx2){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
