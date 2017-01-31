package algo.sorting;
/*
 * 선택 정렬
 * 1. 주어진 리스트 중에서 최소값을 찾아서 첫번째 인덱스 값과 교체
 * 2. 첫번째 값을 제외하고 가장 작은 값을 착아서 2번째 인덱스 값과 교체. 그 다음도 마찬가지
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {6, 8, 1, 4, 5, 3, 7, 2};
		System.out.println(" Original Array");
		print(arr);
		System.out.println("\n Sorted Array");
		sort1(arr);
		
	} 

	private static void sort1(int[] arr) {
		for(int idx = 0; idx < arr.length; idx++){
			// assume the minimum is the first element
			int idx_min = idx;
			
			// test against elements after idx to find the smallest
			for(int j = idx + 1; j < arr.length; j++){
				// found new minimum, remember its index
				if(arr[j] < arr[idx_min]){
					idx_min = j;
				}
			}
			
			// swap
			if(idx != idx_min){
				int temp = arr[idx];
				arr[idx] = arr[idx_min];
				arr[idx_min] = temp;
			}
		}
		print(arr);
	}

	private static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
