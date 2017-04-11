package algo.etc;

import java.util.Scanner;

/*
 * 문자열에 포함된 알파벳 빈도수 정렬하기
 * http://blog.naver.com/madplay/220685340265
 */
public class AlphabetFrequency {
	/* 알파벳의 개수 */
	private static final int ALPHA = 58;	// 소문자 z - 대문자 A + 1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] alphabet = new int[ALPHA]; /* 알파벳의 빈도수를 매핑 시킬 배열 */
		int[] index = new int[ALPHA];	 /* 출력 순서를 매핑시킬 배열 */
		String input = sc.next();

		/* 
		 * 문자열의 한 글자씩 탐색하는 루프 
		 */
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			/* 배열의 인덱스와 아스키코드를 매핑하여 빈도수를 저장한다. */
			alphabet[c - 65]++;	// char - int -> char가 int로 형변환. ex) A -> 65 - 65 = 0
		}

		/* 
		 * 출력 순서를 매핑시킬 배열이다.
		 * 배열의 값은 65를 더했을 때 알파벳이 된다.
		 * 차후에 index배열을 순서대로 출력하면 된다.
		 */
		for (int i = 0; i < ALPHA; i++) 
			index[i] = i;

		/* 간단하게 N제곱 시간복잡도 버블 정렬 사용! */
		for (int i = 0; i < ALPHA; i++) {
			for (int j = 0; j < ALPHA-i-1; j++) {

				/*
				 * 알파벳의 빈도수를 비교하여 빈도수가 높은 것을 뒤로 보낸다.
				 * 즉, index배열의 값은 65를 더했을 때의 알파벳인데
				 * 빈도수에 따라 위치를 변경함으로서 알파벳의 등장 순서를 정한다.
				 */
				if (alphabet[index[j]] > alphabet[index[j+1]]) {
					int temp = index[j];
					index[j] = index[j+1];
					index[j+1] = temp;
				}
				
				/*
				 * 빈도수가 높은 것을 앞으로 보내기
				 */
//				if(alphabet[index[j]] < alphabet[index[j+1]]){
//					int temp = index[j];
//					index[j] = index[j+1];
//					index[j+1] = temp;
//				}
			}
		}

		/* 출력한다! */
		System.out.println("*** 빈도 수가 많은 문자가 뒤에 출력 ***");
		for (int i = 0; i < ALPHA; i++) {
			for (int count = alphabet[index[i]]; count > 0; count--) {
				System.out.print((char) (65 + index[i]));
			}
		}
		
		/* 출력한다! */
		System.out.println("\n*** 빈도 수가 많은 문자가 뒤에 출력(수로 표현) ***");
		for (int i = 0; i < ALPHA; i++) {
			if(alphabet[index[i]] == 0)
				continue;
			System.out.print((char) (65 + index[i]) + "" + alphabet[index[i]]);
		}
	}
}
