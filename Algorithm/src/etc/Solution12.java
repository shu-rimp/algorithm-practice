package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// baekjoon11659 구간 합 구하기4

public class Solution12 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 배열 초기화
		st = new StringTokenizer(br.readLine());
		int[] num = new int[n+1];
		for(int i=1; i<=n; i++) {
			
			num[i] = num[i-1] + Integer.parseInt(st.nextToken());
		} // for
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			System.out.println(num[end] - num[start-1]);
		} // for
		
	} // main

} // end class
