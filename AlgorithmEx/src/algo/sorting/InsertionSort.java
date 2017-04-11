package algo.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 삽입 정렬(Insertion Sort)
 * 이미 정렬되어 있는 리스트에 새로운 레코드를 삽입
 * 이미 정렬되어 있을경우 : O(n)
 * 최악의 복잡도 : O(n^2)
 */
public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("***** 삽입 정렬 *****");
		Scanner sc = new Scanner(System.in);
		int[] arr = {6, 8, 1, 4, 5, 3, 7, 2};
		System.out.println(" 원본 배열");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n 정렬 배열");
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.print("\n숫자의 개수를 입력하세요 : ");
		int number = sc.nextInt();
		makeRandomNumberArray(number);
		
		sc.close();
	}

	/**
	 * 랜덤 수로 배열 채우기
	 * @param number
	 */
	private static void makeRandomNumberArray(int number) {
		int[] array = new int[number]; // 랜덤 숫자들을 담을 배열을 생성한다.
		int count = 0;	// 배열에 들어있는 값의 수
		while(count < number){
			int randomNumber = (int)(Math.random()*number)+1;
			// 중복된 수가 없을시 배열에 추가 한다.
			if(!duplicatedNumber(array, randomNumber)){
				array[count] = randomNumber;
				count++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("\n정렬 완료");
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

	/**
	 * 배열에 중복된 수 체크
	 * @param arr
	 * @param randomNumber
	 * @return
	 */
	private static boolean duplicatedNumber(int[] arr, int randomNumber) {
		for(int i=0; i<arr.length; i++)
			if(arr[i] == randomNumber) return true;	// 중복 있음
		
		return false;	// 중복 없음
	}

	/**
	 * 삽입 정렬
	 * 배열의 앞쪽부터 정렬한다.
	 * 맨 처음 인덱스는 정렬되어 있다고 생각한다.
	 * @param arr
	 */
	private static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++){
			for(int j= i-1; j >= 0; j--){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
	}

	private static void swap(int[] arr, int idx1, int idx2){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
}
