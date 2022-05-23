package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

// bfs 알고리즘에 대한 이해

public class Bfs {
	
	// bfs는 큐로 구현한다.(FIFO, 선입선출 원칙으로 탐색한다.)
	// dfs와 달리, bfs는 재귀적으로 동작하지 않는다.
	
	// 노드의 갯수, 연결정보를 나타내는 2차원 배열과,
	// 방문여부를 나타내는 boolean 배열이 필요하다.
//	static int[][] graph;
	static boolean[] visited;
	
	
	public static void main(String[] args) {
		
		// 노드의 갯수가 8개, 연결정보가 다음과 같을 때 2차원 배열을 초기화하는 방법
		// 배열의 인덱스를 노드와 일치시키기 위해 노드의 갯수+1로 배열 크기를 선언한다.
		// 0번째 인덱스는 비우고 1번째 인덱스부터 연결정보를 저장한다.
		int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		
		// 그래프를 static 필드로 선언하고, 노드갯수+1만큼 크기 지정 후,
		// 연결정보를 반복문으로 표시하는 방법도 있다. 이 때, 간선은 1로 표시한다.
		// 간선의 갯수 : m이라 할 때,
//		graph = new int[9][9];
//		
//		for(int i=0; i<m; i++) {
//			int a = scan.nextInt();
//			int b = scan nextInt();
//			graph[a][b] = 1;
//			graph[b][a] = 1;
//		}
		
		visited = new boolean[9];
		
		// 출력 : 1 -> 2 -> 3 -> 8 -> 6 -> 5 -> 4 -> 7 -> 
		System.out.println(bfs(1, graph, visited));
	} // main
	
	static String bfs(int start, int[][] graph, boolean[] visited) {
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		
		// 큐에 bfs를 시작 할 노드의 번호를 넣어준다.
		q.offer(start);
		
		// 방문한 노드는 방문처리를 해준다.
		visited[start] = true;
		
		// 큐가 빌 때까지 반복한다.
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");
			
			// 큐에서 꺼낸 노드에 연결된 노드들을 체크한다.
			for(int i=0; i<graph[nodeIndex].length; i++) {
				int tmp = graph[nodeIndex][i];
				
				// 방문하지 않은 노드가 있다면 방문처리 후 큐에 추가한다.
				if(!visited[tmp]) {
					visited[tmp] = true;
					q.offer(tmp);
				} // if
			} // for
		} // while
		
		// 탐색순서를 리턴한다.
		return sb.toString();
	} // bfs
	
} // end class
