package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon1012 유기농 배추

public class Solution8 {
	
	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static int m;	// 가로
	static int n;	// 세로
	
	// 좌표값 저장 클래스
	static class Xy {
		int x;
		int y;
		
		public Xy(int x, int y) {
			this.x = x;
			this.y = y;
		} // constructor
	} // end class: Xy
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());	// 테스트케이스
		
		// 테스트케이스만큼 반복
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());	// 가로
			n = Integer.parseInt(st.nextToken());	// 세로
			int k = Integer.parseInt(st.nextToken());	// 위치
			
			graph = new int[m][n];
			visited = new boolean[m][n];
			
			// graph 초기화
			for(int j=0; j<k; j++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				graph[x][y] = 1;
			} // for
			
			int count = 0;
			
			// 배추가 있고 방문하지 않았다면 bfs호출
			for(int j=0; j<m; j++) {
				for(int a=0; a<n; a++) {
					if( graph[j][a] == 1 && !visited[j][a] ) {
						bfs(j, a);
						
						// 한번의 탐색이 끝날 때마다 카운트 증가
						count++;
					} // if
				} // for
			} // for
			
			System.out.println(count);
		} // outer for
		
		br.close();
	} // main
	
	static void bfs(int x, int y) {
		Queue<Xy> q = new LinkedList<>();
		
		q.offer(new Xy(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Xy p = q.poll();
			
			for(int i=0; i<4; i++) {
				int newX = p.x + dx[i];
				int newY = p.y + dy[i];
				
				if( newX < 0 || newY < 0 || newX >= m || newY >= n ) {
					continue;
				} // if
				
				if( graph[newX][newY] == 1 && !visited[newX][newY] ) {
					q.offer(new Xy(newX, newY));
					visited[newX][newY] = true;
				} // if
			} // for
		} // while
	} // bfs

} // end class
