package javapuzzleer;
/**
 * 홀수 확인
 * @author Heo-MH
 *
 */
public class Ex1 {
	public static void main(String[] args) {
		System.out.println(isOdd_Wrong(-3));
		System.out.println(isOdd(-3));
	}

	private static boolean isOdd(int i) {
		// 비트연산이 속도가 더 빠르다.
		return (i & 1) == 1;
//		return i % 2 != 0;
	}

	/**
	 * 음수 일때는 홀수 측정이 안된다.
	 * 나누기 연산은 왼쪽 피연산자의 부호를 따라가기 때문에
	 * 음수를 2로 나누면 음수가 나오므로 무조건 false가 뜬다.
	 * @param i
	 * @return
	 */
	private static boolean isOdd_Wrong(int i) {
		return i % 2 == 1;
	}
}
