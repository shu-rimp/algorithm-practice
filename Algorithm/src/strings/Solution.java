package strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// baekjoon20291 파일정리

public class Solution {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String[] files = new String[n];
		
		for(int i=0; i<files.length; i++) {
			
			st = new StringTokenizer(br.readLine(), ".");
			st.nextToken();				// 첫번째 토큰 생략
			
			files[i] = st.nextToken();
			
		} // for
		
		Arrays.sort(files);
		
		String temp = files[0];
		int count = 0;
		
		for(int i=0; i<files.length; i++) {
			
			if(files[i].equals(temp)) {
				count++;
			} else {
				bw.write(temp + " " + count + "\n");
				bw.flush();
				
				temp = files[i];
				count = 1;
			} // if-else
			
		} // for
		
		bw.write(temp + " " + count + "\n");
		
		bw.flush();
		bw.close();
	} // main
	
} // end class
