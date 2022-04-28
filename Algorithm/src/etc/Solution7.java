package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Baekjoon2630 색종이 만들기

public class Solution7 {
	
	// 1. 색이 같은지 확인
	// 2. 색이 같지 않으면 4등분 -> 각각 탐색
	// 3. 1, 2를 색이 모두 같아질 때까지 반복 (재귀)
	static int[][] paper;
	static int white = 0;
	static int blue = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			} // for
		} // for
		
		System.out.println(Arrays.deepToString(paper));
		
		divide(0, 0, n);
		
		System.out.println(white);
		System.out.println(blue);
	} // main
	
	static boolean checkColor(int row, int col, int size) {
		
		int color = paper[row][col];
		
		for(int i=row; i<row + size; i++) {
			for(int j=col; j<col + size; j++) {
				
				// 색이 하나라도 일치하지 않으면 false
				if(paper[i][j] != color) {
					return false;
				} // if
			} // for
		} // for
		
		return true;
	} // checkColor
	
	static void divide(int row, int col, int size) {
		
		if(checkColor(row, col, size)) {
			if(paper[row][col] == 0) {
				white++;
			} else {
				blue++;
			} // if-else
			
			return;
		} // if
		
		size /= 2;	// 사이즈를 절반으로 나눈다.
		
		divide(row, col, size);					// 2사분면
		divide(row, col + size, size);			// 1사분면
		divide(row + size, col, size);			// 3사분면
		divide(row + size, col + size, size);	// 4사분면
	} // divide

} // end class
