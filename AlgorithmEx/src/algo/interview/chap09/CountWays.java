package algo.interview.chap09;

/*
 * Page 407
 * N개 계단 오르기
 * 1~3계단씩 오를 수 있다.
 */
public class CountWays {
	public static void main(String[] args) {
		System.out.println(solution(0));
	}

	private static int solution(int i) {
		
		if(i < 0){
			return 0;
		}else if(i==0){
			return 1;
		}else{
			return solution(i-3) + solution(i-2) + solution(i-1);
		}
	}
}
