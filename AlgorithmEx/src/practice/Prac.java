package practice;

import java.util.Arrays;

public class Prac {
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 33, 7, 1, 12, 9, 3};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

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
}
