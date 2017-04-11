package algo.etc;

import java.util.Stack;

public class ArrayRoute2 {
	static int[][] arr = {
			{1, 5, 10, 3, 9},
			{3, 5, 14, 9, 0},
			{8, 9, 7, 5, 4},
			{20, 5, 4, 10, 5},
			{1, 9, 8, 4, 3}
	};
	static int[][] temp = new int[arr.length][arr.length];		// 거리 배열
	static char[][] route = new char[arr.length][arr.length];	// 방향 배열
	public static void main(String[] args) {
		System.out.println(mat(4,4));
		System.out.println("==================");
		System.out.println(bottomUp(4,4));
		
		
		for(int i=0; i<route.length; i++){
			for(int j=0; j<route[i].length; j++){
				System.out.print(route[i][j] + " ");
			}
			System.out.println();
		}
		
		print(4,4);
		System.out.println("시작점에서부터 출발 좌표");
		printRoute(4,4);
	}
	
	
	private static void printRoute(int i, int j) {
		Stack<String> stack = new Stack<>();
		while(route[i][j] != '-'){
			if(route[i][j] == '↑'){
				stack.push("("+i+","+j+")");
				i = i-1;
			}else{
				stack.push("("+i+","+j+")");
				j = j-1;
			}
		}
		stack.push("("+i+","+j+")");
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
	}


	private static void print(int i, int j) {
		while(route[i][j] != '-'){
			System.out.print("("+i+","+j+")" + " ");
			if(route[i][j] == '↑'){
				i = i-1;
			}else{
				j = j-1;
			}
		}
		System.out.println("("+i+","+j+")");
	}

	/**
	 * Recursion 활용
	 * @param i
	 * @param j
	 * @return
	 */
	private static int mat(int i, int j) {
		
		if(i==0 && j==0){
			temp[i][j] = arr[i][j];
		}else if(i==0){
			temp[i][j] = mat(i,j-1) + arr[i][j];
		}else if(j==0){
			temp[i][j] = mat(i-1, j) + arr[i][j];
		}else{
			temp[i][j] = Math.max(mat(i,j-1), mat(i-1,j)) + arr[i][j];
		}
		
		return temp[i][j];
	}
	
	private static int bottomUp(int i, int j){
		
		for(int row=0; row<i+1; row++){
			for(int col=0; col<j+1; col++){
				if(col==0 && row==0){
					temp[row][col] = arr[row][col];
					route[row][col] = '-';
				}else if(row==0){
					route[row][col] = '←';
					temp[row][col] = temp[row][col-1] + arr[row][col];
				}else if(col==0){
					route[row][col] = '↑';
					temp[row][col] = temp[row-1][col] + arr[row][col];
				}else{
					if(temp[row-1][col] < temp[row][col-1]){
						route[row][col] = '←';
					}else{
						route[row][col] = '↑';
					}
					temp[row][col] = Math.max(temp[row-1][col], temp[row][col-1]) + arr[row][col];
				}
			}
		}
		
		return temp[i][j];
	}
}
