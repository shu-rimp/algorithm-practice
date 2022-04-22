package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Baekjoon14888 연산자 끼워넣기

public class Solution3 {
	
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int[] operator = new int[4];	// [+, -, *, /]
	public static int[] num;
	public static int n;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		} // for
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		} // for
		
		dfs(num[0], 1);
		
		System.out.println(max);
		System.out.println(min);
		
	} // main
	
	public static void dfs(int number, int idx) {
		if(idx == n) {
			max = Math.max(max, number);
			min = Math.min(min, number);
			
			return;
		} // if
		
		for(int i=0; i<4; i++) {
			if(operator[i] > 0) {
				
				operator[i]--;
				
				switch(i) {
				
					case 0 -> dfs(number + num[idx], idx + 1);
					case 1 -> dfs(number - num[idx], idx + 1);
					case 2 -> dfs(number * num[idx], idx + 1);
					case 3 -> dfs(number / num[idx], idx + 1);
					
				} // switch expression
				
				operator[i]++;
			} // if
		} // for
	} // dfs

} // end class
