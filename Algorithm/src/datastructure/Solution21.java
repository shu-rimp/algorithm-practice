package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// baekjoon5430 AC

public class Solution21 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		a: for(int i=0; i<t; i++) {
			
			String func = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			Deque<Integer> dq = new LinkedList<>();
			boolean reverse = false;
			
		
			for(int j=0; j<n; j++) {
				dq.offer(Integer.parseInt(st.nextToken()));
			} // for
			
			for(int j=0; j<func.length(); j++) {
				
				char ch = func.charAt(j);
				
				switch(ch) {
					case 'R': 
						reverse = !reverse;
						
						break;
					case 'D': 
						if(dq.isEmpty()) {
							sb.append("error").append("\n");
							
							continue a;
						} // if
						
						if(reverse) {
							dq.pollLast();
						} else {
							dq.pollFirst();
						} // if-else
						
						break;
				} // switch
			} // for
			
			
			sb.append("[");
			
			while(!dq.isEmpty()) {
				
				if(dq.size() == 1) {
					sb.append(dq.pollLast());
					
					break;
				} // if
				
				if(reverse) {
					
					sb.append(dq.pollLast()).append(",");
				} else {
					sb.append(dq.pollFirst()).append(",");
				} // if-else
				
			} // while
			
			sb.append("]").append("\n");
		} // for
		
		System.out.println(sb.toString());
	} // main
} // end class
