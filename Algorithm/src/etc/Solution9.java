package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Baekjoon1780 종이의 개수

public class Solution9 {
	
	// 1. 모두 같은지 확인
	// 2. 다르면 3등분
	// 3. 각각 비교 9개
	// 4. 같아질 때까지 1,2,3 반복
	
	static int[][] paper;
	static int minusOne = 0;
	static int zero = 0;
	static int one = 0;
	
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
		
		br.close();
		
		divide(0, 0, n);
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
	} // main
	
	static boolean check(int row, int col, int size) {
		int val = paper[row][col];
		
		for(int i=row; i<row + size; i++) {
			for(int j=col; j<col + size; j++) {
				
				if(paper[i][j] != val) {
					return false;
				} // if
			} // for
		} // for
		
		return true;
	} // check
	
	static void divide(int row, int col, int size) {
		
		if(check(row, col, size)) {
			int val = paper[row][col];
			
			if(val == -1) {
				minusOne++;
			} else if(val == 0) {
				zero++;
			} else {
				one++;
			} // if-else if-else
			
			return;
		} // if
		
		size /= 3;
		
		divide(row, col, size);						// (0,0)
		divide(row, col + size, size);				// (0,1)
		divide(row, col + (2 * size), size);		// (0,2)
		
		divide(row + size, col, size);					// (1,0)
		divide(row + size, col + size, size);			// (1,1)
		divide(row + size, col + (2 * size), size);		// (1,2)
		
		divide(row + (2 * size), col, size);				// (2,0)
		divide(row + (2 * size), col + size, size);			// (2,1)
		divide(row + (2 * size), col + (2 * size), size);	// (2,2)
	} // divide

} // end class
