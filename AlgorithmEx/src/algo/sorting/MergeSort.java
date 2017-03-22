package algo.sorting;

import java.util.Scanner;

/*
 * 병합(합병) 정렬 - 분할 정복 알고리즘
 * Bottom Up(작은 조각 -> 큰 조각)
 * 추가 메모리 공간 필요
 * 항상 O(nlogn)
 */
public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		makeRandomNumber(number);
//		int[] arr = {8, 2, 4, 12, 1, 9, 6, 3};
		sc.close();
	}
	
	/*
	 * 분할
	 */
	private static void partition(int[] arr, int left, int right) {
		if(left < right){	
			int mid = (left + right) / 2;
			// 왼쪽 분할
			partition(arr, left, mid);
			// 오른쪽 분할
			partition(arr, mid+1, right);
			// 합병
			merge(arr, left, mid, right);
		}
	}
	
	/*
	 * 합병
	 */
	private static void merge(int[] arr, int left, int mid, int right) {
		int leftStart = left;
		int leftEnd = mid;
		int rightStart = mid+1;
		int rightEnd = right;
		
		// 합병 결과를 담을 배열 생성 - 추가 메모리 공간 사용
		int[] sortedArr = new int[arr.length];
		int index = left;
		
		// 두 배열값의 크기를 비교해서 작은 값을 먼저 배열에 넣는다.
		while((leftStart <= leftEnd) && (rightStart <= rightEnd)){
			if(arr[leftStart] < arr[rightStart]){
				sortedArr[index++] = arr[leftStart++];
			}else{
				sortedArr[index++] = arr[rightStart++];
			}
		}
		
		/*
		 * 한쪽 배열의 값이 다 옮겨졌다면 다른 배열의 값들을 다 옮긴다.
		 */
		if(leftStart > leftEnd){
			while(rightStart <= rightEnd){
				sortedArr[index++] = arr[rightStart++];
			}
		}else if(rightStart > rightEnd){
			while(leftStart <= leftEnd){
				sortedArr[index++] = arr[leftStart++];
			}
		}
		
		// 임시 배열에 있는 값을 원래 배열로 옮긴다.
		for(int i=left; i<=right; i++){
			arr[i] = sortedArr[i];
		}
	}
	
	/*
	 * make Random Number
	 */
	private static void makeRandomNumber(int number) {
		int[] arr = new int[number];
		int count = 0;
		while(count < number){
			int randomNumber = (int)(Math.random()*number)+1;
			if(!ExistedNumber(arr, randomNumber)){
				arr[count++] = randomNumber;
			}
		}
		print(arr);
		System.out.println();
		partition(arr, 0, arr.length-1);
		print(arr);
	}

	/*
	 * Confirm duplicated number
	 */
	private static boolean ExistedNumber(int[] arr, int number) {
		for(int i=0; i<arr.length; i++){
			if(arr[i] == number)
				return true;
		}
		return false;
	}


	/*
	 * print
	 */
	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
