package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon2178 미로 탐색

public class Solution4 {
	
	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };	// 행이동(상, 하)
	static int[] dy = { 0, 0, -1, 1 };	// 열이동(좌, 우)
	
	static int n;
	static int m;
	
	// x(row), y(col) 좌표값을 저장해두는 클래스
	static class Xy {
		int x;
		int y;
		
		public Xy(int x, int y) {
			this.x = x;
			this.y = y;
		} // constructor
	} // end class: xy
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<m; j++) {
				// char - '0' = 정수변환
				graph[i][j] = str.charAt(j) - '0';
			} // for
		} // for
		
		System.out.println(bfs(0, 0));
	} // main
	
	static int bfs(int x, int y) {
		Queue<Xy> q = new LinkedList<>();
		
		q.offer(new Xy(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Xy d = q.poll();
			
			// 상, 하, 좌, 우로 이동가능한 좌표를 찾고 이동한다.
			for(int i=0; i<4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				// 만약 새 좌표가 0 이하이거나 그래프의 사이즈를 초과하면 continue
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
					continue;
				} // if
				
				// 해당 좌표를 이미 방문했거나, 0(이동할 수 없는 칸)이라면 continue
				if(visited[nextX][nextY] || graph[nextX][nextY] == 0) {
					continue;
				} // if
				
				// 이동가능한 좌표를 큐에 추가한다.
				q.offer(new Xy(nextX, nextY));
				
				// 이동한 좌표를 이전 좌표값에서 1씩 증가한 후, 해당 좌표는 방문처리한다.
				graph[nextX][nextY] = graph[d.x][d.y] + 1;
				visited[nextX][nextY] = true;
			} // for
		} // while
		
		// 이동을 완료했으면 목적지의 이동거리를 반환
		return graph[n-1][m-1];
	} // bfs
	
} // end class
