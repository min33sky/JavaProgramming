package datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/1260 
 * DFS (Depth First Search) : 깊이 우선 탐색
 * BFS (Breadth First Search) : 너비 우선 탐색
 * @author Heo-MH
	8 8 1
	1 2
	1 3
	2 4
	2 5
	3 6
	3 7
	4 8
	5 8
 */
public class Baek1260 {
	int[][] graph;		// 정점 그래프
	boolean[] visited;	// 방문한 정점 배열
	int N;		// 정점(Vertex)
	int V;		// 탐색 시장 정버
	int M;		// 간선(Edge)

	public Baek1260() {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 					// 정점 (Vertex)
		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		M = sc.nextInt(); 					// 간선 (Edge)
		V = sc.nextInt(); 					// 탐색 시작 정점
		int a, b;
		for (int i = 1; i <= M; i++) { 		// 간선이 연결하는 두 정점
			a = sc.nextInt();
			b = sc.nextInt();
			// 두 정점사이의 간선이 존재하므로 1을 입력
			graph[a][b] = 1;	
			graph[b][a] = 1;
		}

		System.out.println("깊이 우선 탐색");
		dfs();
		System.out.println();
		// 방문한 정점들 초기화
		initVisited();
		System.out.println("너비 우선 탐색");
		bfs();
	}

	// 깊이 우선 탐색(스택 이용)
	public void dfs() {
		visited[V] = true;			// 방문한 정점은 true
		System.out.print(V + " ");	// 시작 정점 출력
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(V); 				// 방문한 정점을 Stack에 push
		int next = -1;

		while (!stack.isEmpty()) {
			// 인접한 정점(Vertex)을 가져온다.
			next = getAdjUnvisitedVertex(stack.peek());	

			
			if (next == -1)		// 인접한 정점이 없을 경우 스택에서 팝한다.
				stack.pop();
			else {				// 인접한 정점에 방문했다고 표시를 하고 스택에 push
				visited[next] = true;
				System.out.print(next + " ");
				stack.push(next);
			}
		}
	}

	// 너비 우선 탐색(큐 이용)
	public void bfs() {
		visited[V] = true;					// 방문한 정점은 true
		System.out.print(V + " ");			// 시작 정점 출력
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);						// 시작 정점을 큐에 추가
		int next = -1;

		while (!queue.isEmpty()) {			
			int v1 = queue.remove();		
			// 큐에서 빼낸 정점과 인접한 정점들을 모두 큐에 넣는다.
			while ((next = getAdjUnvisitedVertex(v1)) != -1) {
				visited[next] = true;		// 방문한 정점은 true
				System.out.print(next + " ");
				queue.add(next);			
			}
		}
		
	}

	public int getAdjUnvisitedVertex(int v) {
		for (int j = 1; j <= N; j++) {
			// 인접 Vertax에서 방문하지 않는 Vertex가 있다면 리턴한다.
			if (graph[v][j] == 1 && visited[j] == false) {
				return j;
			}
		}
		return -1;
	}
	
	private void initVisited() {
		for(int i=0; i<visited.length; i++){
			visited[i] = false;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Baek1260();
	}
}
