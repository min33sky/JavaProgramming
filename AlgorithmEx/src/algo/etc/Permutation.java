package algo.etc;

/**
 * 순열
 * @author Heo-MH
 *
 */
public class Permutation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		perm(arr, 0);
	}

	/**
	 * 트리라고 생각해서 풀어보자. 해당 Depth와 같은 Index부터 주어진 배열의 마지막 Index가지 swap이 가능하다 참조 :
	 * http://stack07142.tistory.com/24
	 * 
	 * @param arr
	 * @param depth
	 */
	public static void perm(int[] arr, int depth) {
		
		// 제일 깊은 depth를 출력한다.
		if (depth == arr.length) {
			print(arr);
			return;
		}

		// depth가 0일 때, i는 0, 1, 2
		// 즉, arr[0]이 [0], [1], [2] 으로 각각 swap된다.
		for (int i = depth; i < arr.length; i++) {
			swap(arr, depth, i);
			// 다음 depth로 진입한다.
			perm(arr, depth + 1);
			// 현재 depth - 현재 loop의 다음 iteration을 위해 바꾼 것을 되돌린다.
			swap(arr, depth, i);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
	}
}
