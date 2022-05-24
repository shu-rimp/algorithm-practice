package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon7569 토마토

public class Solution7 {
	
	static int[][][] tomatoes;
	static int[] dr = { -1, 1, 0, 0, 0, 0 };	// 행이동(상, 하)
	static int[] dc = { 0, 0, -1, 1, 0, 0 };	// 열이동(좌, 우)
	static int[] dh = { 0, 0, 0, 0, -1, 1 };	// 높이이동(위, 아래)
	
	static int H;	// 높이
	static int N;	// 열(세로)
	static int M;	// 행(가로)
	
	static class Move {
		int h;
		int c;
		int r;
		
		public Move(int h, int c, int r) {
			this.h = h;
			this.c = c;
			this.r = r;
		} // constructor
	} // end class: Move
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());	// 가로
		N = Integer.parseInt(st.nextToken());	// 세로
		H = Integer.parseInt(st.nextToken());	// 높이
		
		// 배열 초기화
		tomatoes = new int[H][N][M];
		
		for(int k=0; k<H; k++) {
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0; j<M; j++) {
					tomatoes[k][i][j] = Integer.parseInt(st.nextToken());
				} // for
			} // for
		} // for
		
		br.close();
		
		System.out.println(bfs());
	} // main
	
	static int bfs() {
		Queue<Move> q = new LinkedList<>();
		
		// 익은 토마토가 있으면 큐에 추가
		for(int k=0; k<H; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if( tomatoes[k][i][j] == 1 ) {
						q.offer(new Move(k, i, j));
					}
				} // for
			} // for
		} // for
		
		while(!q.isEmpty()) {
			Move m = q.poll();
			
			// 상, 하, 좌, 우, 위, 아래 탐색
			for(int i=0; i<6; i++) {
				int newH = m.h + dh[i];
				int newC = m.c + dc[i];
				int newR = m.r + dr[i];
				
				// 새 좌표값이 상자의 범위를 벗어날 경우 continue
				if( newH < 0 || newC < 0 || newR < 0 ||
					newH >= H || newC >= N || newR >= M ) {
					continue;
				} // if
				
				// 익지 않은 토마토가 있으면 큐에 추가후 이전 좌표 +1
				if( tomatoes[newH][newC][newR] == 0 ) {
					q.offer(new Move(newH, newC, newR));
					tomatoes[newH][newC][newR] = tomatoes[m.h][m.c][m.r] + 1;
				} // if
			} // for
		} // while
		
		// 최대값 구하기 위해 min_value로 초기값 설정
		int result = Integer.MIN_VALUE;
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					// 익지 않은 토마토가 하나라도 있으면 -1 리턴
					if(tomatoes[i][j][k] == 0) {
						
						return -1;
					} // if
					
					result = Math.max(result, tomatoes[i][j][k]);
				} // for
			} // for
		} // for
		
		// 첫 날을 제외한 result 리턴
		return result - 1;
	} // bfs
	
} // end class
