package algo.interview.chap09;

import java.util.ArrayList;

/*
 * Page 419
 * 문자열의 순열 찾기
 */
public class PermutationTest {
	public static void main(String[] args) {
		String str = "ABC";

		ArrayList<String> list = getPerm(str);
		System.out.println(list);
	}

	private static ArrayList<String> getPerm(String str) {
		if(str == null)
			return null;

		ArrayList<String> permutations = new ArrayList<>();
		if(str.length() == 0){
			System.out.println("str.length() == 0 실행");
			permutations.add("");
			return permutations;
		}

		char first = str.charAt(0); // 첫 문자를 가져옴
		String remainder = str.substring(1); // 첫 문자 제외 
		ArrayList<String> words = getPerm(remainder);
		for(String word : words){
			System.out.println("Word : " + word);
			for(int idx = 0; idx <= word.length(); idx++){
				String s = insertCharAt(word, first, idx );
				System.out.println("String : " + s);
				permutations.add(s);
			}
		}
		return permutations;
	}

	/*
	 * 문자 삽입
	 */
	private static String insertCharAt(String word, char insert, int idx) {
		String start = word.substring(0, idx);
		String end = word.substring(idx);
		return start + insert + end;
	}
}
