package algo.sorting;

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
		print(arr);
		System.out.println("\n 정렬 배열");
		sort1(arr);
		System.out.print("\n숫자의 개수를 입력하세요 : ");
		int number = sc.nextInt();
		makeRandomNumberArray(number);
		
		sc.close();
	}

	private static void makeRandomNumberArray(int number) {
		int[] array = new int[number]; // 랜덤 숫자들을 담을 배열을 생성한다.
		int count = 0;	// 배열에 들어있는 값의 수
		while(count < number){
			int randomNumber = (int)(Math.random()*number)+1;
			if(!duplicatedNumber(array, randomNumber)){
				array[count] = randomNumber;
				count++;
			}
		}
		print(array);
		System.out.println("\n정렬");
		sort1(array);
	}

	/*
	 * 배열에 중복된 값이 있는지 체크
	 */
	private static boolean duplicatedNumber(int[] arr, int randomNumber) {
		for(int i=0; i<arr.length; i++){
			if(arr[i] == randomNumber){
				return true;
			}
		}
		return false;
	}

	private static void sort1(int[] arr) {
		
		for(int i = 1; i < arr.length; i++){
			for(int j= i-1; j >= 0; j--){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
		
		print(arr);
	}

	private static void swap(int[] arr, int idx1, int idx2){
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
