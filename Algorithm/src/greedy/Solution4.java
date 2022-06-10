package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// baekjoon1715 카드 정렬하기

public class Solution4 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Long> pq = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			pq.offer(Long.parseLong(br.readLine()));
		} // for
		
		br.close();
		
		long compare = 0;
		while(pq.size() > 1) {
			long bind = pq.poll() + pq.poll();
			compare += bind;
			
			pq.offer(bind);
		} // while
		
		System.out.println(compare);
	} // main
} // end class
