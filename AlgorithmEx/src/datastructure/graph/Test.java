package datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
 *  8 8 1
	1 2
	1 3
	2 4
	2 5
	3 6
	3 7
	4 8
	5 8
 */
public class Test {
	
	boolean[] visited;
	int[][] graph;
	int N;	// 정점
	int V;	// 시작 정점
	int M;	// 간선

	public Test(){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		M = sc.nextInt();
		V = sc.nextInt();
		
		for(int i=1; i<=M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		dfs();
		initVisited();
		bfs();
	}
	
	private void initVisited() {
		for(int i=0; i<visited.length; i++){
			visited[i] = false;
		}
		System.out.println();
	}

	public void dfs() {
		visited[V] = true;
		System.out.print(V + " ");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(V);
		int next = -1;
		
		while(!stack.isEmpty()){
			next = getAdjVisitedVertex(stack.peek());
			
			if(next == -1){
				stack.pop();
			}else{
				visited[next] = true;
				System.out.print(next + " ");
				stack.push(next);
			}
		}
	}
	
	public void bfs(){
		visited[V] = true;
		System.out.print(V + " ");
		Queue<Integer> queue = new LinkedList<>();
		queue.add(V);
		int next = -1;
		
		while(!queue.isEmpty()){
			int v1 = queue.remove();
			while((next = getAdjVisitedVertex(v1)) != -1){
				System.out.print(next + " ");
				visited[next] = true;
				queue.add(next);
			}
		}
		
	}
	
	public int getAdjVisitedVertex(int v){
		for(int i=1; i<=N; i++){
			if(visited[i] == false && graph[v][i] == 1){
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		new Test();
	}
	
	
}
