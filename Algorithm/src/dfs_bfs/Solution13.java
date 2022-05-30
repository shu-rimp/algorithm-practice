package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon2573 빙산

public class Solution13 {
	
	static int row;
	static int col;
	
	static int[][] iceberg;
	static boolean[][] visited;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static class Xy {
		int x;
		int y;
		
		public Xy(int x, int y) {
			this.x = x;
			this.y = y;
		} // Xy
	} // end class: Xy
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		iceberg = new int[row][col];
		
		// 배열 초기화
		for(int i=0; i<row; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<col; j++) {
				iceberg[i][j] = Integer.parseInt(st.nextToken());
			} // for
		} // for
		
		int year = 0;
		int area = 0;
		
		while(true) {
			area = 0;	// 해가 넘어가면 area 초기화
			year++;
			
			// 빙산이 모두 녹을 때까지 탈출조건에 부합하지 않으면 0을 출력해야함
			if(isAllMelted()) {
				year = 0;
				
				break;
			} // if
			
			melt();	// 빙산을 녹인 후에 bfs탐색 시작
			visited = new boolean[row][col];	// 해가 넘어가면 방문여부 초기화
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(iceberg[i][j] != 0 && !visited[i][j]) {
						bfs(i, j);
						
						area++;
					} // if
				} // for
			} // for
			
			
			if(area >= 2) {
				break;
			} // if
		} // while
		
		System.out.println(year);
	} // main
	
	static void melt() {
		Queue<Xy> q = new LinkedList<>();
		
		// 필드의 visited에 영향을 받지 않는 새로운 boolean배열 생성
		boolean[][] visited = new boolean[row][col];
		
		// 목표좌표가 아닌 그 주변영역을 탐색해서 녹여야하기 때문에
		// 먼저 0이 아닌 좌표들을 모두 큐에 집어넣고 탐색한다.
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(iceberg[i][j] != 0) {
					q.offer(new Xy(i, j));
					visited[i][j] = true;
				} // if
			} // for
		} // for
		
		while(!q.isEmpty()) {
			
			Xy p = q.poll();
			int melt = 0;
			
			for(int i=0; i<4; i++) {
				int newX = p.x + dx[i];
				int newY = p.y + dy[i];
				
				if(newX < 0 || newX >= row || newY < 0 || newY >= col) {
					continue;
				} // if
				
				if(iceberg[newX][newY] == 0 && !visited[newX][newY]) {
					melt++;
				} // if
			} // for
			
			// 녹은 값이 음수가되면 0으로 대입
			iceberg[p.x][p.y] = (iceberg[p.x][p.y] - melt > 0) ? iceberg[p.x][p.y] - melt : 0;
		} // while
	} // melt
	
	static void bfs(int x, int y) {
		Queue<Xy> q = new LinkedList<>();
		
		q.offer(new Xy(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			
			Xy p = q.poll();
			
			for(int i=0; i<4; i++) {
				int newX = p.x + dx[i];
				int newY = p.y + dy[i];
				
				if(newX < 0 || newX >= row || newY < 0 || newY >= col) {
					continue;
				} // if
				
				if(iceberg[newX][newY] != 0 && !visited[newX][newY]) {
					q.offer(new Xy(newX, newY));
					visited[newX][newY] = true;
				} // if
			} // for
		} // while
	} // bfs
	
	static boolean isAllMelted() {
		for(int[] i : iceberg) {
			for(int j : i) {
				if(j != 0) {
					return false;
				} // if
			} // for
		} // for
		
		return true;
	} // isAllMelted
} // end class
