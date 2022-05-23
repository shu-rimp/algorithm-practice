package dfs_bfs;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// bfs를 인접리스트로 구현하는 방법

public class BfsAdjList {
	
	static LinkedList<Integer>[] adjList;
	static boolean[] visited;
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 8;	// 노드(정점)의 갯수
		int m = 5;	// 간선의 갯수
		int v = 1;	// 탐색을 시작할 노드 번호
		
		adjList = new LinkedList[n+1];
		visited = new boolean[n+1];
		
		for(int i=0; i<=n; i++) {
			adjList[i] = new LinkedList<>();
		} // for
		
		for(int i=0; i<m; i++) {
			
			// 간선의 정보를 입력받는다고 가정했을 때
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			
			// 간선은 양방향이기 때문에 양쪽에 저장
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		} // for
		
		for(int i=0; i<=n; i++) {
			// 방문 순서를 위해 오름차순 정렬
			Collections.sort(adjList[i]);
		} // for
		
		System.out.println(bfs(v, adjList, visited));
	} // main
	
	public static String bfs(int start, LinkedList<Integer>[] adjList, boolean[] visited) {
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		
		// 시작노드 방문처리 후 큐에 넣어준다.
		visited[start] = true;
		q.offer(start);
		
		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");
			
			// 큐에서 꺼낸 노드에 연결되어있는 노드들을 체크한다.
			Iterator<Integer> iter = adjList[start].listIterator();
			
			while(iter.hasNext()) {
				int tmp = iter.next();
				
				// 방문하지 않은 노드가 있다면 방문처리 후 큐에 추가한다.
				if(!visited[tmp]) {
					visited[tmp] = true;
					q.offer(tmp);
				} // if
			} // while
		} // while
		
		// 탐색순서를 리턴한다.
		return sb.toString();
	} // bfs

} // end class
