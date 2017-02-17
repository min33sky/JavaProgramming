package algo.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

/*
 * 사이클 단어
 * https://www.acmicpc.net/problem/1544
 * 1. 맨 처음 입력받은 단어를 단어 저장소(해시셋)에 저장한다.
   2. 그 다음에 입력받은 단어와 저장소에 저장된 단어들을 비교한다.
    (1) 비교는 StringBuilder의 메서드인 .append()와 .deleteCharAt()을 이용하여 
         단어의 위치들을 우측으로 한칸씩 이동시키며 진행한다.
    (2) 만일 서로 다른 단어이면 저장소에 해당 단어를 저장한다.
   3. 저장소에 저장된 단어의 개수 = 서로다른 단어의 개수이므로 이를 출력한다.
 */
public class CycleWord {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("src/algo/etc/cycleword.txt"));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력 값 얻어오기
		int num = Integer.parseInt(in.readLine());

		HashSet<String> hSet = new HashSet<String>(); // 단어 저장소
		hSet.add(in.readLine()); // 맨 첫번째 단어 저장

		/* 두번째 단어부터 검증 */
		for (int i = 1; i < num; i++)
			check(hSet, in.readLine());

		/* 저장소의 크기 = 서로다른 단어의 개수 */
		out.write(String.valueOf(hSet.size()));
		out.close();
		in.close();
	}

	private static void check(HashSet<String> hSet, String word) {
		int number = word.length();

		for (String str : hSet) {
			StringBuilder sb = new StringBuilder(str);
			for (int i = 0; i < number; i++) {
				/* 서로 같은 단어이면 종료 */
				if (word.equals(sb.toString()))
					return;

				// 다르다면 단어의 맨 앞 글자를 맨 뒤에 붙이고, 맨 앞글자 삭제
				// ex) fish -> fishf -> ishf
				else
					sb = sb.append(sb.charAt(0)).deleteCharAt(0);
			}
		}
		// 저장소의 단어들과 일치하지 않으면 저장소에 해당 단어 저장
		hSet.add(word);
	}
}
