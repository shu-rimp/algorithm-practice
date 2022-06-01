package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// baekjoon1927 최소 힙

public class Solution23 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int cal = Integer.parseInt(br.readLine());
			
			if(cal == 0 && q.isEmpty()) {
				sb.append(0).append("\n");
				
				continue;
			} // if
			
			if(cal != 0) {
				q.offer(cal);
			} else {
				sb.append(q.poll()).append("\n");
			} // if-else
		} // for
		
		System.out.println(sb.toString());
	} // main
} // end class
