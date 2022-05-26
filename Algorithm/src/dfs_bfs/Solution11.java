package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

// baekjoon2468 안전 영역

public class Solution11 {
	
	static int N;	// 배열크기(N*N)
	static int[][] area;
	static boolean[][] visited;
	
	static int[] dx = { -1, 1, 0, 0 };	// 상, 하
	static int[] dy = { 0, 0, -1, 1 };	// 좌, 우
	
	static int safeArea = 0;	// 안전 영역
	
	// 좌표를 저장하는 클래스
	static class Xy {
		int x;
		int y;
		
		Xy (int x, int y) {
			this.x = x;
			this.y = y;
		} // constructor
	} // end class: Xy
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 지역의 높이정보를 저장
		Set<Integer> height = new HashSet<>();
		
		N = Integer.parseInt(br.readLine());
		area = new int[N][N];
		
		// 배열 초기화
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<N; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
			} // for
		} // for
		
		// 배열의 높이정보를 저장
		height.add(0);	// 조건: 아무 지역도 잠기지 않을 수 있다.
		
		for(int[] i : area) {
			for(int j : i) {
				height.add(j);
			} // enhanced for
		} // enhanced for

		int max = -1;
		
		// 각 높이가 잠겼을 때의 bfs탐색
		for(int water: height) {
			visited = new boolean[N][N];	// 높이가 바뀌면 방문여부 초기화
			safeArea = 0;					// 높이가 바뀌면 안전지역 초기화
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if( area[i][j] > water && !visited[i][j] ) {
						bfs(i, j, water);
						
						safeArea++;	// 한번의 bfs탐색이 끝나면 안전지역 카운트
					} // if
				} // for
			} // for
			
			// 최댓값 저장
			if( max < safeArea ) {
				max = safeArea;
			} // if
			
		} // enhanced for
		
		System.out.println(max);
	} // main
	
	static void bfs(int x, int y, int water) {
		Queue<Xy> q = new LinkedList<>();
		
		q.offer(new Xy(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			Xy p = q.poll();
			
			for(int i=0; i<4; i++) {
				int newX = p.x + dx[i];
				int newY = p.y + dy[i];
				
				if( newX < 0 || newX >= N || newY < 0 || newY >= N ) {
					continue;
				} // if
				
				// 새 좌표가 잠긴지역보다 높고 방문하지 않으면 방문처리
				if( area[newX][newY] > water && !visited[newX][newY] ) {
					q.offer(new Xy(newX, newY));
					visited[newX][newY] = true;
				} // if
			} // for
		} // while
	} // bfs
	
} // end class
