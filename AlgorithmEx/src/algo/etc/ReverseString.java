package algo.etc;
/*
 * LeetCode : Reverse String (문자열 뒤집기)
 * http://blog.naver.com/madplay/220865856205
 */
import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("최종 : " + reverseString(str));
		
		System.out.print("Ver 2 : "); 
		recursive(str, 0);
	}
	
	/**
	 * 배열 이용
	 * @param str
	 * @return
	 */
	public static String reverseString(String str) {
		char[] arr = str.toCharArray();	// String -> Char Array
		int length = arr.length;
		/*
		 * 배열의 앞과 뒤를 서로 맞교환
		 * 중간까지만 비교하면 되므로 length/2
		 */
		for(int start=0; start < length/2; start++){
			// swap
			char temp = arr[start];
			arr[start] = arr[length-1-start];
			arr[length-1-start] = temp;
			System.out.println(arr);
		}
		return String.valueOf(arr);	// String.valueOf() : String객체를 생성
	}
	
	/**
	 * Recursive 이용
	 * @param str
	 * @param index
	 */
	public static void recursive(String str, int index) {
		if(index == str.length()) // Base Case	: 마지막 문자가 끝나면 종료
			return;
		recursive(str, index+1);
		System.out.print(str.charAt(index) + " ");
	}
}
