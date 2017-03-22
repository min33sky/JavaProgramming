package algo.sorting;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		int[] arr = {6,8,1,4,5,3,7,2};
		print(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 버블정렬\n2. 삽입정렬\n3. 선택정렬");
		int num = sc.nextInt();
		switch(num){
			case 1:
				System.out.println("버블정렬");
				bubbleSort(arr);
				print(arr);
				break;
			case 2:
				System.out.println("삽입정렬");
				insertionSort(arr);
				print(arr);
				break;
			case 3:
				System.out.println("선택정렬");
				selectionSort(arr);
				print(arr);
				break;
			default :
				break;
		}
	}

	/**
	 * 출력
	 * @param arr
	 */
	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 선택정렬
	 * @param arr
	 */
	private static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++){
			int min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			// swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
	}

	/**
	 * 삽입 정렬
	 * @param arr
	 */
	private static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++){
			for(int j=i; j>0; j--){
				if(arr[j-1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else{
					break;
				}
			}
		}
	}

	/**
	 * 버블 정렬
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
}
