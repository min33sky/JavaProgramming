package algo.sorting;

import java.util.Scanner;
/*
 * 퀵 정렬 - 분할 정복 알고리즘
 * Top Down (큰 조각 -> 작은 조각)
 * 추가 메모리 공간이 필요 없다. O(n)
 * 최선 O(n) 최악 O(n^2) -> 이미 정렬된 상태일 경우 
 * 평균 O(nlog2n)
 */
public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생성 할 숫자 개수 : ");
		int maxNumber = sc.nextInt();
		System.out.println("정렬 할 데이터 초기화");
		int[] array = makeRandomNumber(maxNumber);
		print(array);
		
		System.out.println("정렬 후 데이터");
		quickSort(array, 0, array.length-1);
		print(array);
		sc.close();
	}
	
	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivot = left;
			int low = left;
			int high = right;

			while (low < high) {
				while (array[high] > array[pivot])
					high--;
				while (low < high && array[low] <= array[pivot])
					low++;
				swap(array, low, high);
			}
			// 기준이 되는 값(left)의 위치를 바꾼다
			swap(array, pivot, low);
			pivot = low;
			quickSort(array, left, pivot - 1);
			quickSort(array, pivot + 1, right);
		}
	}	
	
	// 랜덤 숫자 생성
	private static int[] makeRandomNumber(int maxNumber) {
		int count = 0;
		int[] array = new int[maxNumber];
		
		// 배열에 수가 다 채워질 때까지 반복
		while(count<maxNumber){
			int number = (int)(Math.random()*maxNumber) + 1;
			if(!isNumberExit(number, count, array)){
				array[count] = number;
				count++;
			}
		}
		return array;
	}
	
	// 중복 체크 
	private static boolean isNumberExit(int number, int index, int[] arr) {
		for(int i=0; i<=index; i++){
			if(arr[i] == number)
				return true;
		}
		return false;
	}
	
	private static void swap(int[] arr, int i, int minIndex) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}

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
