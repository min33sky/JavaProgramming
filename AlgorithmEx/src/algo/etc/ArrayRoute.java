package algo.etc;
/**
 * 행렬의 경로 문제 (동적 프로그래밍)
 * 왼쪽 상단에서 오른쪽 하단까지 경로를 구한다.
 * 우측이나 하측으로 1칸씩 움직일 수 있고 두 수의 합이 최대값인 경로로 움직인다.
 * @author Heo-MH
 *
 */
public class ArrayRoute {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 5, 10, 3, 9},
				{3, 5, 14, 9, 0},
				{8, 9, 7, 5, 4},
				{20, 5, 4, 10, 5},
				{1, 9, 8, 4, 3}
		};
		
		System.out.println("*** 경로 값 : " + dp(arr));
	}
	
	private static int Max(int a, int b){
		return a > b ? a : b;
	}

	private static int dp(int[][] arr) {
		// 1. 이동값을 저장할 행렬을 만든다.
		int[][] moveArr = new int[arr.length][arr[0].length];
		
		// 2. 왼쪽 상단 값을 설정한다.
		moveArr[0][0] = arr[0][0];
		
		// 2. 첫번째 행의 값을 설정한다.
		for(int i=1; i<arr.length; i++){
			moveArr[0][i] = moveArr[0][i-1] + arr[0][i];
		}
		// 3. 첫번째 열의 값을 설정한다.
		for(int i=1; i<arr.length; i++){
			moveArr[i][0] = moveArr[i-1][0] + arr[i][0];
		}
		// 4. 두 수의 합이 최고인 경로를 찾아 설정한다.
		for(int i=1; i<arr.length; i++){
			for(int j=1; j<arr.length; j++){
				moveArr[i][j] = arr[i][j] + Max(moveArr[i-1][j], moveArr[i][j-1]);
			}
		}
		
		// 완성된 배열 출력
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++)
				System.out.print(moveArr[i][j] + " ");
			System.out.println();
		}
		
		// 우측 하단의 값을 리턴한다.
		return moveArr[arr.length-1][arr.length-1];
	}
}
