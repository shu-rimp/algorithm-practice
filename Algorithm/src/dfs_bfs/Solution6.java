package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// baekjoon2667 단지번호붙이기

public class Solution6 {
	
	static int[][] graph;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };	// 행이동(상, 하)
	static int[] dy = { 0, 0, -1, 1 };	// 열이동(좌, 우)
	static int n;	// 지도 크기
	
	// 좌표정보를 저장하는 클래스
	static class Xy {
		int x;
		int y;
		
		Xy(int x, int y) {
			this.x = x;
			this.y = y;
		} // constructor
	} // end class: point
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		graph = new int[n][n];
		visited = new boolean[n][n];
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<n; j++) {
				graph[i][j] = str.charAt(j) - '0';
			} // for
		} // for
		
		br.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if( graph[i][j] == 1 && !visited[i][j] ) {
					// bfs 호출
					int tmp = bfs(i, j);
					result.add(tmp);
				} // if
			} // for
		} // for
		
		Collections.sort(result);	// 결과를 오름차순으로 정렬
		
		System.out.println(result.size());
		result.forEach((t) -> System.out.println(t));
	} // main
	
	static int bfs(int x, int y) {
		Queue<Xy> q = new LinkedList<>();
		int count = 1;
		
		q.offer(new Xy(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Xy p = q.poll();
			
			// 상, 하, 좌, 우로 이동가능한지 체크 후 방문
			for(int i=0; i<4; i++) {
				int newX = p.x + dx[i];
				int newY = p.y + dy[i];
				
				// 좌표가 지도 크기를 벗어나면 continue
				if(newX < 0 || newY < 0 || newX >= n || newY >= n) {
					continue;
				} // if
				
				// 방문하지 않은 좌표를 큐에 추가하고 방문처리
				if( graph[newX][newY] == 1 && !visited[newX][newY] ) {
					q.offer(new Xy(newX, newY));
					visited[newX][newY] = true;
					
					count++;
				} // if
			} // for
		} // while
		
		return count;
	} // bfs
	
} // end class
