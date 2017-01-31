package algo.sorting;
/*
 * 버블 정렬
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 33, 7, 1, 12, 9, 3};
		sort1(arr);
		System.out.println();
		sort2(arr);
	}

	private static void sort1(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
		print(arr);
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
		print(arr);
	}
	
	public static void swap(int[] arr, int idx1, int idx2){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
