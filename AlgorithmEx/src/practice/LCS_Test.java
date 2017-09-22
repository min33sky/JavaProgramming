package practice;

public class LCS_Test {
	static String str1 = "FISH";
	static String str2 = "HOSHE";
	public static void main(String[] args) {
		lcs(str1, str2);
	}

	private static void lcs(String str1, String str2) {
		int[][] matrix = new int[str1.length()][str2.length()];
		for(int i=0; i<str1.length(); i++){
			for(int j=0; j<str2.length(); j++){
				if(str1.charAt(i) == str2.charAt(j)){
					matrix[i][j] = 1 + prevSum(matrix, i, j);
				}else{
					matrix[i][j] = 0;
				}
			}
		}
		// print Array
		printArray(matrix);
		
		// 최대 공통 문자 부분 개수
		lcsSum(matrix);
	}

	private static void lcsSum(int[][] matrix) {
		int max = 0;
		int col = 0;
		int row = 0;
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				if(matrix[i][j] > max)
					max = matrix[i][j];
					row = i;
					col = j;
			}
		}
		System.out.println("최대 공통 문자 부분 : " + max);
//		System.out.println(row);
//		System.out.println(col);
		// 연속 공통 문자 출력
		for(int i=0; i<max; i++){
			// 뒤에서 부터 출력
			System.out.print(str1.charAt(row--));
		}
	}

	private static void printArray(int[][] matrix) {
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int prevSum(int[][] matrix, int i, int j) {
		// 배열 인덱스 밖은 0으로 처리
		if(i-1<0 || j-1<0)
			return 0;
		return matrix[i-1][j-1];
	}
}
