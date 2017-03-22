package practice;

/**
 * 멱집합
 * @author Heo-MH
 *
 */
public class PowerSet {
	public static char[] arr = {'a', 'b', 'c'};
	public static boolean[] flag = new boolean[arr.length];
	
	public static void main(String[] args) {
		powerSet(0);
	}

	/**
	 * 해당 뎁스(배열의 index)값을 포함하지 않으면 
	 * 왼쪽 서브트리, 포함하면 오른쪽 서브트리
	 * @param depth
	 */
	private static void powerSet(int depth) {
		if(depth == arr.length){	// Leaf Node라면 출력한다.
			for(int i=0; i<arr.length; i++){
				if(flag[i])			// true 값만 출력한다.
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// 해당 인덱스 값을 포함시키지 않을 때 (왼쪽 서브트리)
		flag[depth] = false;
		powerSet(depth+1);
		// 해당 인덱스 값을 포함시킬 때	(오른쪽 서브트리)
		flag[depth] = true;
		powerSet(depth+1);
	}
}
