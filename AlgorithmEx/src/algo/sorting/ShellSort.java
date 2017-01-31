package algo.sorting;

import java.util.Scanner;

/*
 * 쉘 정렬 - 여러 리스트로 나눠서 삽입 정렬을 한다.
 * 부분 리스트의 개수가 1이 될때까지
 */
public class ShellSort {
	public static void main(String[] args) {
//		int[] arr = {10,8,6,20,4,3,22,1,0,15,16};
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		makeRandomNumberArray(number);
//		sort(arr);
	}

	private static void sort(int[] arr) {
		/*
		 * 부분 리스트가 1개가 될 때까지 -> gap이 1이 될 때까지
		 */
		for(int gap=arr.length/2; gap>=1; gap=gap/2){
			System.out.println("gap : " + gap);
			for(int start=0; start<gap; start++){
				insertionSort(arr, start, gap);				
			}
		}
		print(arr);
		
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertionSort(int[] arr, int start, int gap) {
		for(int i=start+gap; i<arr.length; i=i+gap){
			for(int j = i-gap; j>=0; j=j-gap){
				if(arr[j] > arr[j+gap]){
					int temp = arr[j];
					arr[j] = arr[j+gap];
					arr[j+gap] = temp;
				}
			}
		}
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
		System.out.println("3. 원본 배열");
		print(array);
		System.out.println("\n4. 정렬 배열");
		sort(array);
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
}
