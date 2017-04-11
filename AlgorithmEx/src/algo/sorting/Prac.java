package algo.sorting;

import java.util.Arrays;

public class Prac {
	public static void main(String[] args) {
		int[] arr = {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int left, int right) {
		if(left < right){
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = end;
		int left = start;
		int wall = start;
		
		while(left < pivot){
			if(arr[left] < arr[pivot]){
				swap(arr, left, wall);
				wall++;
			}
			left++;
		}
		
		swap(arr, wall, pivot);
		pivot = wall;
		
		return pivot;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
