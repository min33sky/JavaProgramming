package algo.sorting;

import java.util.Scanner;

/*
 * Quick Sort
 */
public class QuickSort3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		makeRandomNumber(number);
		sc.close();
	}

	/*
	 * make Random Number
	 */
	private static void makeRandomNumber(int number) {
		int[] randomArr = new int[number];
		int count = 0;
		while(count < number){
			int rNum = (int)(Math.random()*number)+1;
			if(duplicatedNumber(randomArr, rNum)){
				randomArr[count] = rNum;
				count++;
			}
		}
		/*
		 * quick sort start
		 */
		System.out.println("Original A rray");
		print(randomArr);
		quickSort(randomArr, 0, randomArr.length-1);
		System.out.println("Sorted Array");
		print(randomArr);
	}

	private static boolean duplicatedNumber(int[] randomArr, int rNum) {
		for(int i=0; i<randomArr.length; i++){
			if(rNum == randomArr[i])
				return false;
		}
		return true;
	}

	private static void quickSort(int[] arr, int left, int right) {
		/*
		 * repeat until sublist has one item
		 * because the algorithm is using in-place space,
		 * we can not use len(list) instead we use start, end for sublist
		 */
		if(left < right){
			// get pivot using partition method
			int pivot = partition(arr, left, right);
			// recurse quick sort left side from pivot
			quickSort(arr, left, pivot-1);
			// recurse quick sort right side from pivot
			quickSort(arr, pivot+1, right);
		}
	}
  
	private static int partition(int[] arr, int start, int end) {
		// use end item as initial pivot
		int pivot = end;
		// use start as initial wall index
		int wall = start;
		int left = start;

		// repeat until left item hit the end of list
		while(left < pivot){
			/*
			 * if left item is smaller than pivot, 
			 * swap left item with wall and move wall to right
             * this will ensure items smaller than pivot stay left side from the wall and
             * the items greater than pivot stay right side from the wall
			 */
			if(arr[left] < arr[pivot]){
				swap(arr, left, wall);
				wall++;
			}
			left++;
		}
		// when left hit the end of list, swap pivot with wall
		swap(arr, wall, pivot);
		/*
		 * now left side of wall are the items smaller than wall
    	 * now right side of pivot are the items greater than wall
    	 * wall is the new pivot
		 */
		pivot = wall;
		return pivot;
	}

	/*
	 * swap
	 */
	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	/*
	 * print Array
	 */
	private static void print(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
			count++;
			if(count == 10){
				System.out.println();
				count = 0;
			} 
		}
		System.out.println();
	}
}
