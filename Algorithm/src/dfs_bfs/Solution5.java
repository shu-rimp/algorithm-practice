package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon2606 바이러스

public class Solution5 {
	
	static int[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		// 노드가 1부터 시작하기 때문에 +1
		graph = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		// 연결정보 저장
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			graph[v1][v2] = 1;
			graph[v2][v1] = 1;
		} // for
		
		System.out.println(bfs(1));
	} // main
	
	static int bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		int count = 0;
		
		// 시작 노드 큐에 추가 후 방문처리
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			
			for(int i=1; i<graph.length; i++) {
				int tmp = graph[nodeIndex][i];
				
				// 방문한 적이 없고 연결되어있는 노드라면 방문 처리 후 큐에 추가
				// 카운트 갯수 증가
				if(!visited[i] && tmp == 1) {
					visited[i] = true;
					q.offer(i);
					
					count++;
				} // if
			} // for
		} // while
		
		return count;
	} // bfs

} // end class
