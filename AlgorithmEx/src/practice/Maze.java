package practice;

/**
 * 미로찾기 : 재귀이용
 * @author Heo-MH
 *
 */
public class Maze {
	private static int N = 8;
	private static int[][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static final int PATHWAY_COLOR = 0;		// 길
	private static final int WALL_COLOR = 1;		// 벽
	private static final int BLOCKED_COLOR = 2;		// 방문했으며 출구 경로가 없다.
	private static final int PATH_COLOR = 3;		// 방문했으며 출구로 가능 경로가 될 가능성이 있다.
	
	public static void main(String[] args) {
		System.out.println("원본");
		printMap();
		
		findMazePath(0,0);
		
		System.out.println("결과");
		printMap();
	}

	/**
	 * 경로 찾기 메서드
	 * @param i
	 * @param j
	 */
	private static boolean findMazePath(int x, int y) {
		if(x < 0 || y < 0 || x >= N ||  y >= N){	// 맵 범위를 벗어난 경우에는 false 리턴
			return false;
		}else if(maze[x][y] != PATHWAY_COLOR){	// 길이 아닐 때
			return false;
		}else if(x == N-1 && y == N-1){			// 출구일 때
			maze[x][y] = PATH_COLOR;			// 방문 체크
			return true;
		}else{
			maze[x][y] = PATH_COLOR;			// 방문 체크
			// 동서남북 중에 하나라도 길이 있다면 true
			if(findMazePath(x-1, y) || findMazePath(x, y-1) || 
					findMazePath(x+1, y) || findMazePath(x, y+1)){
				return true;
			}
			// 모두 갈수 없는 곳일때는 갈 수 없다고 표시를 하고 false 리턴
			maze[x][y] = BLOCKED_COLOR;
			return false;
		}
		
	}

	/**
	 * 지도 그리기
	 * @param maze
	 */
	private static void printMap() {
		for(int i=0; i<maze.length; i++){
			for(int j=0; j<maze[i].length; j++){
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
