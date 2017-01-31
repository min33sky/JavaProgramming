package algo.etc;
/*
 * LeetCode : Reverse String (문자열 뒤집기)
 * http://blog.naver.com/madplay/220865856205
 */
import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int length = arr.length;
		/*
		 * 배열의 앞과 뒤를 서로 맞교환
		 */
		for(int start=0; start < length/2; start++){
			char temp = arr[start];
			arr[start] = arr[length-1-start];
			arr[length-1-start] = temp;
			System.out.println(arr);
		}
		return String.valueOf(arr);	// String.valueOf() : String객체를 생성
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("최종 : " + reverseString(str));
	}
}
