package algo.etc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 반복되는 글자 없이 가장 긴 문자열 찾기
 * Given a string, find the length of the longest substring without repeating characters.
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * http://blog.naver.com/madplay/220861661250
 */
public class LengthOfLongestSubstring {
	/*
	 * solution1
	 */
	public static int solution(String s) {
        int length = 0;
        int[] arr = new int[128];

        for(int idx=0; idx<arr.length; idx++) {
            arr[idx] = 0;
        }

        int position = 0;
        for (int indexOfString = 0; indexOfString < s.length(); indexOfString++) {
            int charIndex = s.charAt(indexOfString);
            position = getMax(arr[charIndex], position);
            length = getMax(length, indexOfString - position + 1);
            arr[charIndex] = indexOfString + 1;
        }
        return length;
	}

	public static int getMax(int a, int b) {
		   return a > b ? a : b;
	}
	
	/*
	 * solution2 : HashSet 사용
	 * i : 인덱스용, j : 삭제용
	 */
	public static int solution2(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (i < s.length()) {
	        if (!set.contains(s.charAt(i))) {
	            set.add(s.charAt(i++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(j++));
	        }
	    }
	    
	    return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("문자열 길이 : " + solution(str));
		System.out.println("문자열 길이 : " + solution2(str));
	
	}
}
