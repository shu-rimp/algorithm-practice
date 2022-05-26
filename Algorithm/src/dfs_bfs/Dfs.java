package dfs_bfs;

/*
 * dfs : 깊이우선탐색
 * 
 * bfs가 인접노드를 우선으로 탐색하는 방법이라면,
 * dfs는 연결노드를 우선으로 탐색한다.
 * 연결을 따라 계속 파고들어간 후, 더이상 연결된 노드가 없으면 
 * 연결된 노드를 찾을 수 있을 때까지 이전 노드로 돌아간다.
 * 
 * 일반적으로 dfs는 재귀를 사용해서 구현한다.
 */

public class Dfs {
	
	// 그래프가 다음과 같다고 가정할 때,
	// 노드 수만큼 boolean배열 생성
	// 노드가 1부터 시작하므로 0번째 인덱스는 비운다.
	static int[][] graph = { {}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2} };
	static boolean[] visited = new boolean[9];
	
	public static void main(String[] args) {
		// 출력결과 : 1 -> 2 -> 6 -> 8 -> 3 -> 5 -> 4 -> 7 -> 
		dfs(1);
	} // main
	
	static void dfs(int nodeIndex) {
		
		// 방문처리
		visited[nodeIndex] = true;
		
		System.out.print(nodeIndex + " -> ");
		
		for(int node : graph[nodeIndex]) {
			
			// 방문하지 않은 노드에 대해 dfs다시 호출
			if(!visited[node]) {
				dfs(node);
			} // if
		} // enhanced for
	} // dfs

} // end class
