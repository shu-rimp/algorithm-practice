package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon5014 스타트링크

public class Solution9 {
	
	// F: 건물높이, S: 시작층, G: 목적지, U: 올라가는층, D: 내려가는층
	static int F, S, G, U, D;
	static int[] elevator;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		F = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		U = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		elevator = new int[F + 1]; // 엘리베이터가 1층부터 시작
		
		int answer = bfs();
		
		if(answer == -1) System.out.println("use the stairs"); 
		else System.out.println(answer); 
	} // main
	
	static int bfs() {
		Queue<Integer> q = new LinkedList<>();
		
		// 시작층 큐에 추가 & 방문처리
		q.offer(S);
		elevator[S] = 1;
		
		while(!q.isEmpty()) {
			int current = q.poll();
			
			// 현재 층이 목적지와 같다면 층 수 리턴
			if(current == G) {
				return elevator[current] - 1;	// 버튼은 2번째부터 누름.
			} // if
			
			// 올라간 층이 건물범위 내이고 방문하지 않았다면 큐에 추가
			// 직전 횟수에서 +1
			if( (current + U) <= F && elevator[current + U] == 0) {
				q.offer(current + U);
				elevator[current + U] = elevator[current] + 1;
			} // if
			
			// 내려간 층이 건물범위 내이고 방문하지 않았다면 큐에 추가
			// 직전 횟수에서 +1;
			if( (current - D) > 0 && elevator[current - D] == 0) {
				q.offer(current - D);
				elevator[current - D] = elevator[current] + 1;
			} // if
		} // while
		
		return -1;
	} // bfs
} // end class
