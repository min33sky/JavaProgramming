package algo.interview.chap05;

/*
 * page 310
 * 비트 조작 해법
 */
public class UpdateBits {
	public static void main(String[] args) {
		int n = 0b10000101000;
		int m = 0b10011;
		int i = 2;
		int j = 6;
		
		int result = updateBits(n, m, i, j);

		// Integer.toBinaryString() : 2진수 값으로 출력
		System.out.println(Integer.toBinaryString(result));
	}

	private static int updateBits(int n, int m, int i, int j) {
		/*
		 * n의 i부터 j비트까지를 0으로 만들기 위한 마스크 생성
		 * Example : i=2, j=6 -> 11110000011
		 */
		int mask = getMask(i, j);	// 마스크 값 얻어오기
		
		int n_cleared = n & mask;	// 수정할 비트들을 0으로 교체
		int m_shifted = m << i;		// 수정할 값들의 비트를 이동
		
		return n_cleared | m_shifted;	// 결과 출력
	}

	private static int getMask(int i, int j) {
		int allOnes = ~0;	// 모든 비트가 1이 됨
		int left = allOnes << (j+1);	// 왼쪽비트 1
		int right = (1 << i) - 1;		// 오른쪽비트 1
		
		return left | right;	
	}
}
