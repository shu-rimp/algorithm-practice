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
		
		for(int i=0; i<row; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<col; j++) {
				iceberg[i][j] = Integer.parseInt(st.nextToken());
			} // for
		} // for
		
		int year = 0;
		int area = 0;
		
		while(true) {
			visited = new boolean[row][col];
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(iceberg[i][j] != 0 && !visited[i][j]) {
						melt(i, j);
						bfs(i, j);
						
						area++;
						year++;
					} // if
				} // for
			} // for
			
			if(area >= 2) {
				break;
			} // if
		} // while
		
		System.out.println(year);
	} // main
	
	static void melt(int x, int y) {
		Queue<Xy> q = new LinkedList<>();
		visited = new boolean[row][col];
		
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

} // end class
