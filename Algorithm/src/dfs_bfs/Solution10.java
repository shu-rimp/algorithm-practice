package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// baekjoon1697 숨바꼭질

public class Solution10 {
	
	static int N;	// 수빈위치
	static int K;	// 동생위치
	static int[] board;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		sc.close();
		
		// 문제의 최대값으로 배열 크기 설정
		board = new int[100000 + 1];
		
		System.out.println(bfs());
	} // main
	
	static int bfs() {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(N);
		board[N] = 1;
		
		while(!q.isEmpty()) {
			
			int current = q.poll();
			
			if( current == K ) {
				return board[current] - 1;	// 시작할 땐 초를 세지 않음
			} // if
			
			// x+1, x-1, 2x의 경우를 따진다.
			if( (current + 1) < board.length && board[current + 1] == 0 ) {
				q.offer(current + 1);
				board[current + 1] = board[current] + 1;
			} // if
			
			if( (current - 1) >= 0 && board[current - 1] == 0 ) {
				q.offer(current - 1);
				board[current - 1] = board[current] + 1;
			} // if
			
			if( (current * 2) < board.length && board[current * 2] == 0 ) {
				q.offer(current * 2);
				board[current * 2] = board[current] + 1;
			} // if
		} // while
		
		return -1;
	} // bfs
} // end class
