package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Baekjoon1992 쿼드트리

public class Solution8 {
	
	// 압축형식 출력은 2-1-3-4분면 순
	// 1. 압축이 가능한지 확인(모두 같은 수)
	// 2. 아니면 4등분
	// 3. 모두 압축할 때까지 1, 2를 반복(재귀)
	// 4. 압축단위별로 괄호로 묶는다.
	
	static int[][] video;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		video = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			for(int j=0; j<n; j++) {
				video[i][j] = input.charAt(j) - '0';
			} // for
		} // for
		
		divide(0, 0, n);
		
		System.out.println(sb);
	} // main
	
	static boolean checkZip(int col, int row, int size) {
		int check = video[col][row];
		
		for(int i=col; i<col + size; i++) {
			for(int j=row; j<row + size; j++) {
				
				if(video[i][j] != check) {
					return false;
				} // if
			} // for
		} // for
		
		return true;
	} // checkZip
	
	static void divide(int col, int row, int size) {
		
		if(checkZip(col, row, size)) {
			sb.append(video[col][row]);
			
			return;
		} // if
		
		size /= 2;
		
		sb.append("(");
		
		divide(col, row, size);					// 2사분면
		divide(col, row + size, size);			// 1사분면
		divide(col + size, row, size);			// 3사분면
		divide(col + size, row + size, size);	// 4사분면
		
		sb.append(")");
	} // divide

} // end class
