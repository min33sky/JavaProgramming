package algo.etc;

/**
 * 피보나치 수열 (동적 프로그래밍)
 * 큰 문제의 해답에 작은 문제의 해답이 포함되어 있을 때 속도를 비약적으로 향상시킬 수 있다.
 * @author Heo-MH
 *
 */
public class Fibonacci {

	public static int[] arr = new int[41];
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		for (int i = 1; i <= 40 ; i++) {
			System.out.print(fibo(i) + " ");
		}
		long end = System.nanoTime();
		System.out.println("\n소요 시간 : " + (end - start) + "ns");
		
		
		start = System.nanoTime();
		for (int i = 1; i <= 40 ; i++) {
			System.out.print(dynamicFibo(i) + " ");
		}
		end = System.nanoTime();
		System.out.println("\n소요 시간 : " + (end - start) + "ns");
	}

	/**
	 * 동적 프로그래밍으로 해결하기. -> 중복 호출을 피하자
	 * 중복 되는 값을 저장해놓고 활용하자!
	 * @param i
	 * @return
	 */
	private static int dynamicFibo(int i) {
		
		if(arr[i] != 0){				// 이미 저장된 값이므로 계산하지 않는다.
			return arr[i];
		}else{
			if(i == 1 || i == 2){
				arr[i] = 1;
			}else{
				arr[i] = dynamicFibo(i-1) + dynamicFibo(i-2);
			}
			return arr[i];				// 결과값을 행렬에 저장
		}
	}

	private static int fibo(int i) {
		if(i == 1 || i == 2){
			return 1;
		}else{
			return fibo(i-1) + fibo(i-2);
		}
	}
	
	
}
