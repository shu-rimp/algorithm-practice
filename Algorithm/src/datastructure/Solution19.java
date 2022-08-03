package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// baekjoon1021 회전하는 큐

public class Solution19 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Queue<Integer> nums = new LinkedList<>();
		for(int i=0; i<m; i++) {
			nums.offer(Integer.parseInt(st.nextToken()));
		} // for
		
		LinkedList<Integer> dq = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			dq.add(i); // 위치를 요소로하여 덱 초기화
		} // for
		
		int count = 0;	// 2, 3번 연산의 횟수
		int mid = 0; 	// 2, 3번 연산을 결정하기 위한 중간인덱스값
		
		while(!nums.isEmpty()) {
			int targetIdx = dq.indexOf(nums.peek());
			
			mid = (dq.size() % 2 == 0) ? (dq.size() / 2) - 1 : dq.size() / 2; 
			
			if( targetIdx <= mid ) {	// 중간보다 앞 : 2번연산 수행
				for( int i=0; i<targetIdx; i++) {
					
					int tmp = dq.pollFirst();
					dq.offerLast(tmp);
					
					count++;
				} // for
			} else {	// 중간보다 뒤 : 3번연산 수행
				for( int i=0; i<dq.size() - targetIdx; i++) {
					
					int tmp = dq.pollLast();
					dq.offerFirst(tmp);
					
					count++;
				} // for
			} // if-else
			
			dq.pollFirst();	// 연산이 끝나면 찾은 수를 poll
			nums.poll(); // 수를 저장해둔 큐에서도 poll
		} // while
		
		System.out.println(count);
	} // main

} // end class
