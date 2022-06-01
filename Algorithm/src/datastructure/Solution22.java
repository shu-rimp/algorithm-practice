package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// baekjoon17219 비밀번호 찾기

public class Solution22 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> account = new HashMap<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			account.put(st.nextToken(), st.nextToken());
		} // for
		
		for(int i=0; i<m; i++) {
			String site = br.readLine();
			
			sb.append(account.get(site)).append("\n");
		} // for
		
		br.close();
		System.out.println(sb.toString());
	} // main
} // end class
